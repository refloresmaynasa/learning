package eventhandling;

public class Event {
    private String payload;
    private String source;

    public Event(String payload, String source) {
        this.setPayload(payload);
        this.setSource(source);
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }
}