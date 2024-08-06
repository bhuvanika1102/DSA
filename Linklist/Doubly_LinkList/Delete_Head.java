
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

public class Delete_Head {
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

    private static Node deletehead(Node head) {
        if (head == null || head.next == null)
            return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        head.prev = null;
        return head;
    }

    public static void main(String[] args) {
        int[] array = { 6, 3, 2, 5, 4, 1, 9 };
        Node head = ArraytoDll(array);
        head = deletehead(head);
        print(head);
    }

}
