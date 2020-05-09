package module3;

import java.util.ArrayList;
import java.util.List;

public class ScanRandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(GenerateArray(100));
        Notifier notifier = new Notifier();
        scanner.registerNotifier(notifier);
        scanner.run();
    }

    private static double[] GenerateArray(int size) {
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = Math.random();
        }
        return result;
    }
}

class Scanner extends Thread {
    private List<INotifier> notifiers = new ArrayList<>();
    private double[] numbers;

    public Scanner(double[] numbers) {
        super();
        this.numbers = numbers;
    }

    public void registerNotifier(INotifier notifier) {
        synchronized(notifiers) {
            this.notifiers.add(notifier);
        }
    }

    public void run() {
        for (double i : this.numbers) {
            String numberString = String.valueOf(i);
            Integer dig = numberString.length() > 6 ? Integer.valueOf(numberString.substring(numberString.indexOf('.')+4, 6)) : 0;
            if (dig > 0 && dig%2 == 0) {
                Event event = new Event("10000th decimal place is even number", numberString);
                synchronized(this.notifiers) {
                    for (INotifier iNotifier : notifiers) {
                        iNotifier.notify(event);
                    }
                }
            }
        }
    }
}

class Event {
    private String source;
    private String payload;

    public Event(String payload, String source) {
        this.source = source;
        this.payload = payload;
    }

    public String getSource() {
        return source;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public void setSource(String source) {
        this.source = source;
    }
}

interface INotifier {
    void notify(Event event);
}

class Notifier implements INotifier {
    @Override
    public void notify(Event event) {
        System.out.println("Source: " + event.getSource() + "| Message: " + event.getPayload());
    }

}