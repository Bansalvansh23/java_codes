// this is the best and optimal approach for searching in matrix

public class StairCaseSearching {
    public static void main(String[] args) {
        int[][] matrix = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int key = 30;
        search(matrix, key);
    }

    public static boolean search(int[][] matrix, int key) {
        int row = matrix.length - 1;
        int col = 0;
        while (row >= 0 && col < matrix[0].length - 1) {
            if (key == matrix[row][col]) {
                System.out.println("key found at" + "(" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                row--;
            } else {
                col++;
            }
        }
        System.out.println("key not found");
        return false;
    }
}
