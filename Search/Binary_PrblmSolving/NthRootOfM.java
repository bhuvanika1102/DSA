public class NthRootOfM {
    private static int root(int mid, int n) {
        int ans = 1;
        while (n > 0) {
            
                ans = ans * mid;
                n--;
            
            
            
        }
        //mid^n
        return ans;
    }

    private static int nthroot(int n, int m) {
        int start = 1, end = m;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (root(mid, n) == m) {
                return mid;

            } else if (root(mid, n) > m) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 4, m = 81;
        System.out.println(nthroot(n, m));

    }
}
