package Suhaibcom.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = {2,5,9,6,4,1,7,11,18,13,17,12};
        //bubbleSort(array);
        //selectionSort(array);
        insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();

    }

    public static void insertionSort(int[] a){
        for (int i = 1; i < a.length; i++) {
            int element = a[i];
            int j=i-1;
            while (j>=0 && a[j]>element ){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=element;
        }
    }

    public static void selectionSort(int[] a){
        int temp;
        int min;
        for (int i = 0; i < a.length-1; i++) {
            min = i;
            for (int j = i; j < a.length; j++) {
                if(a[j]<a[min]){
                    min = j;
                }
            }
            temp = a[min];
            a[min]=a[i];
            a[i] = temp;
        }
    }

    public static void bubbleSort(int[] a){
        int temp;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1; j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }

    public static void bubbleSortRecursive(){

    }

}
