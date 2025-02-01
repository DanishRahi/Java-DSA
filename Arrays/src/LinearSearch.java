import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.println();
        int size = scanner.nextInt();
        int[] arr = new int[size];

        // Input the elements of the array
        System.out.println();
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the element to search
        System.out.println();
        int num = scanner.nextInt();

        int result = -1;

        // Search for the element in the array
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                result = i;
                break; // exit the loop when the element is found
            }
        }

        // Print the result
        if (result != -1) {
            System.out.println(num + result);
        } else {
            System.out.println(num + " ");
        }

        // Print array elements
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
