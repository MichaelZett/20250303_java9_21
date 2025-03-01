package de.zettsystems.java11_13.strings;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringNewMethods {
    public static void main(String[] args) throws IOException {
        indentTransformRepeatMethods();
        moreStringMethods();
    }

    /**
     * indent, transform, repeat
     */
    public static void indentTransformRepeatMethods() {
        String text = "Hello World!\nDas hier ist Java 12.";

        text = text.indent(4);
        System.out.println(text);

        text = text.indent(-10);
        System.out.println(text);

        String transformed = text.transform(value ->
                new StringBuilder(value).reverse().toString()
        );
        System.out.println(transformed);

        System.out.println("Repeat".repeat(7));
    }

    /**
     * isBlank, lines, strip, stripLeading, stripTrailing
     */
    public static void moreStringMethods() {
        String multilineString = "First part \n \n second \n third.";
        List<String> lines = multilineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .toList();
        final List<String> expected = List.of("First part", "second", "third.");
        System.out.println("Lists are equal: " + (lines.equals(expected)));

        System.out.print("Start    -");
        System.out.print("    Strip    ".stripLeading());
        System.out.print("-Middle-");
        System.out.print("    Strip    ".stripTrailing());
        System.out.println("-End");
    }

}
