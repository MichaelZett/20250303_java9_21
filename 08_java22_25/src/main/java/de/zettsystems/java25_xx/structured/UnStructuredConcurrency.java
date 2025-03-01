package de.zettsystems.java25_xx.structured;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Supplier;

public class UnStructuredConcurrency {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        UnStructuredConcurrency app = new UnStructuredConcurrency();
        System.out.println("Un " + app.generateInvoice());
        System.out.println("Struc " + app.generateInvoiceStructured());
    }

    Invoice generateInvoice() throws ExecutionException, InterruptedException {
        try (ExecutorService executorService = Executors.newFixedThreadPool(3)) {
            Future<Issuer> issuer = executorService.submit(this::findIssuer);
            Future<Customer> customer = executorService.submit(this::findCustomer);
            Future<List<Item>> items = executorService.submit(this::findItems);

            return new Invoice(issuer.get(), customer.get(), items.get());
        }
    }

    //    [1]: We create a new StructuredTaskScope with the policy ShutdownOnFailure. If an exception is thrown by findIssuer, findCustomer, or findItems,
    //    each thread will be stopped and an error will be returned.
    //    [2]: Waits for all subtasks in scope to be finished and throws ExecutionException on any failure
    Invoice generateInvoiceStructured() throws ExecutionException, InterruptedException {
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) { // [1]
            Supplier<Issuer> issuer = scope.fork(this::findIssuer);
            Supplier<Customer> customer = scope.fork(this::findCustomer);
            Supplier<List<Item>> items = scope.fork(this::findItems);

            scope.join().throwIfFailed(); // [2]

            return new Invoice(issuer.get(), customer.get(), items.get());
        }
    }

    private List<Item> findItems() {
        return Collections.emptyList();
    }

    private Customer findCustomer() {
        return new Customer();
    }

    private Issuer findIssuer() {
        return new Issuer();
    }
}
