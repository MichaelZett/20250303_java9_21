package de.zettsystems.java16_17.records;

public class CheckCustomer {
    public static void main(String[] args) {
        CustomerRecordMitAlles customerRecordMitAlles = new CustomerRecordMitAlles("Peter", false);

        if (customerRecordMitAlles.isVip()) {
            System.out.println("Lombok works but only on a field.");
        }
    }
}
