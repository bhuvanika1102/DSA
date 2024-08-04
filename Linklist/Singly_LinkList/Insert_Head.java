
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

public class Insert_Head {
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

    private static Node insert_head(Node head, int value) {
        Node temp = new Node(value, head);// constructor call(to create new node with data=value,next=prev head)
        return temp;
    }

    public static void main(String[] args) {
        int[] array = { 4, 2, 1, 3, 5, 6 };
        Node head = ArrayToLinklist(array);
        head = insert_head(head, 78);
        print(head);
    }

}
