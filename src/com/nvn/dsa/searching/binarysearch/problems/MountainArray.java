package com.nvn.dsa.searching.binarysearch.problems;
/*
    In Mountain Array, find the maximum of the array and print its index
        I/P: {1, 2, 3, 5, 6, 4, 3, 2};
        O/P: 4 (index)
*/
public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 4, 3, 2};
        System.out.println(search(arr));
    }

    private static int search(int[] numbers) {
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int middle = start + (end - start) / 2;
            if (numbers[middle] < numbers[middle + 1]) {
                start = middle + 1;
            } else if (numbers[middle] > numbers[middle + 1]) {
                end = middle;
            }
        }
        return start == end ? start : -1;

    }

}
