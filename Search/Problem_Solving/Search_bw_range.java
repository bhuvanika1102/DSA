//LINEAR SEARCH
public class Search_bw_range {
    private static int search(String str, char target, int start, int end) {
        int n = str.length();
        for (int i = start; i < end; i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        String str = "DataStructures";
        char target = 'e';
        int start = 1, end = 4;
        System.out.println(search(str, target, start, end));

    }
}