package de.zettsystems.java11_13.misc;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java12NewMethods {
    public static void main(String[] args) {
        teeing();
        numberFormat();
    }

    /**
     * 2 downstream collectoren und eine merge-Funktion
     */
    public static void teeing() {
        System.out.println("**************_Collectors_**************");
        double mean = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .collect(Collectors.teeing(Collectors.summingDouble(i -> i),
                        Collectors.counting(), (sum, count) -> sum / count));
        System.out.println("Mittelwert ist: " + mean);
    }


    public static void numberFormat() {
        System.out.println("**************_Number Format_**************");
        NumberFormat likesShort =
                NumberFormat.getCompactNumberInstance(Locale.of("de", "DE"), NumberFormat.Style.SHORT);
        likesShort.setMaximumFractionDigits(2);
        System.out.println("Short Format: " + likesShort.format(1887));

        NumberFormat likesLong =
                NumberFormat.getCompactNumberInstance(Locale.of("de", "DE"), NumberFormat.Style.LONG);
        likesLong.setMaximumFractionDigits(2);
        System.out.println("Long Format: " + likesLong.format(1887));
    }

}
