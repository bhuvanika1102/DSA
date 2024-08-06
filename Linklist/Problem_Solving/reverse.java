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

public class reverse {
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

    private static Node reverse(Node head) {
        Node current = head;
        Node previous = null;
        while (current != null) {
            previous = current.prev;
            current.prev = current.next;
            current.next = previous;

            current = current.prev;

        }
        return previous.prev;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Node head = ArraytoDll(arr);
        head = reverse(head);
        print(head);
    }
}