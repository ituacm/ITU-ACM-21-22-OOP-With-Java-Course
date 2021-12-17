public class ReferenceTypesExample {

    public static void swap_integers_in_array(int[] arr) {
        System.out.println("first time in swap_integers:");
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[1] = " + arr[1]);

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println("second time in swap_integers:");
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[1] = " + arr[1]);
    }

    public static void main(String[] args) {

        int[] arr = {3, 5};

        System.out.println("first time in main:");
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[1] = " + arr[1]);

        swap_integers_in_array(arr);

        System.out.println("second time in main:");
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[1] = " + arr[1]);
    }
}