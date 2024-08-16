public class Bouquet {
    private static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    private static boolean canMakeBouquets(int[] arr, int m, int k, int day) {
        int count = 0; // Number of adjacent bloomed roses
        int bouquets = 0; // Number of bouquets

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                count++;
            } else {
                if (count >= k) {
                    bouquets += count / k;
                }
                count = 0;
            }
            if (bouquets >= m) {
                return true;
            }
        }
        if (count >= k) {
            bouquets += count / k;
        }
        return bouquets >= m;
    }

    private static int num_of_days(int[] arr, int m, int k) {
        int start = 1;
        int end = max(arr);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (canMakeBouquets(arr, m, k, mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start <= max(arr) && canMakeBouquets(arr, m, k, start) ? start : -1;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 7, 7, 7, 13, 11, 12, 7 };
        int m = 2, k = 3;
        System.out.println(num_of_days(arr, m, k));
    }
}
