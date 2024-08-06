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

public class Delete_by_value {
    private static Node ArrayToLinklist(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            temp.prev = mover;
            mover = temp;
        }
        return head;
    }

    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static Node deletevalue(Node head, int value) {
        Node temp = head;

        // Traverse to find the node with the specified value
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) {
            // Value not found
            System.out.println("Value not found in the list.");
            return head;
        }

        // If deleting the head node
        if (temp.prev == null) {
            head = temp.next;
            if (head != null) {
                head.prev = null;
            }
        } else {
            // Update previous node's next reference
            temp.prev.next = temp.next;

            // Update next node's prev reference
            if (temp.next != null) {
                temp.next.prev = temp.prev;
            }
        }

        // Clear the deleted node's references
        temp.next = null;
        temp.prev = null;

        return head;
    }

    public static void main(String[] args) {
        int[] array = { 4, 2, 1, 3, 5, 6 };
        Node head = ArrayToLinklist(array);
        head = deletevalue(head, 6); // Example: delete node with value 3
        print(head); // Print remaining nodes

        // Additional tests can be added here if needed
    }
}
