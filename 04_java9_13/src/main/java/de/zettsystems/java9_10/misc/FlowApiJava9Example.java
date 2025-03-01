package de.zettsystems.java9_10.misc;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class FlowApiJava9Example {
    public static void main(String[] args) throws Exception {

        // 1) Einen Publisher erstellen (SubmissionPublisher ist eine Hilfsklasse in Java)
        try (SubmissionPublisher<String> publisher = new SubmissionPublisher<>()) {
            
            // 2) Einen Subscriber definieren (hier eine anonyme Klasse)
            Flow.Subscriber<String> subscriber = new Flow.Subscriber<>() {
                private Flow.Subscription subscription;

                @Override
                public void onSubscribe(Flow.Subscription subscription) {
                    this.subscription = subscription;
                    // Backpressure: Wir wollen 1 Item direkt anfordern
                    subscription.request(1);
                }

                @Override
                public void onNext(String item) {
                    System.out.println("Subscriber empfängt: " + item);
                    // Nächstes Item anfordern
                    subscription.request(1);
                }

                @Override
                public void onError(Throwable throwable) {
                    System.err.println("Fehler im Subscriber: " + throwable);
                }

                @Override
                public void onComplete() {
                    System.out.println("Subscriber ist fertig.");
                }
            };

            // 3) Subscriber am Publisher registrieren
            publisher.subscribe(subscriber);

            // 4) Nun Daten (Items) veröffentlichen
            System.out.println("Veröffentliche Items...");
            publisher.submit("Hallo");
            publisher.submit("Welt");
            publisher.submit("aus Reactive Streams!");

            // 5) Warten, damit alle Items konsumiert werden können
            Thread.sleep(1000);
            System.out.println("Hauptprogramm Ende.");
        }
    }
}
