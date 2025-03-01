package de.zettsystems.java18_21.history;

public sealed interface MessageType {

}

record TextMessage() implements MessageType {


    public String processTextMessage() {
        return "Handled text message.";
    }
}

record ImageMessage() implements MessageType {

    public String processImageMessage() {
        return "Handled image message.";
    }
}

record VideoMessage() implements MessageType {

    public String processVideoMessage() {
        return "Handled video message.";
    }
}
