/**
 * # Implementing bubble sort algorithm
 * def bubble_sort(arr):
 *     n = len(arr)
 *     for i in range(n-1):
 *         for j in range(0, n-i-1):
 *             if arr[j] > arr[j+1]:
 *                 arr[j], arr[j+1] = arr[j+1], arr[j]
 *     return arr
 * data = [64, 34, 25, 12, 22, 11, 90]
 * sorted_data = bubble_sort(data)
 * print("Sorted array is:", sorted_data)
 */
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;


public class BubbleSortApp {
    public static void main(String[] args) {
        // instantiation of bubbleSort Method
        BubbleSort bubbleSorter = new BubbleSort();

        Scanner scanner = new Scanner(System.in);
        out.println("Please enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        out.println("Please enter the elements of the array");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }// end for

        bubbleSorter.bubbleSort(array);
        out.println("The sorted array is: " + Arrays.toString(array));

    }// end main
}// end class BubbleSortApp
