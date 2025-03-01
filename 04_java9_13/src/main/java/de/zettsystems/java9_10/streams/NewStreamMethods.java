package de.zettsystems.java9_10.streams;


import java.util.List;
import java.util.stream.Stream;

public class NewStreamMethods {
    public static void main(String[] args) {

        // Beispiel-Daten
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1) takeWhile(...)
        //    Nimmt so lange Elemente, bis das Prädikat false liefert
        System.out.println("takeWhile(x < 5):");
        numbers.stream()
                .takeWhile(x -> x < 5)
                .forEach(System.out::println);
        // Ausgabe: 1, 2, 3, 4

        // 2) dropWhile(...)
        //    Überspringt so lange Elemente, bis das Prädikat false wird,
        //    gibt danach den Rest aus
        System.out.println("\ndropWhile(x < 5):");
        numbers.stream()
                .dropWhile(x -> x < 5)
                .forEach(System.out::println);
        // Ausgabe: 5, 6, 7, 8, 9, 10

        // 3) ofNullable(...)
        //    Erzeugt einen Stream mit genau 1 Element, wenn das Objekt != null ist
        //    Ist es null, wird ein leerer Stream erzeugt
        System.out.println("\nofNullable-Beispiel:");
        String mayBeNull = null; // oder "Hallo!"
        Stream.ofNullable(mayBeNull)
                .forEach(System.out::println);
        // Ausgabe: (keine, da null => leerer Stream)

        // 4) iterate(seed, hasNext, next)
        //    Erzeugt einen endlichen Stream (nicht mehr unendlich wie bisheriges iterate)
        System.out.println("\niterate(1, x -> x <= 10, x -> x + 1):");
        Stream.iterate(1, x -> x <= 10, x -> x + 1)
                .forEach(System.out::println);
        // Ausgabe: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    }
}
