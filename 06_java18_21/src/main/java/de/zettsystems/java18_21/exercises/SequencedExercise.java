package de.zettsystems.java18_21.exercises;

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
        // TODO use new method
        Collections.reverse(list);
        System.out.println("Reversed: " + list);
    }

    // TODO use new interface and make more easy
    private static void printFirstLast(Collection<String> collection) {
        switch (collection) {
            case List<String> l -> System.out.println("First: " + l.get(0) + " - Last: " + l.get(l.size() - 1));
            case SortedSet<String> s -> System.out.println("First: " + s.first() + " - Last: " + s.last());
            case Deque<String> d -> System.out.println("First: " + d.getFirst() + " - Last: " + d.getLast());
            default -> System.out.println("Unknown Collection");
        }
    }
}
