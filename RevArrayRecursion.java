import java.util.Arrays;

public class RevArrayRecursion {
    public static void print(int[] arr, int n) {
        System.out.println(Arrays.toString(arr));
    }

    public static void revArray(int[] arr, int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            revArray(arr, start + 1, end - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = { 1, 2, 3, 4, 5 };
        revArray(arr, 0, n - 1);
        print(arr, n);
    }
}
