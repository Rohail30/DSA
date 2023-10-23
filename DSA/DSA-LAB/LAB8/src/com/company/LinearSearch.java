package com.company;

public class LinearSearch {
    public int linearSearch(int[] a,int x){
        for (int i = 0; i < a.length; i++) {
            if(a[i]==x){
                System.out.print("Data found at index: ");
                return i;
            }

        }
        System.out.println("Data does not exist in the array");
        return -1;
    }
}
