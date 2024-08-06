class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class zero_one_two {
    private static Node ArrayToLinklist(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;

    }

    private static void print(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.print(" ");

    }

    private static Node sort_012(Node head) {
        Node dummy_one = new Node(-1);
        Node dummy_two = new Node(-1);
        Node dummy_zero = new Node(-1);
        Node one = dummy_one;
        Node two = dummy_two;
        Node zero = dummy_zero;
        Node temp = head;
        if (temp == null || temp.next == null)
            return head;
        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;

            } else if (temp.data == 1) {
                one.next = temp;
                one = one.next;
            } else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }
        zero.next = (dummy_one.next) != null ? dummy_one.next : dummy_two.next;
        one.next = dummy_two.next;
        two.next = null;
        Node newhead = dummy_zero.next;

        return newhead;

    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 2, 2, 1, 1, 0, 0, 2, 1 };
        Node head = ArrayToLinklist(arr);
        head = sort_012(head);
        print(head);
    }
}
