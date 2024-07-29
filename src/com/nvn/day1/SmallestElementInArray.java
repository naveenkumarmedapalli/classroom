package com.nvn.day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SmallestElementInArray {
    public static void main(String[] args) {
        int[] arr = {9, 101, 8, 100, 55, 4,-7};

        //method-1
        // time complexity O(n log(n))
        Arrays.sort(arr);
        System.out.println(STR."SmallestElementInArray method-1: \{arr[0]}");

        //method-2
        System.out.println(STR."SmallestElementInArray method-2: \{Arrays.stream(arr).min().getAsInt()}");

        //method-3
        int ans = arr[0];
        for(int i= 1; i<arr.length;i++){
            if ( arr[i] < ans){
                ans = arr[i];
            }
        }
        System.out.println(STR."SmallestElementInArray method-3: \{ans}");

        //method-4
        for (int i = 0; i < arr.length; i++){
            for(int j= i+1; j < arr.length;j++){
                int temp = 0 ;
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(STR."SmallestElementInArray method-4: \{arr[0]}");

        
    }
}
