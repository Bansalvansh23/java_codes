public class DiagonalSum {
    public static void main(String[] args){
        int[][] matrix = { { 1, 2, 3 }, { 5, 6, 7 }, { 9, 10, 11 } };
        System.out.println(brueteSol(matrix));
        System.out.println(optimalSol(matrix));
    }
    public static int brueteSol(int[][] matrix ){
        // Time Complexity is O(n^2)
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static int optimalSol(int[][] matrix){
        // Time Complexity is O(n)
        int sum =0;
        for(int i=0;i<matrix.length;i++){
            sum += matrix[i][i];

            if(i!=matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
}
