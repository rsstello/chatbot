package br.com.ubot.messenger;

public class Messenger {
    private final long id;
    private final String content;

    public Messenger(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
