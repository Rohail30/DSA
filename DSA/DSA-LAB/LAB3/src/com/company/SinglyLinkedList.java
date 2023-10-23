package com.company;

public class SinglyLinkedList {
    private Node first;

    public void exp(){

        Node newNode = new Node();
        System.out.println(newNode.next);

        /*Node current = first;
        Node Last=first;
        while (current != null) {
            Last=current;
            current = current.next;
        }
        System.out.println(Last.data);*/
    }

    public SinglyLinkedList() {
        this.first = null;
    }

    public void insertFirst(int data) { //O(1)
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }



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

    public void common(){
        System.out.println("Common items are");
        Node Pointer1 =first;
        Node current = first;
        int ok=0;
        while (Pointer1!=null) {
            while (current!=null){
                if (Pointer1.data == current.data) {
                    ok++;
                }
                current = current.next;
            }
            current=first;
            if(ok>1){
                System.out.println(Pointer1.data);
            }
            ok=0;
            Pointer1 = Pointer1.next;
        }
    }

    public void displayList() { //O👎
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void product(){
        Node current = first;
        int prod = 1;
        while (current!=null){
            prod = prod*current.data;
            current=current.next;
        }
        System.out.println("Product is: "+prod);
    }

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

    public void reverse(){
        int count = listLength();
        System.out.println("Reverser Order");
        int[] arr = new int[count + 1];
        Node current = first;
        int i = 0;
        while (current != null) {
            arr[i] = current.data;
            i++;
            current = current.next;
        }
        for (int j = arr.length; j > 0; j--) {
            System.out.print(+arr[j - 1] + " ");
        }
        System.out.println("");
    }

    public void distinct(){
        Node pointer1 = first;
        Node current = first;
        int ok =0;
        while (current!=null){
            while (pointer1!=null){
                if(current.data==pointer1.data){
                    ok++;
                }
                pointer1=pointer1.next;
            }
            if(ok<=1){
                System.out.println(current.data);
            }
            ok=0;
            pointer1=first;
            current=current.next;
        }
    }

    public void replace(int f, int r) { //O(n)
        boolean found = false;
        Node current = first;
        while (current != null) {
            if (current.data == f) {
                found = true;
                current.data = r;
            }
            current = current.next;
        }
        if (found) {
            System.out.println("Data Replaced");
        } else {
            System.out.println("Data Not Found");
        }
    }

    public void even(){
        Node current = first;
        System.out.println("Even List ");
        while (current!=null){
            if(current.data%2==0){
                System.out.print(" "+current.data);
            }
            current=current.next;
        }
        System.out.println();
    }

    public void odd(){
        Node current = first;
        System.out.println("Odd List ");
        while (current!=null){
            if(current.data%2==1){
                System.out.print(" "+current.data);
            }
            current=current.next;
        }
        System.out.println();
    }

    public void prime(){
        Node current = first;
        int num = 0;
        System.out.println("Prime List");
        while (current!=null){
            for (int i = 1; i <= current.data; i++) {
                if(current.data%i==0){
                    num++;
                }
            }
            if (num<=2){
                System.out.println(current.data);
            }
            num=0;
            current = current.next;
        }
    }

    public void insertMid(int data){
        Node current = first;
        Node newNode = new Node();
        newNode.data = data;
        int mid = listLength()/2;
        int num=0;

        while (current!=null){
            if(num==mid){
                newNode.next = current.next;
                current.next = newNode;
            }
            num++;
            current=current.next;
        }
    }

    public void deleteMid(){
        Node current = first;
        int mid = listLength()/2;
        int num=1;
        while (current!=null){
            if(num==mid){
                current.next = current.next.next;
            }
            num++;
            current=current.next;
        }
    }

    public void delete(int item){
        Node current = first.next;
        Node previous = first;
        int flag = 0;
        if(isEmpty()){
            System.out.println("List is Empty");
        }
        else if(item==first.data){
            first= first.next;
        }
        else{
            while (previous!=null){
                if(current.data==item){
                    previous.next=current.next;
                    current=null;
                    break;

                }
                previous = previous.next;
                current = current.next;

            }
        }

        if(flag==0){
            System.out.println("item does not exist in the list");
        }
    }


    public void insertLast(int data) { //O(1)
        Node newNode = new Node();
        newNode.data = data;
        Node current =first;
        while (current.next!=null){
            current = current.next;
        }
        current.next=newNode;
    }

    public void deleteLast(){
        Node current =first;
        while(current.next.next!=null){
            current = current.next;
        }
        current.next=null;
    }

    public void find(int x) { //O(n)
        boolean found = false;
        Node current = first;
        while (current != null) {
            if (current.data == x) {
                found = true;
            }
            current = current.next;
        }
        if (found) {
            System.out.println("Data Found");
        } else {
            System.out.println("Data Not Found");
        }
    }

    public int listLength() {  //O👎
        int length = 0;
        Node current = first;
        while (current.next != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public void reverse1(){
        Node prev = first;
        Node current = first.next;

        while (current!=null){
            Node nextNode = current.next;
            current.next=prev;

            prev = current;
            current = nextNode;
        }
    }

    public void insertAfter(int position, int data){
        if(position>listLength()){
            System.out.println("Position does not exist");
        }
        else{
            Node current = first;
            int count = 1;
            while(count!=position){
                current=current.next;
                count++;
            }
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    /*public void reverse2(){
        Node current = first;public void insertAfter(int position, int data){
            if(position>listLength()){
                System.out.println("Position does not exist");
            }
            else{
                Node current = first;
                int count = 1;
                while(count!=position){
                    current=current.next;
                    count++;
                }
                Node newNode = new Node();
                newNode.data = data;
                newNode.next = current.next;
                current.next = newNode;
            }
        }
        Node prev = first;
        int flag=0;
        while (current.next!=null){
            current=current.next;
        }
        while (flag==0) {
            while (prev.next != current) {
                prev = prev.next;
            }
            current.displayNode();
            current = prev;
            prev = first;
            if(current==first){
                flag=1;
            }
        }
        first.displayNode();
        System.out.println();
    }*/

    public boolean isEmpty(){
        return (first==null);
    }

    public Node deleteFirst(){
        Node temp=first;
        if(!isEmpty()){
            first=first.next;
        }
        return temp;
    }


}