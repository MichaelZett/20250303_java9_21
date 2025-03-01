package de.zettsystems.history;


import java.util.stream.Stream;

/**
 * Konstanten: Enum
 * Zusammenhängende Werte: parametrierte Collection
 * Schleife: Streams
 * Bedingung: switch statement auf enum
 */
public class JavaExample8 {
    enum MessageType {
        TEXT_MESSAGE, IMAGE_MESSAGE, VIDEO_MESSAGE
    }

    public static void main(String[] args) {
        Stream.of(MessageType.TEXT_MESSAGE, MessageType.IMAGE_MESSAGE, MessageType.VIDEO_MESSAGE)
                .map(JavaExample8::processMessage).forEach(System.out::println);
    }

    private static String processMessage(MessageType messageType) {
        String result;
        switch (messageType) {
            case TEXT_MESSAGE:
                result = "Handling text message.";
                break;
            case IMAGE_MESSAGE:
                result = "Handling image message.";
                break;
            case VIDEO_MESSAGE:
                result = "Handling video message.";
                break;
            default:
                result = "Unknown message type.";
                break;
        }
        return result;
    }
}
