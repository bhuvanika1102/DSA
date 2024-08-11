//LINEAR SEARCH
public class Max_2d {
    private static int max2d(int[][] array) {
        int max = array[0][0];// or int max=Integer.MIN_VALUE
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] > max) {
                    max = array[row][col];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] array = { { 1, 2, 3, 4 },
                { 5, 3, 4, 6, 7, 8, 3 },
                { 11, 22, 33, 100 },
                { 23, 43 } };
        System.out.println(max2d(array));
    }

}
