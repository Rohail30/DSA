package com.company;

public class StackDSLinkedList {
    public Node first;

    public StackDSLinkedList(){
        this.first=null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void push(int data){
        Node extraNode= first;
        first=new Node();
        first.data=data;
        first.next=extraNode;
    }

    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is Empty");
        }
        int value = first.data;
        first=first.next;
        return value;
    }

    public void printStack(){
        if(isEmpty()){
            throw new IllegalThreadStateException("Stack is Empty");
        }
        while (!isEmpty()){
            System.out.print(pop());
            System.out.print(" pooping out an element");
            System.out.println();
        }
    }
}