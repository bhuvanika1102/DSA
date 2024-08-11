
//LINEAR SEARCH
import java.util.Arrays;

public class Search_2D {
    private static int[] search2d(int[][] array, int target) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == target) {
                    return new int[] { row, col };

                }
            }

        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[][] array = { { 1, 2, 3, 4 },
                { 5, 3, 4, 6, 7, 8, 3 },
                { 11, 22, 33, 44 },
                { 23, 43 } };
        int target = 43;
        int[] result = search2d(array, target);
        System.out.println(Arrays.toString(result));
    }
}
