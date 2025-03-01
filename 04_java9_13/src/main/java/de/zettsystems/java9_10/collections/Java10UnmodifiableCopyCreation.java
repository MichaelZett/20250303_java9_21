package de.zettsystems.java9_10.collections;

import java.util.*;
import java.util.stream.Collectors;

public class Java10UnmodifiableCopyCreation {

    public Set<String> getAllEntriesAsSet() {
        final Collection<String> entries = retrieveEntries();
        return Set.copyOf(entries);
    }

    public List<String> getAllEntriesAsUnmodifiableListJava10() {
        return retrieveEntries().stream().collect(Collectors.toUnmodifiableList());
    }

    public List<String> getAllEntriesAsModifiableListJava8() {
        return retrieveEntries().stream().collect(Collectors.toList());
    }

    private Collection<String> retrieveEntries() {
        // Arrays.asList() erzeugt auch UnmodifiableList.
        return Arrays.asList("A", "B");
    }
    public static void main(String[] args) {

        //copyOf(...) – unmodifiable Kopie aus vorhandener Collection
        List<String> anotherList = List.of("Hallo", "Welt");
        List<String> copiedList = List.copyOf(anotherList);
        // Falls die Eingabe schon unmodifiable war,
        // gibt copyOf(...) genau dieses Objekt zurück.
        System.out.println("List.copyOf(...) -> " + copiedList);

    }

}
