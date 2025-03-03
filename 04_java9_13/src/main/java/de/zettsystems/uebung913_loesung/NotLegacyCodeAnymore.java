package de.zettsystems.uebung913_loesung;

import java.util.*;

public class NotLegacyCodeAnymore {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Teilaufgabe A:
        // "solange n < 5 ausgeben, dann abbrechen"
        System.out.println("takeWhile(n < 5):");
        numbers.stream()
                .takeWhile(n -> n < 5)
                .forEach(System.out::println);

        // Teilaufgabe B:
        // "alles ignorieren, bis n >= 5, dann ab da ausgeben"
        System.out.println("\ndropWhile(n < 5):");
        numbers.stream()
                .dropWhile(n -> n < 5)
                .forEach(System.out::println);
    }

    public List<String> getNames() {
        return List.of("Alice", "Bob", "Carol");
    }

    public void print() {
        Optional<String> maybeValue = getOptionalValue();

        // 1) ifPresentOrElse
        maybeValue.ifPresentOrElse(
                val -> System.out.println("Wert vorhanden: " + val),
                ()  -> System.out.println("Kein Wert!")
        );

        // 2) or(...) - Fallback-Optional
        Optional<String> fallback = Optional.of("Fallback-Wert");
        Optional<String> combined = maybeValue.or(() -> fallback);
        System.out.println("Ergebnis von or(...): " + combined.orElse("(leer)"));

        // 3) optional.stream() – ggf. Weiterverarbeitung im Stream
        maybeValue.stream()
                .map(String::toUpperCase)
                .forEach(str -> System.out.println("UpperCase: " + str));
    }

    private static Optional<String> getOptionalValue() {
        // Kann leer oder gefüllt sein
        return Math.random() > 0.5
                ? Optional.of("Hello Java 8")
                : Optional.empty();
    }

}
