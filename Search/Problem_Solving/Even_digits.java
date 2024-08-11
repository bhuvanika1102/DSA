//LINEAR SEARCH

/*LEETCODE:1295
GIVEN AN ARRAY nums OF INTEGERS,RETURN HOW MANY OF THEM CONTAIN AN EVEN NUMBER OF DIGITS */
public class Even_digits {
    private static int evendigits(int[] nums) {
        int count1 = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            while (nums[i] != 0) {
                nums[i] = nums[i] / 10;
                count++;

            }
            if (count % 2 == 0) {
                count1++;
            }
        }
        return count1;
    }

    public static void main(String[] args) {
        int[] nums = { 12, 345, -21, 6, 7896 };
        System.out.println(evendigits(nums));
    }
}
