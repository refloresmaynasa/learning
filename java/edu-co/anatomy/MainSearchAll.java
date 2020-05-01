import module2.*;

public class MainSearchAll {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5,4,3,7,8,9,5,7,1,2,6,7,3,2,1,7};
        IntegerSearchAll searcher = new IntegerSearchAll();
        searcher.search(numbers, 7);
    }
}