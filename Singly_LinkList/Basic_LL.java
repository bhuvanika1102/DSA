
//no need to put PUBLIC for class ,coz defaulty it is PUBLIC 

class Node { // In C++,can also use STRUCT ,but if we use STRUCT we can able to use OOPS
             // efficiently.
             // In Java there is no STRUCT .
    int data;
    Node next; // pointer

    Node(int data1, Node next1) {
        this.data = data;
        this.next = next;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null; // default value,no need to assign null as every time
    }
}

public class Basic_LL {
    public static void main(String[] args) {
        int[] input = { 1, 4, 3, 5, 2 };
        Node constructor_1 = new Node(input[2], null); // constructor(1) call
        Node contructor_2 = new Node(input[2]); // constructor(2) call
        System.out.println("constructor_1 Address:" + constructor_1);
        System.out.println("constructor_2 Address:" + contructor_2);
        System.out.println("constructor_1 data:" + constructor_1.data);
        System.out.println("constructor_2 data:" + contructor_2.data);
        System.out.println("constructor_1 next:" + constructor_1.next);
        System.out.println("constructor_1 next:" + contructor_2.next);
    }
}