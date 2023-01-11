package br.com.ubot.messenger;

import java.util.List;
import java.util.Map;

import br.com.ubot.messenger.ReceiveSenderEvent;
import br.com.ubot.messenger.ReceiveMessageEvent;

public class ReceiveMessagingEvent {
    public ReceiveMessagingEvent() {
    }


    private ReceiveSenderEvent sender;
    private ReceiveMessageEvent message;
    //private Map<String, Object> message;


    public ReceiveMessagingEvent(ReceiveSenderEvent sender, ReceiveMessageEvent message) {
        this.sender = sender;
        this.message = message;
    }

    public ReceiveSenderEvent getSender() {
        return sender;
    }

    public void setSender(ReceiveSenderEvent sender) {
        this.sender = sender;
    }

    public ReceiveMessageEvent getMessage() {
        return message;
    }

    public void setMessage(ReceiveMessageEvent message) {
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

