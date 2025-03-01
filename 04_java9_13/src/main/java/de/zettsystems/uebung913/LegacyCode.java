package de.zettsystems.uebung913;

import java.util.*;

public class LegacyCode {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Teilaufgabe A: Manuelle Schleife
        for (int n : numbers) {
            if (n >= 5) {
                break;
            }
            System.out.println(n);
        }

        // Teilaufgabe B: Noch eine Schleife, die alles ignoriert bis n >= 5
        boolean skip = true;
        for (int n : numbers) {
            if (skip && n >= 5) {
                skip = false;
            }
            if (!skip) {
                System.out.println(n);
            }
        }
    }


    public List<String> getNames() {
        List<String> temp = new ArrayList<>();
        temp.add("Alice");
        temp.add("Bob");
        temp.add("Carol");
        return Collections.unmodifiableList(temp);
    }

    public void print() {
        Optional<String> maybeValue = getOptionalValue();

        if (maybeValue.isPresent()) {
            System.out.println("Wert vorhanden: " + maybeValue.get());
        } else {
            System.out.println("Kein Wert!");
        }
    }

    private static Optional<String> getOptionalValue() {
        // Kann leer oder gefüllt sein
        return Math.random() > 0.5
                ? Optional.of("Hello Java 8")
                : Optional.empty();
    }

}
