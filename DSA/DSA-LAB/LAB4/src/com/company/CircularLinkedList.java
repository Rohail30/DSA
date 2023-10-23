package com.company;

public class CircularLinkedList {
    private Node first;
    private Node last;

    public CircularLinkedList() {
        this.first = null;
        this.last = null;
    }

    public void exp(){
        System.out.println(first.data);
        System.out.println(last.data);
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int data) { //Big O(1)
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
        last.next = newNode;
    }

//    public void insertLast(int data) {
//        Node newNode = new Node();
//        newNode.data = data;
//
//        if (isEmpty()) {
//            first = newNode;
//            newNode.next = first;
//        } else {
//            last.next = newNode;
//            newNode.next = first;
//            last = newNode;
//        }
//    }

    public void max(){
        int max = first.data;
        Node current = first;
        current= current.next;
        while (current!=last){
            if(current.data>max){
                max = current.data;
            }
            current = current.next;
        }
        System.out.println("MAX is:"+max);
    }

    //1
    public void min(){
        int min = first.data;
        Node current = first;
        current= current.next;
        while (current!=last){
            if(current.data<min){
                min = current.data;
            }
            current = current.next;
        }
        System.out.println("Minimum value is:"+min);
    }

    //2
    public void common(){
        System.out.println("Common Items are: ");
        int size = listLength();
        int[] s = new int[listLength() * 2];
        int match = 0;
        int count=0;
        int cond1=0;
        int cond2=0;
        Node loop2 = first;
        Node loop1 = first;
        int ok =0;
        while (cond1!=listLength()+1){
            while (cond2!=listLength()+1){
                if(loop1.data==loop2.data){
                    ok++;
                }
                loop2=loop2.next;
                cond2++;
            }
            if(ok>1){
                s[count]= loop1.data;
                count++;
                System.out.println(loop1.data);
            }
            ok=0;
            cond2=0;
            loop2=first;
            loop1=loop1.next;
            cond1++;
        }
        /*int c=0;
        int i=0;
        while(i!=count) {
            for (int j = 0; j < count; j++) {
                if (s[i] == s[j]) {
                    c = j;
                }
            }
            i++;
            System.out.println(s[c]);
        }*/

    }

    //3
    public void product(){
        Node current = first;
        current= current.next;
        int product = 1;
        while (current!=last){
            product= product* current.data;
            current = current.next;
        }
        System.out.println("Product is:"+product);
    }

    //4
    public void average(){
        Node current = first.next;
        int total = listLength();
        int sum=0;
        while (current!=last){
            sum=sum+current.data;
            current=current.next;
        }
        System.out.println("Average is: "+(sum/total));
    }

    //5
    public void reverse(){
        System.out.println("Reverse Order:");
        Node current = first;
        Node end = last;
        while (end!=first){
            System.out.print(end.data+"-->");
            while (current.next!=end){
                current=current.next;
            }
            end=current;
            current=first;
        }
        System.out.print(end.data);
        System.out.println();
    }

    //6
    public void distinct(){
        System.out.println("Distinct Items are: ");
        int cond1=0;
        int cond2=0;
        Node loop2 = first;
        Node loop1 = first;
        int ok =0;
        while (cond1!=listLength()+1){
            while (cond2!=listLength()+1){
                if(loop1.data==loop2.data){
                    ok++;
                }
                loop2=loop2.next;
                cond2++;
            }
            if(ok==1){
                System.out.println(loop1.data);
            }
            ok=0;
            cond2=0;
            loop2=first;
            loop1=loop1.next;
            cond1++;
        }
    }

    //7
    public void replace(int f, int r) { //O(n)
        boolean found = false;
        Node current = first;
        while (current != last) {
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

    //8
    public void even(){
        Node current = first;
        System.out.println("Even List ");
        while (current!=last){
            if(current.data%2==0){
                System.out.print(" "+current.data);
            }
            current=current.next;
        }
        if(current.data%2==0){
            System.out.print(" "+current.data);
        }
        System.out.println();
    }

    //9
    public void odd() {
        Node current = first;
        System.out.println("Odd List ");
        while (current != last) {
            if (current.data % 2 == 1) {
                System.out.print(" " + current.data);
            }
            current = current.next;
        }
        if (current.data % 2 == 1) {
            System.out.print(" " + current.data);
        }
        System.out.println();
    }

    //10
    public void fac(int num){
        int factorial=1;
        for (int i = 1; i <=num ; i++) {
            factorial=factorial*i;
        }
        System.out.println("Factorial is: "+factorial);
    }

    //11
    public void insertMid(int data){
        Node current = first;
        Node newNode = new Node();
        newNode.data = data;
        int mid = listLength()/2;
        int num=0;

        while (current!=last){
            if(num==mid){
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
            num++;
            current=current.next;
        }
    }

    //12
    public void deleteMid(){
        Node current = first;
        int mid = listLength()/2;
        int num=1;
        while (current!=last){
            if(num==mid){
                current.next = current.next.next;
                break;
            }
            num++;
            current=current.next;
        }
    }

    //13
    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            first = newNode;
            newNode.next = first;
        } else {
            last.next = newNode;
            newNode.next = first;
            last = newNode;
        }
    }

    //14
    public void deleteLast(){
        Node current =first;
        while(current.next!=last){
            current = current.next;
        }
        last=current;
        current.next=first;
        first=current.next;
    }

    public void deleteLast1(){
        Node current =first;
        while(current.next!=last){
            current = current.next;
        }
        last=current;
        last.next=first;
    }


    //15
    public void find(int x) { //O(n)
        boolean found = false;
        Node current = first.next;
        while (current != first) {
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


    public int deletFirst() {
        if (last == first) {
            throw new IllegalArgumentException("Linked List is Empty");
        }
        int temp = first.data;
        first = first.next;
        last.next = first;
        return temp;
    }

    public int listLength(){
        Node current = first.next;
        int num=0;
        while (current!=last){
            num++;
            current= current.next;
        }
        num++;
        return num;
    }



    public void displayList () {
        Node current = first;
        current.displayNode();
        current = current.next;
        while (current != first) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

}

