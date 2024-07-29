package com.nvn.dsa.searching.binarysearch.problems;
/*
ceiling of the given number in the array
        I/P: {99, 100, 101, 102, 110, 120};
        target : 119
        O/P: 120
*/

public class CeilingOfGivenNumber {

    public static void main(String[] args) {
        int[] arr = {99, 100, 101, 102, 110, 120};
        int ceil = ceilOfGivenNumber(arr, 119);
        System.out.println(ceil);
    }

    private static int ceilOfGivenNumber(int[] arr, int number) {
        int startIndex = 0;
        int endIndex = arr.length - 1;

        if (arr[endIndex] < number) return -1;

        while (startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            if (arr[middleIndex] == number) {
                return arr[middleIndex];
            } else if (arr[middleIndex] > number) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }

        return startIndex;
    }
}
