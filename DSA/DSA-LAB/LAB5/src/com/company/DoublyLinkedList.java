package com.company;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    public Node first;
    public Node last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public void exp(){
        System.out.println(first.data);
    }

    public boolean isEmpty(){
        return (first==null);
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data=data;
        if(isEmpty()){
            last=newNode;
        }
        else{
            first.previous=newNode;
            newNode.next=first;
        }
        this.first=newNode;
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data=data;
        if(isEmpty()){
            first=newNode;
        }
        else{
            last.next=newNode;
            newNode.previous=last;
        }
        this.last=newNode;
    }

    //1
    public void max() { //O(1)
        Node current = first;
        int max = first.data;
        while (current != null) {
            if(current.data>max){
                max = current.data;
            }
            current = current.next;
        }
        System.out.println("Maximum is: "+max);
    }

    //2
    public int listLength() {
        int length = 0;
        Node current = first;
        while (current != null) {
            length++;
            current = current.next;
        }
        //System.out.println("Length: " + length);
        return length;
    }

    //3
    public void product(){
        Node current = first;
        int prod = 1;
        while (current!=null){
            prod = prod*current.data;
            current=current.next;
        }
        System.out.println("Product is: "+prod);
    }

    //4
    public void average(){
        Node current = first;
        int total = listLength();
        int sum=0;
        while (current!=null){
            sum=sum+current.data;
            current=current.next;
        }
        System.out.println("Average is: "+(sum/total));
    }

    //5
    public void insertAfter(int key, int data) {
        Node current = first;
        if (isEmpty()) {
            throw new NoSuchElementException("Linked List is Empty");
        } else {
            int position = 1;
            Node newNode = new Node();
            newNode.data = data;
            while (position != key + 1) {
                if (position == key) {
                    newNode.next = current.next;
                    newNode.previous = current;
                    current.next = newNode;
                    newNode.next.previous = newNode;
                }
                current = current.next;
                position++;
            }
        }
    }

    public void printForward() {
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void reverse() {
        Node current = last;
        while (current != null) {
            current.displayNode();
            current = current.previous;
        }
        System.out.println();
    }

    public void deleteFirst() {
        Node temp = first;
        if (isEmpty()) {
            throw new NoSuchElementException("Linked List is Empty");
        } else if (first.next == null) {
            last = null;
        }
           else {
            first.next.previous = null;
        }
        first = first.next;
        System.out.println("Deleted: " + temp.data);
    }

    public void deleteLast() {
        Node temp = last;
        if (isEmpty()) {
            throw new NoSuchElementException("Linked List is Empty");
        } else if (last.previous == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        System.out.println("Deleted: " + temp.data);
    }




    public void displayList(){
        Node current =  first;
        if(isEmpty()){
            System.out.println("list is empty");
        }
        else {
            while (current != last) {
                current.displayNode();
                current = current.next;
            }
            current.displayNode();
        }
    }

    public void insertBefore(int key, int data){
        Node ptr = first;
        int flag=0;
        while (ptr!=null){
            if(ptr.data==data){
                flag=1;
            }
            ptr=ptr.next;
        }
        if(flag==1) {
            if (first.data == data) {
                insertFirst(data);
            } else {
                Node current = first;
                while (current.next.data==data) {
                    current = current.next;
                }
                Node newNode = new Node();
                newNode.data = data;
                newNode.next = current.next;
                newNode.previous = current;
                current.next = newNode;
                newNode.next.previous = newNode;
            }
        }
        System.out.println();
    }


}
