
/*time complexity--->O(n) */
public class bubble_optimal {
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void bubble_sort(int[] array, int n) {
        for (int i = n - 1; i > 0; i--) {
            int didswap = 0;// to get optimal
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, i, j);
                    didswap = 1;// toggle
                }

            }
            if (didswap == 0) { // if the array is already in ascending order
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 12, 45, 2, 1, 47, 30, 21 };
        int n = 8;
        bubble_sort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
