import java.util.Scanner;

public class TaskAlgorithm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Condition 1: If the entered number is greater than 7, then print “Hello”
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 7) {
            System.out.println("Hello");
        }

        // Condition 2: If the entered name matches “John”, then output “Hello, John”,
        // if not, then output "There is no such name"
        scanner.nextLine(); // Consume newline character left by nextInt()
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        if (name.equals("John")) {
            System.out.println("Hello, John");
        } else {
            System.out.println("There is no such name");
        }

        // Condition 3: There is a numeric array at the input,
        // it is necessary to output array elements that are multiples of 3
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] array = new int[length];
        System.out.println("Enter array elements:");

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Array elements that are multiples of 3:");

        for (int num : array) {
            if (num % 3 == 0) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
