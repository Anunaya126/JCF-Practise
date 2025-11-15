package com.arimal.jcf.jcf.DoublyLinkedListImpl;

public class DdlMain {
    public static void main(String[] args) {
        // Create head node
        Node head = new Node(10);

        // Create second node
        head.next = new Node(20);
        head.next.prev = head;

        // Create third node
        head.next.next = new Node(30);
        head.next.next.prev = head.next;

        // Create fourth node
        head.next.next.next = new Node(40);
        head.next.next.next.prev = head.next.next ;

        printList(head);
        System.out.println();

        head =insertAtFront(head,0);
        printList(head);
        System.out.println();

        insertAtEnd(head,50);
        printList(head);
        System.out.println();

        insertAtPosition(head,3,15);
        printList(head);
        System.out.println();

        head = delHead(head);
        printList(head);
        System.out.println();

        delLast(head);
        printList(head);
        System.out.println();

        delFromPost(head,2);
        printList(head);
        System.out.println();
    }

    public static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            if (temp.next != null){
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
    }

    public static Node insertAtFront(Node head, int data){
        // Create a newNode
        Node newNode = new Node(data);

        // make next of newNode as head
        newNode.next = head;

        // make prev of head as newNode
        head.prev = newNode;

        return newNode;

    }

    public static void insertAtEnd(Node head, int data){
        // Create new not
        Node newNode = new Node(data);

        // if LL is empty new node is
        if(head == null ){
            head = newNode;
        } else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            // temp is in the last node of head
            temp.next = newNode;

            // set prev of newNode as temp
            newNode.prev = temp;
        }
    }

    public static Node insertAtPosition(Node head, int pos, int value){
        // Create a new Node
        Node newNode = new Node(value);

        // at beginning
        if(pos == 1){
            head = insertAtFront(head,value);
            return head;
        }
        Node temp = head;

        //Traverse the list to the position
        for(int i = 1; i < (pos -1);i++){
            temp = temp.next;
        }
        //Temp is at the required position
        // Check for out of bound
        if( temp == null ){
            System.out.println("Out of bound!!");
            return head;
        }
        // Main break and join logic
        newNode.prev = temp;
        newNode.next = temp.next;
        temp.next = newNode;

        // If new node is not last node, update prev of next node to new node
        if (newNode.next != null){
            newNode.next.prev = newNode;
        }
        return head;
    }

    public static Node delHead(Node head){
        // if empty return null
        if (head == null) {
            return null;
        }

        // Move head to next node
        head = head.next;

        if(head != null){
            head.prev = null;
        }
        return head;
    }

    public static Node delLast(Node head){
        //  If empty return null
        if(head == null){
            return null;
        }

        //traverse to the end of the node using temp
        while(head.next != null){
            head= head.next;
        }
        head.prev.next = null;

        return head;
    }

    public static Node delFromPost(Node head, int pos){


        // at the beginning
        if (head == null){
            return head;
        }
        Node temp = head;

        // Traverse to the list at the position
        for(int i = 1; temp != null && i<(pos);i++){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Out of bound!!");
            return head;
        }

        if(temp.prev != null){
            temp.prev.next = temp.next;
        }
        if(temp.next != null) {
            temp.next.prev = temp.prev;
        }

        if(head == temp){
            head = temp.next;
        }
        temp = null;
        return head;

    }
}
