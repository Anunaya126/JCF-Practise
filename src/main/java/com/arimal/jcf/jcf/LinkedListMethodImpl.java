package com.arimal.jcf.jcf;

import java.util.LinkedList;

public class LinkedListMethodImpl {

    public static void main(String[] args) {
        // Creation of LinkedList
        LinkedList<String> l = new LinkedList<>();

        // Adding elements
        l.add("Cat");
        l.add("Dog");
        l.add("Rat");
        l.add("Sheep");
        l.add("Elephant");

        System.out.println(l);

        // Adding a new element in the beginning of the linked list
        l.addFirst("Ant");
        System.out.println(l);

        // Adding in the last
        l.addLast("Monkey");
        System.out.println(l);

        // Can clone the linkedList to an object
        Object copy  = l.clone();
        System.out.println(copy);

        // gets the head of the linkedLIst
        String a = l.element();
        System.out.println(a);

        // to retrieve an element at the specified index
        System.out.println(l.get(3));
        System.out.println(l.get(4));
        System.out.println(l.get(6));
        // To retrieve the first element
        System.out.println(l.getFirst());
        // To retrieve the last element
        System.out.println(l.getLast());

        // retrieve the index of a specific elemnet
        System.out.println(l.indexOf("Sheep"));

        l.addLast("Sheep");
        System.out.println(l);

        // to retrieve tha last index of an element
        System.out.println(l.lastIndexOf("Sheep"));

        // This method insert an element at the tail of the list
        l.offer("Antelope");
        System.out.println(l);

        // Adds to first and last
        l.offerFirst("Orangutan");
        l.offerLast("Zebra");
        System.out.println(l);

        // push adds item to the first of the list like a stack
        l.push("Girrafe");
        System.out.println(l);

        // peek method retrieves items but does not alter the list
        System.out.println(l.peek());
        System.out.println(l.peekFirst());
        System.out.println(l.peekLast());

        // poll method retrieves and removes the item from the list
        System.out.println(l.poll());
        System.out.println(l.pollFirst());
        System.out.println(l.pollLast());
        System.out.println(l);

        // pop method retrieves the first item from the stack
        System.out.println(l.pop());
        System.out.println(l);

        /*
        addFirst(), removeFirst() --> Deque methods, strict and throws exception upon fail.
        push, pop --> again deque methods for stack implementation, strick and will return exception on fail.
        offer, offerFirst() --> safe, returns boolean, hence false upon failure not exception, queue methods
        poll, pollFirst() --> safe, returns null upon fail, queue method.
        */
    }
}
