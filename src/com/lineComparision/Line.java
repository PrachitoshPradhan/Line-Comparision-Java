package com.lineComparision;

public class Line {
	public double x1;
	public double y1;
	public double x2;
	public double y2;
	
	Line(double x1,double y1,double x2,double y2)
	{
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	public double length()
	{
		double x_diff = (this.x2 - this.x1);
		double y_diff = (this.y2 - this.y1);
		return Math.sqrt(Math.pow(x_diff, 2) + Math.pow(y_diff, 2));
	}

}
