package com.bridgelabassignmentday8;
/*
 *Author: Prasad
 *Program to check equality of two lines based on end points so that two know when two
 *lines are equal 
 */
import java.util.Scanner;

public class CheckEqualityUC2 {

	public static void main(String[] args) {
		//input the coordinates
		Scanner sc = new Scanner(System.in);
		//for first line
		System.out.println("Enter the value of x coordinate for point 1 :");
		int x1 = sc.nextInt();
		System.out.println("Enter the value of y coordinate for point 1 :");
		int y1 = sc.nextInt();
		System.out.println("Enter the value of x coordinate for point 2 :");
		int x2 = sc.nextInt();
		System.out.println("Enter the value of x coordinate for point 2 :");
		int y2 = sc.nextInt();
        //for second line
		System.out.println("Enter the value of x coordinate for point 3 :");
		int x3 = sc.nextInt();
		System.out.println("Enter the value of y coordinate for point 3 :");
		int y3 = sc.nextInt();
		System.out.println("Enter the value of x coordinate for point 4 :");
		int x4 = sc.nextInt();
		System.out.println("Enter the value of x coordinate for point 4 :");
		int y4 = sc.nextInt();
		
		//calculate length of first line
		double l1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		//calculate length of second line
		double l2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        System.out.println("Length of first line :" + l1);
        System.out.println("Length of second line line :" + l2);
        //converting double to string
        String length1 = String.valueOf(l1);
        String length2 = String.valueOf(l2);
        
        if (length1.equals(length2)) {
        	System.out.println("Two lines are equal");
        }
        else {
        	System.out.println("Two lines are not equal");
        }
	}

}
