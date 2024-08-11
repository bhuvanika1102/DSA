//LINEAR SEARCH
public class Search_char {
    private static int search(String str, char target) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        String str = "DataStructures";
        char target = 'c';
        System.out.println(search(str, target));

    }
}