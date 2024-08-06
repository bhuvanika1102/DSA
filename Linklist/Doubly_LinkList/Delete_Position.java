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

public class Delete_Position {
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

    private static Node deletetail(Node head) {
        if (head == null || head.next == null)
            return null;
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;

        }

        temp.next.prev = null;
        temp.next = null;
        return head;
    }

    private static Node deleteposition(Node head, int k) {
        if (k == 1) {
            return head.next;
        }

        int count = 0;
        Node temp = head;
        Node prev = temp;

        while (temp.next != null) {
            count++;
            if (count == k) {

                prev.next = temp.next;
                temp.next.prev = temp.prev;
                temp.prev = null;
                temp.next = null;
                return head;
            } else {
                prev = temp;
                temp = temp.next;

            }

        }
        Node nextone = temp.next;
        if (nextone == null) {
            deletetail(head);

        }

        return head;
    }

    public static void main(String[] args) {
        int[] array = { 6, 3, 2, 5, 4, 1, 9 };
        Node head = ArraytoDll(array);
        head = deleteposition(head, 1);
        print(head);
    }

}
