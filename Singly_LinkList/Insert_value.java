//insert value befor x value   
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

public class Insert_value {
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

    private static Node insert_value(Node head, int value, int x) {
        if (head == null)
            return null;
        if (head.data == x) {
            Node temp = new Node(value, head);

        }
        Node temp = head;
        while (temp.next != null) {// temp.next-->if we give value which is nit in array
            if (temp.next.data == x) {
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
        head = insert_value(head, 78, 98);
        print(head);
    }

}
