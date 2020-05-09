import module3.MySearchHelper;

public class mainApp {
    public static void main(String[] args) {
        Double[] numbers = {12.4,1.5,6d,8d,3.2,1.5,1.5};
        Integer[] indexes = MySearchHelper.search(numbers, 1.5);
        for (Integer index : indexes) {
            System.out.println("index: " + index);
        }
    }
}