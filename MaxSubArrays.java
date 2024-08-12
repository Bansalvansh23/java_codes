public class MaxSubArrays {
    public static void main(String args[]) {
        int[] arr = { 2, 3, 4, 5, 6 };
        //maxsubArrays(arr);
        maxsumArrays(arr);
    }

    //OPTIMAL SOLUTION FOR SAME QUESTION IS TO USE {{PREFIX ARRAY APPROACH}}
    public static void maxsumArrays(int arr[]) {
        int sum =0;
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(sum>maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println("maxSum = "+maxSum);
    }

    // BRUTE FORCE METHOD TO SOLVE SUCH PROBLEMS 
    public static void maxsubArrays(int arr[]) {
        int sum =0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                sum =0;
                for (int k = start; k <= end; k++) {
                    sum += arr[k];
                }
                if(sum>maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println("maxSum = "+maxSum);
    }
}
