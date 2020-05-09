 package module3;

public class StaticPolymorphismDemo implements ISearch {

    protected int overrideEg = 1;

    @Override
    public int compare(int nunm1, int num2) {
        System.out.println("Inside int compare");
        int result = 0;
        return result;
    }

    public int compare(byte num1, byte num2) {
        System.out.println("Inside byte compare");
        return -1;
    }

    @Override
    public int compare(String x, String y) {
        System.out.println("Inside String compare");
        return -1;
    }

    public static void main(String args[]) {
        StaticPolymorphismDemo test = new StaticPolymorphismDemo();
        test.compare((byte) 1, (byte) 2);
        test.compare(1, 2);
        test.compare("Hello", "Jello");
        test.search("Hello", new String[] { "void0", "is" });

        test = new ChildStaticPolymorphims();
        System.out.println("Case variable: " + test.overrideEg);

        ChildStaticPolymorphims testChild = new ChildStaticPolymorphims();
        testChild.search(1f, new float[] { 2f, 4f, 6f });
        testChild.compare(1, 2);

        /*ISearch x = new StaticPolymorphismDemo();
        x = new ChildStaticPolymorphims();*/
    }

    public int search(int key, int[] store) {
        return -1;
    }

    public int search(String key, String[] store) {
        return -1;
    }
}

class ChildStaticPolymorphims extends StaticPolymorphismDemo {

    protected int overrideEg = 2;

    public int search(float key, float[] store) {
        return -1;            
    }

    public int compare(int nunm1, int num2) {
        System.out.println("Inside int compare Child");
        int result = 0;
        return result;
    }

    public int compare(String x, String y) {
        System.out.println("Inside String compare Child");
        return -1;
    }

}