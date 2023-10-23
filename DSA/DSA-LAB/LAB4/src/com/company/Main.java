package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Circular Linked List
        CircularLinkedList cc = new CircularLinkedList();
        cc.insertFirst(1);
        cc.insertFirst(2);
        cc.insertFirst(4);
        cc.insertFirst(2);
        cc.insertFirst(3);
        cc.insertFirst(3);
        cc.insertFirst(4);
        cc.insertFirst(2);
        cc.insertFirst(4);
        cc.insertFirst(5);
        cc.displayList();

        cc.displayList();

        //1: Minimum
        System.out.println("------------------------");
        cc.min();

        //2: Common
        System.out.println("------------------------");
        cc.common();

        //3: Product
        System.out.println("------------------------");
        cc.product();

        //4: Average
        System.out.println("------------------------");
        cc.average();

        //5: Reverse
        System.out.println("------------------------");
        cc.reverse();

        //6: Distinct
        System.out.println("------------------------");
        cc.distinct();

        //7: Replace
        System.out.println("------------------------");
        cc.replace(3,21);

        //8: Replace
        System.out.println("------------------------");
        cc.even();

        //9
        System.out.println("------------------------");
        cc.odd();

        //11
        System.out.println("------------------------");
        cc.insertMid(31);
        cc.displayList();

        //12
        System.out.println("------------------------");
        cc.deleteMid();
        cc.displayList();

        //13
        System.out.println("------------------------");
        cc.insertLast(6);
        cc.displayList();

        //14
        System.out.println("------------------------");
        cc.deleteLast();
        cc.displayList();

        //15
        System.out.println("------------------------");
        cc.find(31);


        //System.out.println("------------------------");
        //cc.exp();

    }
}
