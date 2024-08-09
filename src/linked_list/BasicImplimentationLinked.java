

package linked_list;

import java.util.Scanner;

public class BasicImplimentationLinked {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNodeAtLast() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the element you want to store");
        int input = inp.nextInt();
        Node obj = new Node(input);

        if (head == null) {
            head = obj;
            tail = obj;
        } else {
            tail.next = obj;
            tail = obj;
        }
    }

    void display() {
        Node current = head;
        if (head == null) {
            System.out.println("The linked list is empty");
        } else {
            int i=0;
            while (current != null) {
                System.out.println("The element "+ (++i)+" is " + current.data);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        BasicImplimentationLinked list = new BasicImplimentationLinked();
        Scanner inp = new Scanner(System.in);

        System.out.println("Choose the program to be performed");
        System.out.println("1). Add element");
        System.out.println("2). Display element");
        System.out.println("0). Terminate");

        boolean a = true;
        do {
            System.out.println("\nEnter your choice");
            int choice = inp.nextInt();
            switch (choice) {
                case 1 -> list.addNodeAtLast();
                case 2 -> list.display();
                case 0 -> a = false;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (a);

        inp.close();
    }
}
