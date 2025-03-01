package de.zettsystems.java16_17.misc;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Java16StreamToList {

    public List<String> getAllEntriesAsListJava10() {
        return retrieveEntries().stream().collect(Collectors.toUnmodifiableList());
    }

    public List<String> getAllEntriesAsListJava16() {
        return retrieveEntries().stream().toList();
    }

    private Collection<String> retrieveEntries() {
        // Arrays.asList() erzeugt auch UnmodifiableList.
        return Arrays.asList("A", "B");
    }

}
