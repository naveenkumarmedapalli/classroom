package com.nvn.dsa.searching.binarysearch.problems;

public class SmallestLetterGrateThanTarget {
    public static void main(String[] args) {

        char[] ch = {'c','f','j'};
        char target = 'g';
        System.out.println(ceiling(ch,target));
    }
    private static char ceiling(char[] arr, char target){
        int startIndex = 0;
        int endIndex = arr.length - 1;

        while (startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            if (arr[middleIndex] == target) {
                return arr[middleIndex];
            } else if (arr[middleIndex] > target) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }
        return arr[startIndex % arr.length];
    }
}
