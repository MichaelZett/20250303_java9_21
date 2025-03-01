package de.zettsystems.java11_13.misc;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java11NewMethods {
    public static void main(String[] args) throws IOException {
        collectionToArrayIntFunction();
        not();
    }

    public static void collectionToArrayIntFunction() {
        System.out.println("**************_Collections_**************");
        List<String> sampleList = Arrays.asList("Java", "Kotlin");
        String[] sampleArray = sampleList.toArray(String[]::new);
        String[] sampleArrayOld = sampleList.toArray(new String[0]);

        System.out.println("Arrays are equal: " + (Arrays.equals(sampleArray, new String[]{"Java", "Kotlin"})));
    }

    public static void not() {
        System.out.println("**************_Predicate_**************");
        List<String> sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ");
        List<String> withoutBlanks = sampleList.stream()
                .filter(Predicate.not(String::isBlank))
                .toList();
        System.out.println("Lists are equal: " + (withoutBlanks.equals(List.of("Java", "Kotlin"))));
    }

}
