package de.zettsystems.history;

import java.util.Arrays;
import java.util.List;

import static de.zettsystems.history.JavaExample5.MessageType.*;

/**
 * Konstanten: Enum
 * Zusammenhängende Werte: parametrierte Collection
 * Schleife: for-each
 * Bedingung: switch statement auf enum
 */
public class JavaExample5 {
    enum MessageType {
        TEXT_MESSAGE, IMAGE_MESSAGE, VIDEO_MESSAGE;
    }

    public static void main(String[] args) {
        List<MessageType> messageTypes = Arrays.asList(TEXT_MESSAGE, IMAGE_MESSAGE, VIDEO_MESSAGE);

        for (MessageType messageType : messageTypes) {
            System.out.println(processMessage(messageType));
        }
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
