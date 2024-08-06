
/*time complexity---->O(n logn)
 * space-->O(n)
 */
public class merge {
    private static void merge(int[] array, int low, int mid, int high) {
        int[] temp = new int[high - low + 1]; // Initialize the temp array
        // [low...mid]
        // [mid+1 ... high]
        int left = low;
        int right = mid + 1;
        int i = 0;
        while (left <= mid && right <= high) {
            if (array[left] <= array[right]) {
                temp[i] = (array[left]);
                left++;
                i++;
            } else {
                temp[i] = (array[right]);
                right++;
                i++;
            }
        }
        if (left <= mid) {
            temp[i] = (array[left]);
            left++;
            i++;
        }
        if (right <= high) {
            temp[i] = (array[right]);
            right++;
            i++;
        }
        for (int j = low; j <= high; j++) {
            array[j] = temp[j - low];
        }

    }

    private static void mergesort(int[] array, int low, int high) {
        if (low == high)
            return;
        int mid = (low + high) / 2;
        mergesort(array, low, mid);
        mergesort(array, mid + 1, high);
        merge(array, low, mid, high);
    }

    public static void main(String[] args) {
        int[] arr = { 9, 12, 45, 2, 1, 47, 30, 21 };
        int n = 8;
        mergesort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
