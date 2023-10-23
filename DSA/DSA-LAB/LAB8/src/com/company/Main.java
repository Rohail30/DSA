package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinearSearch ls = new LinearSearch();
        BinarySearch bs = new BinarySearch();
        Scanner input = new Scanner(System.in);
        int[] arr = {2,4,6,3,15,14,1,9,5};
        bs.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter a number to find its index");
        int num = input.nextInt();
        System.out.println(ls.linearSearch(arr,num));
        bs.binarySearch(arr,num);

    }
}
