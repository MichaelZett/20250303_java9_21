package de.zettsystems.uebung913;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class SomeClass {
    public static void main(String[] args) {
        final List<String> aList = Arrays.asList("a", "b", "c", "   ", "a", "z", "a", "e", "b");
        final Optional<String> result = retrieveMaxOccurance(aList);
        // TODO use new Java Api for Optional
        System.out.println("Am häufigsten kommt vor: " + result.get());

        String[] anArray = convertToArray(aList);
        Arrays.stream(anArray).forEach(System.out::println);

        // TODO isn't there something in new Java Api String and Predicate?
        aList.stream().filter(SomeClass::isNotBlank).forEach(System.out::println);
    }

    private static boolean isNotBlank(String string) {
        return string != null && !string.trim().isEmpty();
    }

    // TODO use new Java Api in collections package
    public List<String> createAnUnmodifiableList() {
        return ImmutableList.of("OneString", "TwoString");
    }

    // TODO use new Java Api in collections package
    public Set<String> createAnUnmodifiableSet() {
        return ImmutableSet.of("OneString", "TwoString");
    }

    // TODO use new Java Api in collections package
    public Map<String, String> createAnUnmodifiableMap() {
        return ImmutableMap.of("Key", "Value");
    }

    // TODO too hard to read - use new Java Api
    public static Optional<String> retrieveMaxOccurance(List<String> strings) {
        Map<String, Long> freqMap = strings.stream()
                .collect(groupingBy(s -> s, counting()));
        Optional<Map.Entry<String, Long>> maxEntryOpt = freqMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        return maxEntryOpt.map(Map.Entry::getKey);
    }

    // TODO there is something in the Java Api for that and it got a new Parameter
    public static String[] convertToArray(List<String> sampleList) {
        String[] sampleArray = new String[sampleList.size()];
        for (int i = 0; i < sampleList.size(); i++) {
            sampleArray[i] = sampleList.get(i);
        }

        return sampleArray;
    }

}
