package com.nvn.dsa.searching.binarysearch.problems;

public class SearchElementInInfinitySortedArray {
    public static void main(String[] args) {
        int[] arr = {
                //1, 2, 3, 4, 45, 86, 98, 99, 100, 110, 120, 130, 131, 140, 150, 160,170,180
                3,5,7,9,10,90,100,130,140,160,170
        };

        ans(arr, 10);
    }

    private static void ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newstart = end + 1;
            end = start + (end - start + 1) * 2; // 5 + (8-5 +1) *2
            start = newstart;
        }
        System.out.println(search(arr, target, start, end));

    }

    private static int search(int[] arr, int target, int startIndex, int endIndex) {

        while (startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            if (arr[middleIndex] == target) {
                return middleIndex;
            } else if (arr[middleIndex] > target) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }
        return -1;
    }
}
