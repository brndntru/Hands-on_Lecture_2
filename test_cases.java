import java.util.List;

public class test_cases {
        public static void main(String[] args) {
                // Test Case: Pascal's Triangle
                pascalsTriangle pascalsTriangleTest = new pascalsTriangle();
                int numRows = 5;
                List<List<Integer>> pascalResult = pascalsTriangleTest.generate(numRows);
                System.out.println("Pascal's Triangle:");
                for (List<Integer> row : pascalResult) {
                        System.out.println(row);
                }

                System.out.println();

                // Test Case: Spiral Matrix
                spiralMatrix spiralMatrixTest = new spiralMatrix();
                int[][] matrix = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
                List<Integer> spiralResult = spiralMatrixTest.spiralOrder(matrix);
                System.out.println("Spiral Order: " + spiralResult);
        }
}