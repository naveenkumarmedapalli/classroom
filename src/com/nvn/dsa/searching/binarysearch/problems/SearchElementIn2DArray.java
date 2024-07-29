package com.nvn.dsa.searching.binarysearch.problems;
/*
    Search Element In 2D Array but array not completely sorted.
        row wise sorted and column wise sorted
        I/P: {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {18, 26, 37, 49},
                {28, 34, 48, 56}
        };
        target : 37
        O/P: [2,2]

        target : 38
        O/P: [-1,-1]
*/
import java.util.Arrays;

public class SearchElementIn2DArray {

    public static void main(String[] args) {
        //array row wise sorted and column wise sorted but not strictly sorted.
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {18, 26, 37, 49},
                {28, 34, 48, 56}
        };
        int target = 59;

        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] search(int[][] arr, int target) {
        int row = 0;
        int col = arr.length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return new int[]{row, col};
            } else if (arr[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return new int[]{-1, -1};
    }


}
