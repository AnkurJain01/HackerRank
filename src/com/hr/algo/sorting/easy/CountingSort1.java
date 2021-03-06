package com.hr.algo.sorting.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountingSort1 {

    static int[] countingSort(int[] arr) {
        // Complete this function
    	
    	int[] counterArray = new int[100];
		
		int[] sortedArray = new int[arr.length];
		
		// count no of occurences of each digit
		for(int i = 0; i < arr.length; i++){
			counterArray[arr[i]]++;
		}
		return counterArray;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = countingSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
