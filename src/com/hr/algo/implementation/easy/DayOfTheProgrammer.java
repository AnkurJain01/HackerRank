package com.hr.algo.implementation.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DayOfTheProgrammer {

    static String solve(int year){
        // Complete this function
        String date;
        if(year < 1918){
			if(year %4==0){
				date = "12.09."+year;
			}else{
				date = "13.09."+year;
			}
		}
		else if(year == 1918){
			date = "26.09.1918";
		}else if(year % 400 == 0 || (year % 4 ==0 && year%100 != 0)){
			date ="12.09."+year;
		}else{
			date = "13.09."+year;
		}
		
		return date;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
