//LEETCODE==>ROSE GARDEN
public class Bouquet {
    private static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    private static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int num_of_days(int[] arr, int m, int k) {
        int min = min(arr), max = max(arr);
        for (int j = min; j <= max; j++) {
            int count = 0; // Number of adjacent bloomed roses
            int bouquets = 0; // Number of bouquets
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= j) {
                    count++;
                } else {
                    if (count >= k) {
                        bouquets += count / k;
                    }
                    count = 0;
                }
            }
            if (count >= k) {
                bouquets += count / k;
            }
            if (bouquets >= m) {
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 7, 7, 7, 13, 11, 12, 7 };
        int m = 2, k = 3;
        System.out.println(num_of_days(arr, m, k));
    }
}