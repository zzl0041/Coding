package Ronnie;

public class LongestCrossOf1s {
    public static int findLargestCross(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int maxArmLength = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == 1) {
                    int armLength = findArmLength(matrix, row, col);
                    maxArmLength = Math.max(maxArmLength, armLength);
                }
            }
        }
        return maxArmLength;
    }

    private static int findArmLength(int[][] matrix, int row, int col) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int armLength = 0;
        while (row - armLength >= 0 && row + armLength < rows &&
                col - armLength >= 0 && col + armLength < cols &&
                matrix[row - armLength][col] == 1 &&
                matrix[row + armLength][col] == 1 &&
                matrix[row][col - armLength] == 1 &&
                matrix[row][col + armLength] == 1) {
            armLength++;
        }
        return armLength;
    }

    public static void main(String[] args) {
        System.out.println(findLargestCross(new int[][]{{0,0,0,0},{1,1,1,1},{0,1,1,1},{1,0,1,1}}));
    }
}
