public class Linear {
    private static int linear_search(int[] arr, int target) {
        int index, flag = 0;
        for (index = 0; index < arr.length; index++) {
            if (arr.length == 0) {
                return -1;
            }
            if (arr[index] == target) {
                flag = 1;
                return index;
            }
        }
        if (flag == 0) {
            return -1;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 6;
        System.out.println(linear_search(arr, target));
    }
}