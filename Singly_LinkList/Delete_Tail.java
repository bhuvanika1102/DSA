
class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data;
        this.next = next;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }

};

public class Delete_Tail {
    private static Node ArrayToLinklist(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;// or mover=mover.next
        }

        return head;
    }

    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data);
            head = head.next;
            System.out.print(" ");
        }

    }

    private static Node Deleting(Node head) {
        if (head == null || head.next == null) {
            return null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;

            }
            temp.next = null;
            return head;
        }

    }

    public static void main(String[] args) {
        int[] input = { 132, 4, 3, 5, 2 };
        Node head = ArrayToLinklist(input);
        head = Deleting(head); // 123
        print(head); // 132 4 3 5

    }
}
