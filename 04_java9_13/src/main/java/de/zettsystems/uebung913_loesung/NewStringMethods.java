package de.zettsystems.uebung913_loesung;

public class NewStringMethods {
    public static void main(String[] args) {
        String multiLine = " Hallo \n \n Welt!  \n  ";

        // 1) lines() erspart uns das manuelle split auf "\n"
        // 2) strip() entfernt Whitespace am Anfang/Ende (ähnlich trim(), aber Unicode-freundlicher)
        // 3) isBlank() prüft, ob der gesamte String nur aus Whitespace besteht
        multiLine.lines()
                .map(String::strip)
                .filter(line -> !line.isBlank())
                .forEach(System.out::println);

        // Ausgabe (ohne Leerzeilen):
        // Hallo
        // Welt!
    }
}
