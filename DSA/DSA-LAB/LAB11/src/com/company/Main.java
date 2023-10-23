package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MergeSort ms = new MergeSort();
        QuickSort qs = new QuickSort();
        int[] a = {4,3,2,1};
        //ms.sort(a);
        qs.sort(a,0,a.length-1);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();

    }
}
