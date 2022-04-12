package com.bridgelabassignmentday8;
/*
 * Author: Prasad
 * Line comparision program
 */
import java.util.Scanner;

public class LineComparison {
	int x1;
	int y1;
	int x2;
	int y2;
	int x3;
	int y3;
	int x4;
	int y4;
	
	public void input() {
		//input the coordinates
		Scanner sc = new Scanner(System.in);
		//for first line
		System.out.println("Enter the value of x coordinate for point 1 :");
		x1 = sc.nextInt();
		System.out.println("Enter the value of y coordinate for point 1 :");
		y1 = sc.nextInt();
		System.out.println("Enter the value of x coordinate for point 2 :");
		x2 = sc.nextInt();
		System.out.println("Enter the value of x coordinate for point 2 :");
		y2 = sc.nextInt();
        //for second line
		System.out.println("Enter the value of x coordinate for point 3 :");
		x3 = sc.nextInt();
		System.out.println("Enter the value of y coordinate for point 3 :");
		y3 = sc.nextInt();
		System.out.println("Enter the value of x coordinate for point 4 :");
		x4 = sc.nextInt();
		System.out.println("Enter the value of x coordinate for point 4 :");
		y4 = sc.nextInt();
	}
	
	public void checkEquality() {
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
	
	public void compareTwoLines() {
		//calculate length of first line
		double l1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		//calculate length of second line
		double l2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        System.out.println("Length of first line :" + l1);
        System.out.println("Length of second line line :" + l2);
        
        //converting double to string
        String length1 = String.valueOf(l1);
        String length2 = String.valueOf(l2);
        
        int compare = (length1.compareTo(length2));
        if (compare > 0) {
        	System.out.println(l1 + " " + "is greater than" + " " + l2);
        }
        else if (compare < 0) {
        	System.out.println(l1 + " " + "is less than" + " "+ l2);
        }
        else {
        	System.out.println(l1 + " " + "is equal to" + " " + l2);
        }
	}

	public static void main(String[] args) {
		LineComparison obj = new LineComparison();
		obj.input();
		obj.checkEquality();
		obj.compareTwoLines();

	}

}
