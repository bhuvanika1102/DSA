public class Peek {
    private static int Peek_element(int[] arr) {
        int start = 1, end = arr.length - 2, n = arr.length;
        if (n == 1)
            return arr[0];
        if (arr[0] > arr[1])
            return arr[0];
        if (arr[n - 1] > arr[n - 2])
            return arr[n - 1];
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            } else {
                if (arr[mid] > arr[mid - 1]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 13, 14, 5, 4, 3, 2, 1 };
        System.out.println(Peek_element(arr));
    }
}
