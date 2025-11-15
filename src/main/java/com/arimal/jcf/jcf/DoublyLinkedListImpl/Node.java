package com.arimal.jcf.jcf.DoublyLinkedListImpl;

public class Node{
    int data;
    Node next;
    Node prev;

    Node(int value){
        data = value;
        prev = null;
        next = null;
    }
}
