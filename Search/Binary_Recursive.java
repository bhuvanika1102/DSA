public class Binary_Recursive {
    private static int recursive(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (target > arr[mid]) {
            return recursive(arr, target, mid + 1, end);
        } else if (target < arr[mid]) {
            return recursive(arr, target, start, mid - 1);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 9;
        System.out.println(recursive(arr, target, 0, arr.length));
    }
}
