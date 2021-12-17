import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        // TODO: Complete the For Loop
        for (int counter = 0; counter < 5; counter++) {
            System.out.print("Please enter an array element: ");
            arr[counter] = sc.nextInt();
        }


        // Calculate the sum of elements until a 0 is encountered

        int sum_of_elements_until_zero_is_reached = 0;

        // TODO: Complete the Enhanced For Loop including a break keyword
        for (int arrayElement : arr) {
            // TODO: Write breaking condition
            if (arrayElement == 0) {
                break;
            }
            sum_of_elements_until_zero_is_reached += arrayElement;
        }

        System.out.println("The sum of array elements until a 0 is reached: " + sum_of_elements_until_zero_is_reached);


        // Calculate the sum of only the positive elements

        int sum_of_positive_elements = 0;

        // TODO: Complete the Enhanced For Loop including a continue keyword
        for (int arrayElement : arr) {
            // TODO: Write continuing condition
            if (arrayElement <= 0) {
                continue;
            }
            sum_of_positive_elements += arrayElement;
        }

        System.out.println("The sum of positive array elements: " + sum_of_positive_elements);
    }
}