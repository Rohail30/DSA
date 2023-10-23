package com.company;

public class BinarySearch {

    public void sort(int[] a){
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j]>a[j+1]){
                    temp = a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
    }

    public void binarySearch(int[] a,int x){
        //sort(a);
        int condition = 0;
        int s = 0;
        int e = a.length-1;
        int m = (s+e)/2;
        while (s<=e) {
            if(a[m]==x){
                System.out.println("Data found at index: "+m);
                condition++;
                break;
            }
            else if (x > a[m]) {
                s = m + 1;
                m = (s+e)/2;
            }
            else {
                e = m - 1;
                m = (s+e)/2;
            }
        }
        if(condition==0){
            System.out.println("Not found");
        }

    }
}
