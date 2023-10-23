package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayDS arrayDS = new ArrayDS(5);

        //Inserting items
        System.out.println("---------------------------------");
        arrayDS.insert(1);
        arrayDS.insert(2);
        arrayDS.insert(3);
        arrayDS.insert(4);
        arrayDS.insert(5);
        arrayDS.insert(-2);
        arrayDS.insert(8);
        arrayDS.insert(7);
        arrayDS.insert(13);
        arrayDS.insert(9);
        arrayDS.insert(7);
        arrayDS.insert(15);
        arrayDS.insert(-7);
        arrayDS.insert(5);
        arrayDS.insert(-36);

        System.out.println("---------------------------------");
        arrayDS.details();
        arrayDS.print();

        //Removing Item at given index
        System.out.println("---------------------------------");
        arrayDS.removeAt(3);
        System.out.println("After Removing item of index 3");
        arrayDS.print();

        //Finding an item or index
        System.out.println("---------------------------------");
        arrayDS.find(4);
        arrayDS.indexOf(7);

        //Finding Max Value:Q1
        System.out.println("---------------------------------");
        arrayDS.maxValue();

        //Finding Common items in two arrays:Q2
        System.out.println("---------------------------------");
        System.out.println("Common Items are");
        arrayDS.commonArray();

        //Product of array:Q3
        System.out.println("---------------------------------");
        arrayDS.product();

        //Average of array:Q4
        System.out.println("---------------------------------");
        arrayDS.average();

        //Reverse of array:Q5
        System.out.println("---------------------------------");
        arrayDS.reverse();

        //Distinct numbers in array:Q6
        System.out.println("---------------------------------");
        arrayDS.distinct();

        //Replacing any number in array:Q7
        System.out.println("---------------------------------");
        arrayDS.replace(2,45);

        //Even numbers in array:Q8
        System.out.println("---------------------------------");
        arrayDS.even();

        //Odd numbers in array:Q9
        System.out.println("---------------------------------");
        arrayDS.odd();

        //Prime numbers in array:Q10
        System.out.println("---------------------------------");
        arrayDS.prime();

        //Negative numbers in array:Q11
        System.out.println("---------------------------------");
        arrayDS.neg();

        //count Negative & Positive Numbers from Array:Q12
        System.out.println("---------------------------------");
        arrayDS.negativeAndPostive();

        //Fibonacci Series:Q13
        System.out.println("---------------------------------");
        arrayDS.fib(8);

        //Factorial:Q14
        System.out.println("---------------------------------");
        arrayDS.fac(5);

        //Power:Q15
        System.out.println("---------------------------------");





        //arrayDS.removeAt(3);
        //arrayDS.delete(2);
        /*arrayDS.print();


        int index=arrayDS.indexof(3);
        if(index!=-1)
            System.out.println("Value found at index = "+index);
        else
            System.out.println("Value not found!");
        arrayDS.print();
        arrayDS.maxValue();
        arrayDS.product();
        arrayDS.average();
        arrayDS.reverse();
        arrayDS.even();
        arrayDS.odd();
        arrayDS.replace(2,45);
        arrayDS.swap(1,3);
        System.out.println("");
        arrayDS.print();
        arrayDS.fac(4);
*/

    }
}

