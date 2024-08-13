public class Floor {
    private static int floor(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int ans = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] <= target) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, 7, 8, 10, 20, 25, 30, 40 };
        int target = 23;
        System.out.println(floor(arr, target));

    }
}