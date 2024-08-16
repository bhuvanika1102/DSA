public class Smallest_Divisor {
    private static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int smallest_divisor(int[] arr, int threshold) {
        int start = 1, end = max(arr), divisor = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            int answer = 0;
            for (int i = 0; i < arr.length; i++) {
                answer += (int) Math.ceil((double) arr[i] / mid);
            }
            if (answer <= threshold) {
                divisor = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return divisor;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 9 };
        int threshold = 7;
        System.out.println(smallest_divisor(arr, threshold));
    }

}
