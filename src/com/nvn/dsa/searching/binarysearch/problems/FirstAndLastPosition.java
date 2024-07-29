package com.nvn.dsa.searching.binarysearch.problems;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 7, 8, 8, 10};
        int target = 10;
        searchRange(arr, target);

    }

    private static void searchRange(int[] arr, int target) {
        int start = search(arr, target, true);
        int end = search(arr, target, false);
        System.out.println(STR."start \{start} end \{end}");
    }


    private static int search(int[] numbers, int target, boolean findStartIndex) {
        int ans = -1;
        int startIndex = 0;
        int endIndex = numbers.length - 1;
        while (startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            if (numbers[middleIndex] == target) { //{99, 100, 100, 102, 110, 120};
                ans = middleIndex;
                if (findStartIndex) {
                    endIndex = middleIndex - 1;
                } else {
                    startIndex = middleIndex + 1;
                }
            } else if (numbers[middleIndex] > target) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }
        return ans;
    }
}
