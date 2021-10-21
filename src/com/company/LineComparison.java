package com.company;

import java.util.Scanner;

public class LineComparison{

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Problem Solution");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of starting point of first line at X axis: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter the value of starting point of first line at Y axis: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter the value of end point of first line at X axis: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter the value of end point of first line at Y axis: ");
        double y2 = sc.nextDouble();

        double LengthOfLine = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1 ),2));
        System.out.println("Length Of Line is : "+LengthOfLine);

        System.out.print("Enter the value of starting point of second line at X axis: ");
        double xx1 = sc.nextDouble();

        System.out.print("Enter the value of starting point of second line at Y axis: ");
        double yy1 = sc.nextDouble();

        System.out.print("Enter the value of end point of second line at X axis: ");
        double xx2 = sc.nextDouble();

        System.out.print("Enter the value of end point of second line at Y axis: ");
        double yy2 = sc.nextDouble();

        double LengthOfLine_2 = Math.sqrt(Math.pow((xx2 - xx1),2) + Math.pow((yy2 - yy1 ),2));
    	System.out.println(LengthOfLine_2);

        Double lineOne = LengthOfLine;
        Double lineTwo = LengthOfLine_2;

        if (lineOne.equals(lineTwo)){
            System.out.println("Two lines are equal");
        }
        else
            System.out.println("Two lines are not equal");
    }
}

