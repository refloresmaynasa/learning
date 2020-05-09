package eventhandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EventSource extends Thread {
    private List<EventListener> listeners = new ArrayList<>();

    public void registerListener(EventListener eventListener) {
        synchronized(listeners) {
            this.listeners.add(eventListener);
        }
    }

    public void run() {
        Random x = new Random();
        String[] sources = { "Mouse", "Keyboard", "Screen", "Network" };
        while (true) {
            byte[] payloadBytes = new byte[20];
            x.nextBytes(payloadBytes);
            int index = x.nextInt(4);
            String payload = new String(payloadBytes);

            if (index == 0) {
                payload = "mousee ...";
            }

            Event evt = new Event(payload, sources[index]);

            synchronized(listeners) {
                for (EventListener observer : this.listeners) {
                    observer.notifyEvent(evt);
                }
            }

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}