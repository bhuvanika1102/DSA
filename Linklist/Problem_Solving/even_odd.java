/*Time complexity-->O(2n)
 * space complexity-->O(n)
 */

import java.util.ArrayList;

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

public class even_odd {
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

    private static Node even_odd(Node head) {
        ArrayList<Integer> sort = new ArrayList<>();
        Node temp = head;
        // odd index
        while (temp != null && temp.next != null) {
            sort.add(temp.data);
            temp = temp.next.next;
        }
        if (temp != null) {
            sort.add(temp.data);
        }

        // even index
        temp = head.next;
        while (temp != null && temp.next != null) {
            sort.add(temp.data);
            temp = temp.next.next;
        }
        if (temp != null) {
            sort.add(temp.data);
        }

        // store values in arraylist to linklist
        int i = 0;
        temp = head;
        while (temp != null) {
            temp.data = sort.get(i);
            i++;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Node head = ArraytoDll(arr);

        head = even_odd(head);
        print(head);
    }
}
