
//LINEAR SEARCH
import java.util.Arrays;

public class Search_char2 {
    private static boolean search(String str, char target) {
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        String str = "DataStructures";
        char target = 'c';
        System.out.println("The string input is converted into charArray" + (Arrays.toString(str.toCharArray())));
        System.out.println(search(str, target));

    }
}