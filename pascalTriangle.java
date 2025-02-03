import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        // list to store rows
        List<List<Integer>> triangle = new ArrayList<>();

        // loop through each row
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(); // new list for current row

            // iterate through each position in current row
            for (int j = 0; j <= i; j++) {
                // set first and last elements of each row to 1
                if (j == 0 || j == i) {
                    row.add(1);
                }
                // set other elements in between to sum of two elements above it
                else {
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row); // add row to triangle list
        }
        return triangle;
    }
}
