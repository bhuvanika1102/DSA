public class NthRootOfM {
    private static int root(int n, int m) {
        int ans = 1;
        while (n > 0) {
            ans = ans * m;
            n--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 4, m = 16;
        for (int i = 1; i <= m; i++) {
            if (root(i, n) == m) {
                System.out.println(i);
                ;
            } else if (root(i, n) > m) {
                break;
            } else {
                continue;
            }
        }

    }
}
