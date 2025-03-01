package de.zettsystems.history;


import java.util.stream.Stream;

/**
 * Konstanten: Enum
 * Zusammenhängende Werte: parametrierte Collection
 * Schleife: Streams
 * Bedingung: switch expression auf enum
 */
public class JavaExample17 {
    enum MessageType {
        TEXT_MESSAGE, IMAGE_MESSAGE, VIDEO_MESSAGE
    }

    public static void main(String[] args) {
        Stream.of(MessageType.TEXT_MESSAGE, MessageType.IMAGE_MESSAGE, MessageType.VIDEO_MESSAGE)
                .map(JavaExample17::processMessage).forEach(System.out::println);
    }

    private static String processMessage(MessageType messageType) {
        return switch (messageType) {
            case TEXT_MESSAGE -> "Handling text message.";
            case IMAGE_MESSAGE -> "Handling image message.";
            case VIDEO_MESSAGE -> "Handling video message.";
        };
    }
}
