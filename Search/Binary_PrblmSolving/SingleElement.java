public class SingleElement {
    private static int single_element(int[] arr) {
        int start = 1, end = arr.length - 2;
        int n = arr.length;
        if (arr.length == 1)
            return arr[0];
        if (arr[1] != arr[0])
            return arr[0];
        if (arr[n - 1] != arr[n - 2])
            return arr[n - 1];
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
                return arr[mid];
            }
            if (mid % 2 == 0 && arr[mid] == arr[mid - 1] || mid % 2 == 1 && arr[mid] == arr[mid + 1]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5, 5 };
        System.out.println(single_element(arr));
    }
}
