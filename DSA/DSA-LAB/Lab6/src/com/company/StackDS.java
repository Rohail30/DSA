package com.company;

public class StackDS {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackDS(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (maxSize - 1 == top);
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is fool");
        } else {
            top++;
            stackArray[top] = item;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is fool");
            return -1;
        } else {
            int value = stackArray[top];
            top--;
            return value;
        }
    }

    public int peek() {
        return stackArray[top];
    }

    public void max() {
        int max = peek();
        while (!isEmpty()) {
            if (peek()>max) {
                max = pop();
            } else {
                pop();
            }
        }
        System.out.println("Max is: " + max);
    }

    public void min() {
        int min = peek();
        while (!isEmpty()) {
            if (peek()<min) {
                min = pop();
            } else {
                pop();
            }
        }
        System.out.println("Min is: " + min);
    }

    public void average(){
        int sum = 0, length=0;
        while (!isEmpty()){
            sum=sum+pop();
            length++;
        }
        System.out.println("Average is"+sum/length);
    }

    public void product(){
        int product = 1;
        while (!isEmpty()){
            product*=pop();
        }
        System.out.println("Product is : "+product);
    }


}
