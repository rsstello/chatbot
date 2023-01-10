package br.com.ubot.messenger;

import java.util.List;
import java.util.Map;
import br.com.ubot.messenger.ReceiveEntryEvent;

public class ReceiveEvent {
    //construtor vazio
    public ReceiveEvent() {
    }
    //construtor
    public ReceiveEvent(String object, List<ReceiveEntryEvent> entry) {
        this.object = object;
        this.entry = entry;
    }

    private String object;
    private List <ReceiveEntryEvent> entry;

    //setter e getter
    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public List<ReceiveEntryEvent> getEntry() {
        return entry;
    }

    public void setEntry(List<ReceiveEntryEvent> entry) {
        this.entry = entry;
    }
    //toString
    @Override
    public String toString() {
        return "ReceiveEvent{" +
                "object='" + object + '\'' +
                ", entry=" + entry +
                '}';
    }
}
