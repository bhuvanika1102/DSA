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
        int mini = 1, maxi = max(arr);
        for (int j = mini; j <= maxi; j++) {
            int answer = 0;
            for (int i = 0; i < arr.length; i++) {
                answer += (int) Math.ceil((double) arr[i] / j);

            }
            if (answer <= threshold) {
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 9 };
        int threshold = 6;
        System.out.println(smallest_divisor(arr, threshold));
    }

}
