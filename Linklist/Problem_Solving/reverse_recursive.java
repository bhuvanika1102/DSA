
/*time and space complexity--->O(n) */
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

public class reverse_recursive {
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

    private static Node recursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newhead = recursive(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newhead;
    }

    public static void main(String[] args) {
        int[] array = { 4, 2, 1, 3, 5, 6 };
        Node head = ArrayToLinklist(array);
        head = recursive(head);
        print(head);
    }

}
