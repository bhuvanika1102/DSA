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

public class Insert_position {
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

    private static Node insert_position(Node head, int value, int position) {
        if (head == null) {
            if (position == 1) {
                return new Node(value);
            }
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == position - 1) {
                Node newnode = new Node(value);
                newnode.next = temp.next;
                temp.next = newnode;
                return head;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        int[] array = { 4, 2, 1, 3, 5, 6 };
        Node head = ArrayToLinklist(array);
        head = insert_position(head, 78, 3);
        print(head);
    }

}
