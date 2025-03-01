package de.zettsystems.java24.gather;

import java.util.List;
import java.util.stream.Gatherers;

public class Gatherer {
    public static void main(String[] args) {
        List<String> words = List.of("the", "be", "two", "of", "and", "a", "in", "that");
        List<List<String>> groups = groupsOfThree(words);
        System.out.println(groups);
    }

    public static List<List<String>> groupsOfThree(List<String> words) {
        return words.stream()                  // ⟵ Source
                .gather(Gatherers.windowFixed(3))  // ⟵ Intermediate operation
                .toList();                         // ⟵ Terminal operation
    }
}
