package com.company;

public class Tree {

    private class Node {

        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node = " + value;
        }
    }

    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }

        Node current = root;
        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = new Node(value);
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = new Node(value);
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value){
        var current = root;
        while (current!=null){ //As long as the node becomes not equal to the null iterate loop to find value
            if(value<current.value)
                current=current.leftChild;
            else if(value>current.value)
                current=current.rightChild;
            else
                return true; //means value found
        }
        return false; //means value not found
    }

    public void preorderTraversal() {
        preorderTraversal(root);
    }

    private void preorderTraversal(Node root) {
        if (root == null)
            return;

        System.out.print(root.value + " ");
        preorderTraversal(root.leftChild);
        preorderTraversal(root.rightChild);
    }

    public void inorderTraversal() {
        inorderTraversal(root);
    }

    private void inorderTraversal(Node root) {
        if (root == null)
            return;

        inorderTraversal(root.leftChild);
        System.out.print(root.value + " ");
        inorderTraversal(root.rightChild);
    }

    public void inorderTraversalDesc() {
        inorderTraversalDesc(root);
    }

    private void inorderTraversalDesc(Node root) {
        if (root == null)
            return;

        inorderTraversalDesc(root.rightChild);
        System.out.print(root.value + " ");
        inorderTraversalDesc(root.leftChild);
    }

    public void postorderTraversal() {
        postorderTraversal(root);
    }

    private void postorderTraversal(Node root) {
        if (root == null)
            return;

        postorderTraversal(root.leftChild);
        postorderTraversal(root.rightChild);
        System.out.print(root.value + " ");
    }

    public int minNode(){
        return minNode(root);
    }

    private int minNode(Node root){
        if(root==null)
            throw new IllegalStateException();
        var current = root;
        var last = current;
        while (current!=null){
            last=current;
            current=current.leftChild;
        }
        return last.value;
    }

    public int maxNode(){
        return maxNode(root);
    }

    private int maxNode(Node root){
        if(root==null)
            throw new IllegalStateException();
        var current = root;
        var last = current;
        while (current!=null){
            last=current;
            current=current.rightChild;
        }
        return last.value;
    }

    public boolean equals(Tree other){
        if(other == null)
            return false;
        return equals(root,other.root);
    }

    private boolean equals(Node first,Node second){
        if(first==null && second==null)
            return true;
        //usinf Pre Order Traversal
        if(first!=null && second!=null)
            return first.value == second.value && equals(first.leftChild,second.leftChild) && equals(first.rightChild,second.rightChild);
        return false;
    }

    public void swapRoot(){
        var temp = root.leftChild;
        root.leftChild = root.rightChild;
        root.rightChild=temp;
    }

    public boolean isBinarySearchTree(Node root, int min,int max){
        if(root==null)
            return true;
        if (root.value< min || root.value>max)
            return false;
        return isBinarySearchTree(root.leftChild, min,root.value-1) && isBinarySearchTree(root.rightChild, root.value +1,max);
    }

    public void printNodesAtDistance(int distance){
        printNodesAtDistance(root,distance);
    }

    private void printNodesAtDistance(Node root,int distance){
        if(root==null)
            return;
        else if(distance==0){
            System.out.println(root.value);
            return;
        }
        printNodesAtDistance(root.leftChild,distance-1);
        printNodesAtDistance(root.rightChild,distance-1);

    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null)
            return -1;
        else if (root.leftChild == null && root.rightChild == null)
            return 0;
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }
}
