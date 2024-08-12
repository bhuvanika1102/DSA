//LINEAR SEARCH
/*LEETCODE: 1672
 * FIND THE ARRAY WITH MAXIMUN SUM
 */
public class Rich_cust_wealth {
    private static int maximum_wealth(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] array = { { 1, 5 }, { 3, 7 }, { 2, 6 } };
        System.out.println(maximum_wealth(array));
    }
}
