package br.com.ubot.messenger;

import java.util.List;
import java.util.Map;

public class ReceiveMessagingEvent {
    public ReceiveMessagingEvent() {
    }

    private Map <String, Object> sender;
    private Map <String, Object> message;

    public ReceiveMessagingEvent(Map<String, Object> sender, Map<String, Object> message) {
        this.sender = sender;
        this.message = message;
    }

    public Map<String, Object> getSender() {
        return sender;
    }

    public void setSender(Map<String, Object> sender) {
        this.sender = sender;
    }

    public Map<String, Object> getMessage() {
        return message;
    }

    public void setMessage(Map<String, Object> message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ReceiveMessagingEvent{" +
                "sender=" + sender +
                ", message=" + message +
                '}';
    }
}
