//LINEAR
public class frst_and_last_occur {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 5, 8, 8, 9, 8 };
        int target = 8;
        int first = -1, last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i;
                } else {
                    last = i;
                }
            }
        }
        System.out.println(first + " " + last);
    }

}
