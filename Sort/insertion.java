/*time complexity-->O(n^2)--->average,worst
 * O(n)-->best
 */
public class insertion {
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void insertion_sort(int[] array, int n) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && array[j - 1] > array[j]) {
                swap(array, j - 1, j);
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 12, 45, 2, 1, 47, 30, 21 };
        int n = 8;
        insertion_sort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
