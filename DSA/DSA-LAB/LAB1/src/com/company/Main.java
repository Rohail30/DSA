package com.company;

public class Main {

    public static void main(String[] args) {

        // write your code here

        ArrayDS arrayDS = new ArrayDS(5);
        arrayDS.insert(1);
        arrayDS.insert(2);
        arrayDS.insert(3);
        arrayDS.insert(4);
        arrayDS.insert(5);
        arrayDS.insert(6);
        arrayDS.insert(7);
        arrayDS.insert(8);
        arrayDS.insert(9);
        arrayDS.insert(10);
        arrayDS.insert(11);
        arrayDS.insert(12);
        arrayDS.insert(13);
        arrayDS.insert(14);
        arrayDS.details();
        arrayDS.print();

        //Deleting item 3 from list
        System.out.println("");
        arrayDS.details();
        System.out.println("Deleting item 3 from list");
        arrayDS.delete(3);
        arrayDS.print();

        //find item on index 4
        System.out.println("");
        arrayDS.details();
        System.out.println("finding item on index 4");
        arrayDS.find(4);


    }
}
