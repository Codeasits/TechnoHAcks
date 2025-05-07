import java.util.Scanner;

public class ArrayOperations {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }
    public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {34, 12, 5, 66, 1, 89, 45};

        System.out.println("Original array:");
        displayArray(numbers);

        bubbleSort(numbers);
        System.out.println("Sorted array:");
        displayArray(numbers);

        System.out.print("Enter a number to search: ");
        int target = scanner.nextInt();

        int result = linearSearch(numbers, target);
        if (result != -1) {
            System.out.println(target + " found at index " + result);
        } else {
            System.out.println(target + " not found in the array.");
        }

        scanner.close();
    }
}
