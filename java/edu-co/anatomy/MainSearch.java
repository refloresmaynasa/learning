import module2.*;

public class MainSearch {
    static public void main(String[] args) {
        String[] strings = {"one", "two", "three", "four", "five"};
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        IntegerSearch integerSearch = new IntegerSearch();
        StringSearch stringSearch = new StringSearch();

        System.out.println("Search five result: " + stringSearch.search(strings, "five"));
        System.out.println("Search six result: " + stringSearch.search(strings, "six"));
        System.out.println("Search 6 result: " + integerSearch.search(integers, 6));
        System.out.println("Search 10 result: " + integerSearch.search(integers, 10));
    }
}