//KOKO EATING BANANAS==>LEETCODE 875
public class EatBanana {
    private static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int banana(int[] arr, int target) {

        int start = 1, end = max(arr);

        while (start <= end) {
            int mid = (start + end) / 2;
            int ans = 0;
            for (int i = 0; i < arr.length; i++) {

                ans += (arr[i] + mid - 1) / mid; // Correct way to calculate hours

            }
            if (ans <= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;

    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 7, 11 };
        int hours = 8;
        System.out.println(banana(arr, hours));
    }

}
