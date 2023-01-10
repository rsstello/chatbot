package br.com.ubot.messenger;

import java.util.Map;

public class ReceiveSenderEvent {

    private String id;

    public ReceiveSenderEvent() {
    }

    public ReceiveSenderEvent(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ReceiveSenderEvent{" +
                "id='" + id + '\'' +
                '}';
    }
}
