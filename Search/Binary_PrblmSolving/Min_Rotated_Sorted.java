public class Min_Rotated_Sorted {
    private static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    private static int max(int[] arr) {
        int start = 0, end = arr.length, ans = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = (start + end) / 2;
            // left sorted
            if (arr[start] <= arr[mid]) {
                ans = min(ans, arr[start]);
                start = mid + 1;
            } else {
                ans = min(ans, arr[mid]);
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 9, 2, 3, 4, 5, 6, };
        System.out.println(max(arr));
    }

}
