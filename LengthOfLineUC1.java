package com.bridgelabassignmentday8;

import java.util.Scanner;

/*
 * Author: Prasad
 * Model a line based on a point consisting of (x,y) coordinates using the cartesian system
 * and calculate its length
 */
public class LengthOfLineUC1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//input the coordinates
		System.out.println("Enter the value of x coordinate for point 1 :");
		int x1 = sc.nextInt();
		System.out.println("Enter the value of y coordinate for point 1 :");
		int y1 = sc.nextInt();
		System.out.println("Enter the value of x coordinate for point 2 :");
		int x2 = sc.nextInt();
		System.out.println("Enter the value of x coordinate for point 2 :");
		int y2 = sc.nextInt();
		//calculate length
		double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("The length of line is :" + length);
	}

}
