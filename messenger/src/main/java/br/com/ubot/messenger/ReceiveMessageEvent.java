package br.com.ubot.messenger;

public class ReceiveMessageEvent {

    private String message;

    public ReceiveMessageEvent() {
    }

    public ReceiveMessageEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ReceiveMessageEvent{" +
                "message='" + message + '\'' +
                '}';
    }
}
