package de.zettsystems.java9_10.collections;

import com.google.common.collect.ImmutableList;

import java.util.*;
import java.util.stream.Collectors;

public class Java9UnmodifiableCollectionCreation {
    /**
     * @deprecated use UnmodifiableCollectionCreation#createImmutableCollectionJava instead
     */
    // Deprecation forRemoval ist neu
    @Deprecated(forRemoval = true, since = "Java 9")
    public Collection<String> createImmutableCollection(String first, String second) {
        return ImmutableList.of(first, second);
    }

    // List.of() ist neu - gibt eine unmodifiable Liste zurück
    public Collection<String> createImmutableCollectionJava(String first, String second) {
        return List.of(first, second);
    }

    private Collection<String> retrieveEntries() {
        // Arrays.asList() erzeugt auch UnmodifiableList.
        return Arrays.asList("A", "B");
    }
    public static void main(String[] args) {

        // 1) Java 9: Direkt eine unveränderliche Liste erstellen
        List<String> list = List.of("A", "B", "C");
        System.out.println("List.of(...) -> " + list);
        // list.add("D"); // -> UnsupportedOperationException!

        // 2) Java 9: Unveränderliches Set
        Set<String> set = Set.of("X", "Y", "Z");
        System.out.println("Set.of(...) -> " + set);
        // set.remove("X"); // -> UnsupportedOperationException!

        // 3) Java 9: Unveränderliche Map
        Map<Integer, String> map = Map.of(
                1, "Eins",
                2, "Zwei",
                3, "Drei"
        );
        System.out.println("Map.of(...) -> " + map);
        // map.put(4, "Vier"); // -> UnsupportedOperationException!

        // 4) Versuch, null zu verwenden (führt zu NullPointerException):
        // List.of("A", null, "C"); // -> NPE!
    }

}
