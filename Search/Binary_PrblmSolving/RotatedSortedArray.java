//Without Duplicates
public class RotatedSortedArray {
    private static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target)
                return mid;
            // left sorted
            if (arr[start] < arr[mid]) {
                if (arr[start] <= target && arr[mid] >= target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // right sorted
            else {
                if (arr[mid] <= target && arr[end] >= target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 9, 1, 2, 3, 4, 5, 6 };
        int target = 8;
        System.out.println(search(arr, target));
    }
}
