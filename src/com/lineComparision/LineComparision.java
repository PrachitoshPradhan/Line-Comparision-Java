package com.lineComparision;
import com.lineComparision.Line;
import java.util.Scanner;

public class LineComparision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double X1 = sc.nextDouble();
		double Y1 = sc.nextDouble();
		double X2 = sc.nextDouble();
		double Y2 = sc.nextDouble();

		Line l = new Line(X1,Y1,X2,Y2);
		double LineLength = l.length();
		System.out.println("The computed length of the line is "+ LineLength);
		sc.close();
	}

}