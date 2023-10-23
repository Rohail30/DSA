package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DoublyLinkedList dd = new DoublyLinkedList();
        dd.insertFirst(1);
        dd.insertFirst(2);
        dd.insertFirst(3);
        dd.insertFirst(4);
        dd.insertLast(5);
        dd.displayList();

        System.out.println();

        dd.insertBefore(2,5);
        dd.displayList();


        System.out.println();
        //dd.exp();


        //1: Largest
        System.out.println("---------------------");
        dd.max();

        //2: List Length
        System.out.println("---------------------");
        System.out.println("Length: "+dd.listLength());

        //3: Product
        System.out.println("---------------------");
        dd.product();

        //4: Average
        System.out.println("---------------------");
        dd.average();

        //5: Reverse
        System.out.println("---------------------");
        dd.reverse();



    }
}
