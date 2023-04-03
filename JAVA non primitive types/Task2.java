import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        // initializing an array with 10 elements
        int[] arr = new int[10];

        // Fill the array with random numbers from 1 to 100
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }

        // Find the smallest and largest element from current array
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Print the smallest and largest
        System.out.println("Array elements :");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nMinimum element => " + min);
        System.out.println("Maximum element => " + max);
    }
}
