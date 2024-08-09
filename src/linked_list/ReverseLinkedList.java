package linked_list;

import java.util.Scanner;

public class ReverseLinkedList {
    public class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    Node head=null;
    Node tail=null;
    void addElementLinedListAtLast()
    {
        System.out.println("Enter the element to insert ");
        Scanner inp= new Scanner(System.in);
        int data=inp.nextInt();
        Node obj=new Node(data);
        if (head==null)
        {
            head=obj;
            tail=obj;
        }
        else {
            tail.next=obj;
            tail=obj;
        }


    }

    void displayLinkedList()
    {
        Node curr=head;
        System.out.println("The array is ");
        while(curr!=null)
        {
            System.out.println( curr.data+" ");
            curr=curr.next;
        }

    }

    void reverseLinkedList()
    {
        Node prev=null;
        Node curr=head;
        Node next=null;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;


        }

        head=prev;
        System.out.println("The linked list has been reversed");

    }

    public static void main(String[] args) {
        ReverseLinkedList p=new ReverseLinkedList();
        boolean a=true;
        while(a) {
            System.out.println("Enter the choice ");
            System.out.println("1). Add elements to array ");
            System.out.println("2). display the array ");
            System.out.println("3). reverse the array");

            Scanner inp=new Scanner(System.in);
            System.out.println("Enter your choice");
            int choice =inp.nextInt();

            switch (choice)
            {
                case 1->{p.addElementLinedListAtLast();}
                case 2->{p.displayLinkedList();}
                case 3->{p.reverseLinkedList();}
                case 0->{a=false;break;}
            }
        }



    }


}
