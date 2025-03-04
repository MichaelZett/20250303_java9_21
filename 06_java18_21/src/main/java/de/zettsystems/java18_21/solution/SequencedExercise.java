package de.zettsystems.java18_21.solution;

import java.util.*;

public class SequencedExercise {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("First");
        list.add("Last");

        printFirstLast(list);

        printReversed(list);
    }

    private static void printReversed(List<String> list) {
        System.out.println("Normal: " + list);
        // Mit Pattern Matching prüfen, ob wir ein SequencedCollection haben
        if (list instanceof SequencedCollection<String> sc) {
            // reversed() liefert eine „Live-View” auf die umgekehrte Sequenz
            System.out.println("Reversed: " + sc.reversed());
        } else {
            // Falls nicht SequencedCollection, bleiben wir bei Collections.reverse(...)
            // (in diesem Beispiel wäre das aber nicht mehr nötig)
            // Collections.reverse((List<String>) list);
            System.out.println("Reversed: ??");
        }
    }

    // TODO use new interface and make more easy
    private static void printFirstLast(Collection<String> collection) {
        // Für jede Collection, die SequencedCollection ist,
        // kann man die Methoden getFirst() und getLast() nutzen.
        if (Objects.requireNonNull(collection) instanceof SequencedCollection<String> sc) {
            System.out.println("First: " + sc.getFirst() + " - Last: " + sc.getLast());
        } else {
            System.out.println("Unknown Collection");
        }
    }
}
