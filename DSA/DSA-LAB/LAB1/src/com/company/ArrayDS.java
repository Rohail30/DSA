package com.company;

public class ArrayDS {
    private int[] items;
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

    public void delete(int item){

        for (int i = 0; i <count ; i++) {
            if (item == items[i]) {
                //items[i] = 0;
                for (int j = i; j <count-1 ; j++) {
                    items[j] = items[j+1];
                }
            }
        }
        count--;
    }

    public void find(int index){
        for (int i = 0; i <items.length ; i++) {
            if(index == i){
                System.out.println("Item at index: "+i+" is "+items[i]);
            }
        }
    }

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

