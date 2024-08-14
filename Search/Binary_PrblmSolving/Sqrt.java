public class Sqrt {
    private static int find_sqrt(int target) {
        int start = 1, end = target, ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid * mid <= target) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int target = 70;
        System.out.println(find_sqrt(target));
    }
}
