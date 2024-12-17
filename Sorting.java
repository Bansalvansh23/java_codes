import java.util.*;

public class Sorting {
    public static void main(String args[]) {
        int[] arr = { 5, 2, 0, 1, 9, 1, 3, 2, 1, 0 };
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countingSort(arr);
        System.out.println("The sorted array through bubble sort is: " + Arrays.toString(arr));
    }

    public static int[] bubbleSort(int[] arr) {
        // Time Complexity is O(n^2)
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
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        // Time Complexity is O(n^2)
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    public static int[] insertionSort(int arr[]) {
        // Time Complexity is O(n^2)
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int pre = i - 1;
            // Finding position
            while (pre >= 0 && arr[pre] > current) {
                arr[pre + 1] = arr[pre];
                pre--;
            }
            // inserting the element
            arr[pre + 1] = current;
        }
        return arr;
    }

    public static int[] countingSort(int arr[]) {
        // Time Complexity is O(n+range)
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        return arr;
    }
}
