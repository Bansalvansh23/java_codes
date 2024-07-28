public class ReverseArray {
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static int reverseArray(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        return -1;
    }
}
