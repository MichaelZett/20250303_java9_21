package de.zettsystems.java9_10.complete;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureJava9Example {
    public static void main(String[] args) throws Exception {
        
        // Erstellt ein CompletableFuture, das (theoretisch) nie endet,
        // hier simuliert durch ein endloses Warten in einem Thread.
        CompletableFuture<String> future = new CompletableFuture<>();

        System.out.println("Start");
        // Legt einen Timeout fest, nach dem das Future automatisch ein Timeout wirft
        future.orTimeout(3, TimeUnit.SECONDS)
              .exceptionally(ex -> {
                  System.out.println("orTimeout() -> " + ex.getClass());
                  return "Default (Timeout)";
              })
              .thenAccept(result -> System.out.println("Result after orTimeout: " + result));

        System.out.println("Mitte");
        // Alternativ kann man mit completeOnTimeout(...) einen Default-Wert zurückgeben,
        // anstatt eine Exception zu werfen:
        CompletableFuture<String> future2 = new CompletableFuture<>();
        future2.completeOnTimeout("DefaultValue", 3, TimeUnit.SECONDS)
               .thenAccept(result -> System.out.println("Result after completeOnTimeout: " + result));

        // Simuliere, dass wir ein wenig Zeit abwarten
        Thread.sleep(5000);

        // Ende
        System.out.println("Hauptthread beendet.");
    }
}
