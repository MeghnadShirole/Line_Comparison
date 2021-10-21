package com.company;

import java.util.Scanner;

class LineComparison{

    double LengthOfLine=0;
    double LengthOfLine_2=0;
    Scanner sc=new Scanner(System.in);

    public void findLength()
    {
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
    }

    Double l1=LengthOfLine;
    Double l2=LengthOfLine_2;
    public void equalTo()
    {
        if (l1.equals(l2))
        {
            System.out.println("two line are equal");
        }
        else
            System.out.println("two lines are not equal");
    }

    public void compareTo()
    {
        if (l1.compareTo(l2)==0)
        {
            System.out.println("two line are equal");
        }
        else if(l1.compareTo(l2) > 0)
        {
            System.out.println("1st line is greater then second");
        }
        else
        {
            System.out.println("1st line is lesser then second ");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("welcome to line comparison computational program");
        LineComparison L1=new LineComparison();
        L1.findLength();
        L1.equalTo();
        L1.compareTo();
    }
}
