package com.nvn.dsa.searching.binarysearch;
// BinarySearch algorithm
public class Binary_Search {
    public static void main(String[] args) {
        int[] arrAsc = {99, 100, 101, 102, 110, 120};
        int[] arrDsc = {120, 110, 102, 101, 100, 99};

        int searchElement = 100;
        boolean isAscArray = true;
        if (arrAsc[0] > arrAsc[arrAsc.length - 1]) {
            isAscArray = false;
        }
        int resultIndex = findElementFromOneDimArray(arrAsc, searchElement, 0, arrAsc.length - 1, isAscArray);
        System.out.println(resultIndex);
    }

    private static int findElementFromOneDimArray(int[] arr, int searchElement, int startIndex, int endIndex, boolean isAscArray) {

        if(arr.length == 0) return -1;

        while (startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            if (arr[middleIndex] == searchElement) {
                return middleIndex;
            }
            if (isAscArray) {
                if (arr[middleIndex] > searchElement) {
                    endIndex = middleIndex - 1;
                } else {
                    startIndex = middleIndex + 1;
                }
            } else {
                if (arr[middleIndex] > searchElement) {
                    startIndex = middleIndex + 1;
                } else {
                    endIndex = middleIndex - 1;
                }
            }
        }
        return -1;
    }
}
