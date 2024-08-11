public class Digit_find_trick {
    public static void main(String[] args) {
        int num = -12323456;
        if (num < 0) {
            num = num * -1;
        }
        int digits = (int) (Math.log10(num)) + 1;
        System.out.println(digits);
    }

}
