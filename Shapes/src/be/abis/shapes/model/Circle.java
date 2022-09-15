package be.abis.shapes.model;

import be.abis.shapes.enumeration.Color;

public class Circle extends Shape {

	private double radius;

	public Circle(Color color, Point origin, double radius) {
		super(color, origin);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI*radius*radius;
	}

	@Override
	public String getDimensionSentence() {
		return "radius= " + radius;
	}


}
