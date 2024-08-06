/*Time complexity-->O(n)
 * space complexity-->O(1)
 */

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data1, Node next1, Node prev1) {
        this.data = data1;
        this.next = next1;
        this.prev = prev1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}

public class even_odd_optimal {
    private static Node ArraytoDll(int[] array) {
        Node head = new Node(array[0]);
        Node prev = head;
        for (int i = 1; i < array.length; i++) {
            Node temp = new Node(array[i], null, prev);
            prev.next = temp;
            prev = prev.next;// or prev=temp
        }

        return head;
    }

    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    private static Node even_odd(Node head) {

        if (head == null || head.next == null)
            return head;
        Node odd = head;
        Node even = head.next;
        Node even_backup = head.next; // to back the the even frst node -->to link it with odd index last node
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = even_backup;// to link odd and even
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 8 };
        Node head = ArraytoDll(arr);
        head = even_odd(head);
        print(head);
    }
}
