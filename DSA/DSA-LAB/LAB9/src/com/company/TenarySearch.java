package com.company;

public class TenarySearch {
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
    public int recursiveTernarySearch(int[] array, int target, int left, int right) {
        if (left > right)
            return -1;

        int partitionSize = (right - left) / 3;
        int mid1 = left + partitionSize;
        int mid2 = right - partitionSize;

        if (array[mid1] == target)
            return mid1;

        if (array[mid2] == target)
            return mid2;

        if (target < array[mid1])
            return recursiveTernarySearch(array, target, left, right = mid1 - 1);


        if (target > array[mid2])
            return recursiveTernarySearch(array, target, left = mid2 + 1, right);

        return recursiveTernarySearch(array, target, left = mid1 + 1, right = mid2 - 1);

    }
}
