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

// bubble sorter
public class BubbleSort {
    public int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }// end if
            }// end nested for
        }// end for
        return arr;
    }// end bubbleSort Method
}// end BubbleSort Class
