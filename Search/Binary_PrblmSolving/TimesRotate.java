public class TimesRotate {
    private static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    private static int max(int[] arr) {
        int start = 0, end = arr.length - 1, ans = Integer.MAX_VALUE, min_idx = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[start] <= arr[end]) {
                if (arr[start] < ans) {
                    min_idx = start;
                    ans = arr[start];

                }
                break;
            }
            // left sorted
            if (arr[start] <= arr[mid]) {
                if (arr[start] < ans) {
                    min_idx = start;
                    ans = arr[start];
                }
                start = mid + 1;
            } else {
                end = mid - 1;
                if (arr[mid] < ans) {
                    min_idx = mid;
                    ans = arr[mid];
                }

            }
        }
        return min_idx;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 9, 2, 3, 4, 5, 6, };
        System.out.println(max(arr));
    }

}
