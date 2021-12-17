public class Main {

    // Returns the sum of 2 int variables taken as parameters
    public static int calculate_sum(int a, int b) {
        return a + b;
    }

    // TODO: Write overloaded method to calculate sum of 2 double variables
    public static double calculate_sum(double a, double b) {
        return a + b;
    }

    // TODO: Write overloaded method to calculate sum of 3 integer variables
    public static int calculate_sum(int a, int b, int c) {
        return a + b + c;
    }


    public static void main(String[] args) {

        int int_sum = calculate_sum(3, 5);

        double double_sum = calculate_sum(4.2, 2.5);

        System.out.println(int_sum + " " + double_sum);
    }
}