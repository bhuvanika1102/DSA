//LINEAR SEARCH

public class Min_Ele {
    private static int minimum(int[] arr) {
        int len = arr.length;
        int min = arr[0];
        for (int i = 1; i < len; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 4, 3, 23, 45, 2, -9 };
        System.out.println(minimum(arr));
    }
}
