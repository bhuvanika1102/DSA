/*time complexity-->O(n^2)-->best,average,worst */

public class selection {
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void selection_sort(int[] array, int n) {
        for (int i = 0; i < n - 1; i++) {// coz last element should be sorted at last
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            swap(array, i, min);
        }
    }

    public static void main(String[] args) {
        int[] array = { 9, 12, 45, 2, 1, 47, 30, 21 };
        selection_sort(array, 8);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }
}