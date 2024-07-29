package com.nvn.dsa.searching.linersearch;

public class Linear_Search {

    public static void main(String[] args) {

        int[] oneDimArray = {90, 14, 34, 73, 25, 94, 92, 13, 95, 50, 75};

        int[][] twoDimArray = {
                {90, 14, 34, 73},
                {25, 94},
                {92, 13, 95, 50, 75}
        };

        //print the array
        print(oneDimArray);
        System.out.println();
        print(twoDimArray);

        System.out.println();

        //search the element in one Dim Array
        int targetElement = 76;
        int index = findElementFromOneDimArray(oneDimArray, targetElement);
        System.out.println(STR."\{targetElement} target element - index position in the given oneDimArray is \{index}");
        System.out.println();
        int[] indexPositions = findElementFromTwoDimArray(twoDimArray, targetElement);
        System.out.println(STR."\{targetElement} target element - index position in the given twoDimarray is \{indexPositions[0]} and \{indexPositions[1]}");

    }

    private static int[] findElementFromTwoDimArray(int[][] twoDimArray, int targetElement) {
        if (twoDimArray.length == 0) return new int[]{-1, -1};

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (twoDimArray[i][j] == targetElement) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    private static int findElementFromOneDimArray(int[] oneArray, int targetElement) {

        if (oneArray.length == 0) return -1;

        for (int i = 0; i < oneArray.length; i++) {
            if (oneArray[i] == targetElement) {
                return i;
            }
        }
        return -1;
    }


    static void print(int[][] arr) {
        //print elements
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(STR."\{anInt}   ");
            }
            System.out.println();
        }
    }

    static void print(int[] arr) {
        //print elements
        for (int j : arr) {
            System.out.print(STR."\{j}   ");
        }
    }
}
