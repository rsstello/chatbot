package br.com.ubot.messenger;

import java.util.List;
import java.util.Map;

public class ReceiveEntryEvent {

    private String id;
    private Long time;
    private List <ReceiveMessagingEvent> messaging;

    public ReceiveEntryEvent() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public List<ReceiveMessagingEvent> getMessaging() {
        return messaging;
    }

    public void setMessaging(List<ReceiveMessagingEvent> messaging) {
        this.messaging = messaging;
    }

    public ReceiveEntryEvent(String id, Long time, List<ReceiveMessagingEvent> messaging) {
        this.id = id;
        this.time = time;
        this.messaging = messaging;
    }

    @Override
    public String toString() {
        return "ReceiveEntryEvent{" +
                "id='" + id + '\'' +
                ", time=" + time +
                ", messaging=" + messaging +
                '}';
    }



}
