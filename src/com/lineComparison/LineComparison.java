package com.lineComparison;

import java.util.Scanner;

public class LineComparison {
	int x1;
    int y1;
    int x2;
    int y2;
 
    	// Method to getting line co-ordinates
    public void enterCoordinatesValues() {
    									
    	// Creating object of Scanner class for User Input
    	
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Coordinates of Line x1,y1: ");
        x1 = scan.nextInt();
        y1 = scan.nextInt();
        System.out.println("Enter Coordinates of Line x2,y2: ");
        x2 = scan.nextInt();
        y2 = scan.nextInt();
    }
    public double calculateLength() {
        double length = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        return length;
    }
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program .");
		
		        // Creating Object of LineComparison class
		        LineComparison lineComparison1 = new LineComparison();
		        lineComparison1.enterCoordinatesValues();
		        System.out.print("Length of the Line: " + lineComparison1.calculateLength());

	}

}
