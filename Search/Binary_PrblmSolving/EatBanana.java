//KOKO EATING BANANAS==>LEETCODE 875
public class EatBanana {
    private static int banana(int[] arr, int target, int num) {
        int n = 0, i = 0, sum = 0;
        while (n < arr.length) {
            double rem = Math.ceil(arr[i] / num);
            sum = (int) (sum + rem);
            i++;
            n++;
        }
        if (sum <= target) {
            return num;
        } else {
            num++;
            return banana(arr, target, num);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 7, 11 };
        int hours = 6;
        System.out.println(banana(arr, hours, 1));
    }

}
