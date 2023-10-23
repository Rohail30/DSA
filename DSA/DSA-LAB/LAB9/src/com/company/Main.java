package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JumpSearch js = new JumpSearch();
        TenarySearch ts = new TenarySearch();
        Scanner input = new Scanner(System.in);
        int[] arr = {2,4,6,3,15,14,1,9,5};
        System.out.println("Enter a number to find its index");
        int num = input.nextInt();
        ts.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(ts.recursiveTernarySearch(arr,num,0, arr.length-1));
    }
}
