package be.abis.shapes.model;

import be.abis.shapes.enumeration.Color;

public class Triangle extends Shape {

	private double height;
	private double base;

	public Triangle(Color color, Point origin, double height, double base) {
		super(color, origin);
		this.height = height;
		this.base = base;
	}

	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public double area() {
		double area = (height*base)/2;
		return area;
	}

	@Override
	public String getDimensionSentence() {
		return "height= " + height + ", base= " +base;
	}



}
