package de.zettsystems.java18_21.history;


import java.util.stream.Stream;

/**
 * Konstanten: Sealed Classes Hierarchie
 * Zusammenhängende Werte: parametrierte Collection
 * Schleife: Streams
 * Bedingung: pattern matching mit switch-case aus sealed classes
 */
public class JavaExample21 {

    public static void main(String[] args) {
        Stream.of(new TextMessage(), new ImageMessage(), new VideoMessage())
                .map(JavaExample21::processMessage).forEach(System.out::println);
    }

    private static String processMessage(MessageType messageType) {
        return switch (messageType) {
            case TextMessage t -> t.processTextMessage();
            case ImageMessage i -> i.processImageMessage();
            case VideoMessage v -> v.processVideoMessage();
        };
    }
}
