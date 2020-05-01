package module2;

public class IntegerSearchAll {
    public void search(final Integer[] numbers, final Integer number) {
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i].equals(number)) {
                System.out.println("Number " + number + " found in index " + i);
            }
        }
    }
}