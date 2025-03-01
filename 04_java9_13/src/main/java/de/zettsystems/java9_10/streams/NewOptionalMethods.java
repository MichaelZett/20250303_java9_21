package de.zettsystems.java9_10.streams;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class NewOptionalMethods {
    public static void main(String[] args) {
        ifPresentOrElse(Optional.of("Hello Java"));
        orOptional(Optional.empty());
    }

    public List<String> showWithoutStream(Optional<String> optionalValue) {
        List<String> result = optionalValue.map(Collections::singletonList).orElse(Collections.emptyList());
        return result;
    }

    public List<String> showWithStream(Optional<String> optionalValue) {
        List<String> result = optionalValue.stream().toList();
        return result;
    }

    public static void ifPresentOrElse(Optional<String> maybeValue) {
        // Java 8
        if (maybeValue.isPresent()) {
            System.out.println("Value: " + maybeValue.get());
        } else {
            System.out.println("No Value");
        }

        // Java 9
        maybeValue.ifPresentOrElse(
                val -> System.out.println("Value: " + val),
                () -> System.out.println("No Value")
        );
    }

    public static void orOptional(Optional<String> maybeValue) {
        //Java 9

        System.out.println(maybeValue
                .or(() -> Optional.of("default"))
                .get());

        //Java 8
        if (!maybeValue.isPresent()) {
            maybeValue = Optional.of("default");
        }
        System.out.println(maybeValue.get());
    }
}
