import java.util.Arrays;

public class FrstAndLastOccur {

    private static int lowerbound(int[] arr, int target) {
        int ans = arr.length, start = 0, end = ans - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    private static int upperbound(int[] arr, int target) {
        int ans = arr.length, start = 0, end = ans - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    private static int[] occurrence(int[] arr, int target) {
        int first = lowerbound(arr, target);
        int last = upperbound(arr, target) - 1;

        // Check if the target is actually in the array
        if (first <= last && last < arr.length && arr[first] == target && arr[last] == target) {
            return new int[] { first, last };
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, 8, 8, 8, 8, 8, 8, 9, 10 };
        int target = 8;
        int[] result = occurrence(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
