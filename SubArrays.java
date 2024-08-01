public class SubArrays {
    public static void main(String args[]) {
        int[] arr = { 2, 3, 4, 5, 6 };
        subArrays(arr);
    }

    public static void subArrays(int arr[]) {
        int totalSubArrays = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    totalSubArrays++;
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println("The total number of subarray are: " + totalSubArrays);
        }
    }
}
