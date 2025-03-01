package de.zettsystems.java9_10.complete;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureCompleteAsyncExample {
    public static void main(String[] args) throws InterruptedException {

        // Eigener Thread-Pool für asynchrone Komplettierung
        ExecutorService executor = Executors.newSingleThreadExecutor();

        CompletableFuture<String> future = new CompletableFuture<>();

        // Asynchrone Komplettierung anstoßen (z. B. nach 2 Sekunden)
        future.completeAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // Fehlerbehandlung
                Thread.currentThread().interrupt();
            }
            return "Ergebnis aus completeAsync() nach 2s im eigenen Thread-Pool";
        }, executor);

        // Optional: Weiterverarbeitung
        future.thenAccept(System.out::println);

        // Hauptthread wartet kurz, damit wir die Ausgabe sehen
        Thread.sleep(3000);
        executor.shutdown();
    }
}
