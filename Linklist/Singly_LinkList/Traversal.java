//TIME COMPLEXITY--> O(n)

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

public class Traversal {

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

    public static void main(String[] args) {
        int[] input = { 132, 4, 3, 5, 2 };
        Node head = ArrayToLinklist(input);
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;

        }

    }
}
