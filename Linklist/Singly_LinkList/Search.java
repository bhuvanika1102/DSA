/*TIME COMPLEXITY
    worst case--> O(n)
    best case -->O(1)
    some times O(n/2)

*/

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

public class Search {

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

    private static int searching(Node head, int value) {// return 1 if present or-else 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == value) {
                return 1;
            } else {
                temp = temp.next;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] input = { 132, 4, 3, 5, 2 };
        Node head = ArrayToLinklist(input);
        int present = searching(head, 3);
        System.out.println(present); // present so 1

        int present1 = searching(head, 31);
        System.out.println(present1); // not present ,so 0;
    }
}
