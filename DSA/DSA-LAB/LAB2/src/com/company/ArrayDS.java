package com.company;

public class ArrayDS {
    private int[] items;
    private int[] Fibonacci;
    private int[] Power = new int[10];
    private int count;

    public ArrayDS(int length) {
        this.items = new int[length];
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];

            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index){
        if(index<0 || index>= count){
            throw new
                    IllegalArgumentException("Index is not available");
        }
        for (int i = index; i <count-1 ; i++) {
            items[i] = items[i+1
                    ];

        }
        count--;
    }

    public void find(int index){
        if(index<0 || index>= count){
            throw new
                    IllegalArgumentException("Index is not available");
        }
        for (int i = 0; i <items.length ; i++) {
            if(index == i){
                System.out.println("Item at index: "+i+" is "+items[i]);
            }
        }
    }

    public void indexOf(int item){
        int found = 0;
        for (int i = 0; i <count ; i++) {
            if(items[i]==item){
                System.out.println(item+" is at index: "+i);
                found=1;
            }
        }
        if (found==0){
            System.out.println("Item does not exist in the array");
        }

    }

    //Finding Max Value:Q1
    public int maxValue(){
        int max=items[0]; //O(1)
        for (int i = 0; i <count ; i++) { //O(n)
            if(items[i]>max){
                max=items[i];
            }
        }
        System.out.println("Max item is: "+max); //O(1)
        return max; //O(1)
    }

    //Finding Common items in two arrays:Q2
    public void commonArray(){
        int anotherArray[]={2,4,6,8,0,5,11,24};
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < anotherArray.length; j++) {
                if(items[i]==anotherArray[j]){
                    System.out.println(items[i]);
                }
            }

        }
    }

    public void product(){
        int product=1;
        for (int i = 0; i < count ; i++) {
            product=items[i]*product;
        }
        System.out.println("Product of array is: "+product);
    }

    public void average(){
        int sum=0;
        for (int i = 0; i <count ; i++) {
            sum=sum+items[i];
        }
        double average;
        double total=sum;
        average=total/count;
        System.out.println("Avereage is: "+average);
    }

    public void reverse(){
        System.out.println("items in reverse order");
        for (int i = count-1; i >=0 ; i--) {
            System.out.println(items[i]);
        }
    }

    public void distinct(){
        int ok=0;
        System.out.println("Distinct numbers");
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (items[i] == items[j]){
                    ok++;
                }
            }
            if(ok<=1){
                System.out.println(items[i]);
            }
            ok=0;
        }
    }

    public void replace(int index, int value){
        if(index<0 || index>= count){
            throw new
                    IllegalArgumentException("Index is not available");
        }
        else {
            System.out.println("Item at index "+index+" is replaced with "+value);
            items[index] = value;
        }
    }

    public void even(){
        System.out.println("Even list");
        for (int i = 0; i < count ; i++) {
            if(items[i]%2==0){
                System.out.println(items[i]);
            }
        }
    }

    public void odd(){
        System.out.println("Odd list");
        for (int i = 0; i < count ; i++) {
            if(items[i]%2==1){
                System.out.println(items[i]);
            }
        }
    }

    public void prime(){
        System.out.println("Prime list");
        int num=0;
        for (int i = 0; i < count; i++) {
            for (int j = 1; j <=items[i]; j++) {
                if ((items[i] % j) == 0) {
                    num++;
                }
            }
            if(num<=2){
                System.out.println(items[i]);
            }
            num=0;
        }
    }

    public void neg(){
        System.out.println("Negative Numbers List");
        for (int i = 0; i < count; i++) {
            if(items[i]<0){
                System.out.println(items[i]);
            }
        }
    }

    public void negativeAndPostive(){
        int p=0;
        int n=0;
        for (int i = 0; i < count; i++) {
            if(items[i]<0){
                n++;
            }
            else if(items[i]>0){
                p++;
            }
        }
        System.out.println("Total negative numbers are:"+n);
        System.out.println("Total positive numbers are:"+p);
    }

    public void fib(int num){
        System.out.println("Fibonacci Series");
        Fibonacci = new int[num];
        int f = 0;
        int current=0;
        int next=1;
        Fibonacci[0]=0;
        Fibonacci[1]=1;

        for (int i = 0; i <num-2 ; i++) {
            f=current+next;
            //System.out.println(f);
            Fibonacci[i+2]=f;
            current=next;
            next=f;
        }
        for (int i = 0; i < Fibonacci.length; i++) {
            System.out.println(Fibonacci[i]);

        }
    }

    public void fac(int num){
        int factorial=1;
        for (int i = 1; i <=num ; i++) {
            factorial=factorial*i;
        }
        System.out.println("Factorial is: "+factorial);
    }

    /*public void power(int num) {
        Power[]
    }*/

    public void details(){
        System.out.println("Array Size is: "+items.length);
        System.out.println("No of Elements: "+count);
    }

    public void print(){

        for (int i = 0; i < count ; i++) {
            System.out.println(items[i]);
        }
    }




}
