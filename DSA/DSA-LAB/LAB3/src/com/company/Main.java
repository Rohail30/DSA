package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(1);
        singlyLinkedList.insertFirst(2);
        singlyLinkedList.insertFirst(4);
        singlyLinkedList.insertFirst(4);
        singlyLinkedList.insertFirst(3);
        singlyLinkedList.insertFirst(31);
        singlyLinkedList.insertFirst(31);
        singlyLinkedList.insertFirst(10);
        singlyLinkedList.insertFirst(15);
        singlyLinkedList.insertFirst(15);
        //singlyLinkedList.insertLast(6);

        singlyLinkedList.displayList();
        //singlyLinkedList.reverse2();

        //01: Max Value
        System.out.println("------------------------");
        singlyLinkedList.max();

        //02: Common Items
        System.out.println("------------------------");
        singlyLinkedList.common();

        //03: Product
        System.out.println("------------------------");
        singlyLinkedList.product();

        //04: Average
        System.out.println("------------------------");
        singlyLinkedList.average();

        //05: Reverse
        System.out.println("------------------------");
        singlyLinkedList.reverse();

        //06: Distinct
        System.out.println("------------------------");
        singlyLinkedList.distinct();

        //07: Replace
        System.out.println("------------------------");
        singlyLinkedList.replace(3,4);
        //singlyLinkedList.displayList();

        //08: Even Numbers
        System.out.println("------------------------");
        singlyLinkedList.even();

        //09: ODD Numbers
        System.out.println("------------------------");
        singlyLinkedList.odd();

        //10: Prime Numbers
        System.out.println("------------------------");
        singlyLinkedList.prime();

        //11: Insert Node at Middle
        System.out.println("------------------------");
        singlyLinkedList.insertMid(51);
        singlyLinkedList.displayList();

        //12: Delete Node at Middle
        System.out.println("------------------------");
        singlyLinkedList.deleteMid();
        singlyLinkedList.displayList();

        //13: Insert Node at Last
        System.out.println("------------------------");
        singlyLinkedList.insertLast(17);
        singlyLinkedList.displayList();

        //14: Delete Node at Last
        System.out.println("------------------------");
        singlyLinkedList.displayList();
        singlyLinkedList.deleteLast();
        singlyLinkedList.displayList();

        //15:Finding Node
        System.out.println("------------------------");
        singlyLinkedList.find(4);

        System.out.println("------------------------");
        singlyLinkedList.delete(4);
        singlyLinkedList.displayList();

        System.out.println("------------------------");
        singlyLinkedList.displayList();
        singlyLinkedList.insertAfter(2,5);
        singlyLinkedList.insertAfter(4,4);
        singlyLinkedList.displayList();




        //singlyLinkedList.exp();



    }
}
