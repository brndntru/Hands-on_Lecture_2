import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        // list to store elements in spiral
        List<Integer> spiral = new ArrayList<>();

        // initializes start and end of rows and columns
        int rowStart = 0, rowEnd = matrix.length - 1;
        int colStart = 0, colEnd = matrix[0].length - 1;

        // traverse through matrix in spiral
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // traverse from left to right along top row
            for (int i = colStart; i <= colEnd; i++) {
                spiral.add(matrix[rowStart][i]);
            }
            rowStart++; // move top boundary down

            // traverse from top to bottom along rightmost column
            for (int i = rowStart; i <= rowEnd; i++) {
                spiral.add(matrix[i][colEnd]);
            }
            colEnd--; // move right boundary left

            // if within bounds, traverse from right to left along bottom row
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    spiral.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--; // move bottom boundary up

            // if within bounds, traverse from bottom to top along leftmost column
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    spiral.add(matrix[i][colStart]);
                }
            }
            colStart++; // move left boundary right
        }
        return spiral; // return resulting spiral order
    }
}
