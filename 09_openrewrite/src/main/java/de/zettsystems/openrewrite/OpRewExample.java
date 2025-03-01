package de.zettsystems.openrewrite;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OpRewExample {

    public static void main(String[] args) {

        // Multiline-String auf die klassische Art (Java 11)
        String multilineString = "Hallo,\n"
                + "dies ist ein mehrzeiliger String.\n"
                + "In Java 11 schreiben wir ihn so,\n"
                + "um ihn dann mit OpenRewrite modernisieren zu können.";
        System.out.println(multilineString);

        // Klassische instanceof-Prüfung (vor Pattern Matching)
        Object obj = "Hello World";
        if (obj instanceof String) {
            String s = (String) obj;
            String formattedString = String.format("Objekt ist ein String: %s", s);
            System.out.println(formattedString);
        }

        List<String> list = Stream.of("Hello", "World").collect(Collectors.toUnmodifiableList());

        // Klassisches Switch-Statement (vor Switch Expression)
        int dayOfWeek = 2;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            default:
                System.out.println("Andere Wochentage");
        }
    }
}
