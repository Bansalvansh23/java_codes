public class KadanesAlgo {
    public static void main(String args[]) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(arr);
    }

    public static void kadanes(int arr[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        boolean allNeg = true;
        int maxNeg = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if (arr[i] >= 0) {
                allNeg = false;
            } else {
                maxNeg = Math.max(maxNeg, arr[i]);
            }
            currentSum += arr[i];
            if(currentSum < 0){
                currentSum = 0;
            }
            maxSum = Math.max(currentSum, maxSum);
        }

        if(allNeg){
            System.out.println("maxSum = " + maxNeg);
        } else {
            System.out.println("maxSum = " + maxSum);
        }
    }
}
