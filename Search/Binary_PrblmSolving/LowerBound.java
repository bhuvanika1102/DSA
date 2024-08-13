//Binary Search
/*Lower Bound ====> arr[i]>=X 
 * TIME COMPLEXITY===>O(logN)
*/
public class LowerBound {
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

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 8, 8, 8, 8, 8, 9, 10 };
        int target = 3;
        System.out.println(lowerbound(arr, target));
    }
}