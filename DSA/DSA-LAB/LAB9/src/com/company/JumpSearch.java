package com.company;

public class JumpSearch {

    public void sort(int[] arr){
        int minimum;
        for (int i = 0; i < arr.length - 1; i++) {
            minimum = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minimum]) {
                    minimum = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = temp;
        }
    }

    public int jumpSearch(int[] a, int x){
        //sort(a);
        int blockSize = (int)Math.sqrt(a.length);
        int start=0;
        int end=blockSize;
        while (start<a.length && a[end-1]<x){
            start=end;
            end=end+blockSize;
            if(end>a.length){
                end=a.length;
            }
        }
        for (int i = start; i <end ; i++) {
            if(a[i]==x){
                return i;
            }
        }
        return-1;
    }
}