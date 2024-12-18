public class SpiralMatrix {
    public static void main(String[] args) {
        // Time Complexity is O(n*m)
        int[][] matrix = { { 1, 2, 3 }, { 5, 6, 7 }, { 9, 10, 11 } };
        printSpiral(matrix);
    }

    public static void printSpiral(int[][] matrix) {
        int sr = 0;
        int sc = 0;
        int er = matrix.length - 1;
        int ec = matrix[0].length - 1;
        while (sr <= er && sc <= ec) {
            // TOP
            for (int j = sc; j < ec + 1; j++) {
                System.out.print(matrix[sr][j] + " ");
            }

            // RIGHT
            for (int i = sr + 1; i <= er; i++) {
                System.out.print(matrix[i][ec] + " ");
            }

            // BOTTOM
            if (sr == er) {
                break;
            }
            for (int j = ec - 1; j >= sc; j--) {
                System.out.print(matrix[er][j] + " ");
            }

            // LEFT
            if (sc == ec) {
                break;
            }
            for (int i = er - 1; i >= sr + 1; i--) {
                System.out.print(matrix[i][sc] + " ");
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
        System.out.println();
    }
}
