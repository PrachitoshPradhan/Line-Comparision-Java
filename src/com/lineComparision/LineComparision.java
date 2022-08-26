package com.lineComparision;
import com.lineComparision.Line;
import java.lang.Double;
import java.util.Scanner;

public class LineComparision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("x1= ");
		Double X1 = sc.nextDouble();
		System.out.println("y1= ");
		Double Y1 = sc.nextDouble();
		System.out.println("x2= ");
		Double X2 = sc.nextDouble();
		System.out.println("y2= ");
		Double Y2 = sc.nextDouble();
		
		System.out.println("m1= ");
		Double M1 = sc.nextDouble();
		System.out.println("n1= ");
		Double N1 = sc.nextDouble();
		System.out.println("m2= ");
		Double M2 = sc.nextDouble();
		System.out.println("n2= ");
		Double N2 = sc.nextDouble();

		Line l1 = new Line(X1,Y1,X2,Y2);
		Line l2 = new Line(M1,N1,M2,N2);
		
		Double LineLength1 = l1.length();
		Double LineLength2 = l2.length();
		
		Double LineCompare = (double) Double.compare(LineLength1, LineLength2);
		
		System.out.println("The computed length of the line is "+ LineLength1);
		System.out.println("The computed length of the line is "+ LineLength2);
		
		if (LineCompare == 0)
		{
			System.out.println("Lengths Of Two Lines Are Equal.");
		}
		else if (LineCompare < 0)
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