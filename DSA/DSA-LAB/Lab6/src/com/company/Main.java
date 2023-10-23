package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Stack---LIFO(Last in first out)
        //This code is Stack using array
        StackDS stackDS = new StackDS(5);
        stackDS.push(1);
        stackDS.push(2);
        stackDS.push(3);
        stackDS.push(4);
        stackDS.push(5);

        while (!stackDS.isEmpty()){
            System.out.println(stackDS.pop());
        }

        //stackDS.max();
        //stackDS.min();
        //stackDS.average();
        //stackDS.product();

        //This code is Stack using Linked List
        StackDSLinkedList stackDSLinkedList = new StackDSLinkedList();
        stackDSLinkedList.push(1);
        stackDSLinkedList.push(2);
        stackDSLinkedList.push(3);
        stackDSLinkedList.push(4);
        stackDSLinkedList.push(5);

        stackDSLinkedList.printStack();


    }
}
