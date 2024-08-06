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

public class sum {
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

    private static Node sum(Node head, Node head1) {
        Node dummy = new Node(-1);
        Node current = dummy;
        int carry = 0;
        while (head != null || head1 != null) {
            int sum = carry;
            if (head != null) {
                sum += head.data;
            }
            if (head1 != null) {
                sum += head1.data;
            }

            Node newnode = new Node(sum % 10);
            carry = sum / 10;

            current.next = newnode;
            current = current.next;

            if (head != null) {
                head = head.next;
            }
            if (head1 != null) {
                head1 = head1.next;
            }

        }
        if (carry != 0) {
            Node newnode = new Node(carry);
            current.next = newnode;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr1 = { 7, 9, 3, 4, 5 };
        Node head = ArrayToLinklist(arr);
        Node head1 = ArrayToLinklist(arr1);

        head = sum(head, head1);
        print(head);
    }
}
