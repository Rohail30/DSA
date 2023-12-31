package com.company;

public class Main {
    public static void main(String[] args) {

        Tree t = new Tree();
        t.insert(7);
        t.insert(4);
        t.insert(9);
        t.insert(1);
        t.insert(6);
        t.insert(8);
        t.insert(10);
        t.insert(11);

        System.out.println("\nHeight");
        System.out.println(t.height());

        //System.out.println("Done");
        //t.printNodesAtDistance(0);

        System.out.println("preorderTraversal");
        t.preorderTraversal();

        System.out.println("\ninorderTraversal");
        t.inorderTraversal();

        System.out.println("\ninorderTraversal Dec");
        t.inorderTraversalDesc();

        System.out.println("\npostorderTraversal");
        t.postorderTraversal();



    }
}
