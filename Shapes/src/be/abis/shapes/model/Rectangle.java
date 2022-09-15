package be.abis.shapes.model;

import be.abis.shapes.enumeration.Color;

public class Rectangle extends Shape {

	private double height;
	private double width;
	
	public Rectangle(Color color, Point origin, double height, double width) {
		super(color, origin);
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double area() {
		double area = height*width;
		return area;
	}

	@Override
	public String getDimensionSentence() {
		return "heigt= " + height + ", width= " +width;
	}

}
