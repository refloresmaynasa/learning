package eventhandling;

public class EventDemo {
    public static void main(String[] args) {
        EventSource source = new EventSource();
        source.start();

        EventListener mouseListener = new MouseListener();
        source.registerListener(mouseListener);

        EventListener genericListener = new GenericListener();
        source.registerListener(genericListener);
    }
}

class MouseListener implements EventListener {

    @Override
    public void notifyEvent(Event event) {
        if (event.getSource() != null && event.getSource().equals("Mouse")) {
            System.out.println("Inside mouse listener:::: " + event.getPayload());
        }
    }
}

class GenericListener implements EventListener {

    @Override
    public void notifyEvent(Event event) {
        System.out.println("Inside generic listener:::: " + event.getPayload());
    }
}