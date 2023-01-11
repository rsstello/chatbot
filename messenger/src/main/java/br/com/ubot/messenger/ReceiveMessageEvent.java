package br.com.ubot.messenger;

public class ReceiveMessageEvent {

    private String text;

    public ReceiveMessageEvent() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ReceiveMessageEvent(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "ReceiveMessageEvent{" +
                "text='" + text + '\'' +
                '}';
    }
}
