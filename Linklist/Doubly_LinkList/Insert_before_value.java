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

public class Insert_before_value {
    private static Node ArraytoDll(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, mover);
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
    }

    private static Node insert_value(Node head, int data, int value) {
        Node temp = head;

        while (temp != null && temp.next != null && temp.next.data != value) {

            temp = temp.next;

        }
        if (temp == null || temp.next == null) {
            System.out.println("value not found!.");
            return head;
        }
        Node newnode = new Node(data, temp.next, temp);
        temp.next.prev = newnode;
        temp.next = newnode;

        return head;

    }

    public static void main(String[] args) {
        int[] arr = { 6, 4, 3, 5, 2, 1 };
        Node head = ArraytoDll(arr);
        head = insert_value(head, 12, 7);
        print(head);
    }
}
