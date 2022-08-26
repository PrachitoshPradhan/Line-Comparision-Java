package com.lineComparision;
import com.lineComparision.Line;
import java.lang.Double;
import java.util.Scanner;

public class LineComparision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("x1= ");
		double X1 = sc.nextDouble();
		System.out.println("y1= ");
		double Y1 = sc.nextDouble();
		System.out.println("x2= ");
		double X2 = sc.nextDouble();
		System.out.println("y2= ");
		double Y2 = sc.nextDouble();
		
		System.out.println("m1= ");
		double M1 = sc.nextDouble();
		System.out.println("n1= ");
		double N1 = sc.nextDouble();
		System.out.println("m2= ");
		double M2 = sc.nextDouble();
		System.out.println("n2= ");
		double N2 = sc.nextDouble();

		Line l1 = new Line(X1,Y1,X2,Y2);
		Line l2 = new Line(M1,N1,M2,N2);
		
		double LineLength1 = l1.length();
		double LineLength2 = l2.length();
		
		System.out.println("The computed length of the line is "+ LineLength1);
		System.out.println("The computed length of the line is "+ LineLength2);
		
		if (LineLength2 == LineLength1)
		{
			System.out.println("Lengths Of Two Lines Are Equal.");
		}
		else if (LineLength2 > LineLength1)
		{
			System.out.println("Line 2 is longer than Line 1.");
		}
		else
		{
			System.out.println("Line 1 is longer than Line 2.");
		}

		sc.close();
	}

}