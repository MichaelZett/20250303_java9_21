package de.zettsystems.history;

/**
 * Konstanten: Konstanten von Primitiven
 * Zusammenhängende Werte: array
 * Schleife: (alte) for
 * Bedingung: switch statement nur Primitive
 */
public class JavaExample1 {
    public static final int TEXT_MESSAGE = 0;
    public static final int IMAGE_MESSAGE = 1;
    public static final int VIDEO_MESSAGE = 2;

    public static void main(String[] args) {
        int[] messageTypes = new int[] { TEXT_MESSAGE, IMAGE_MESSAGE, VIDEO_MESSAGE };

        for (int i = 0; i < messageTypes.length; i++) {
            System.out.println(processMessage(messageTypes[i]));
        }
    }

    private static String processMessage(int messageType) {
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
