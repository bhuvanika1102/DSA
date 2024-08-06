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

public class Insert_Head {

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

    private static Node insert_head(Node head, int value) {
        Node temp = head;
        Node newnode = new Node(value, head, null);
        head.prev = newnode;
        return newnode;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 4, 3, 5, 2, 1 };
        Node head = ArraytoDll(arr);
        head = insert_head(head, 10);
        print(head);
    }

}
