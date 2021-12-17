public class PrimitiveTypesExample {

    public static void swap_integers(int x, int y) {
        System.out.println("first time in swap_integers:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("second time in swap_integers:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void main(String[] args) {

        int x = 3;
        int y = 5;

        System.out.println("first time in main:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        swap_integers(x, y);

        System.out.println("second time in main:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}