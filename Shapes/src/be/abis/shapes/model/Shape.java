package be.abis.shapes.model;

import be.abis.shapes.enumeration.Color;

public abstract class Shape {
    
	 private Color color;
	 private Point origin;

	 public Shape(Color color, Point origin) {
		this.color = color;
		this.origin = origin;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public Point getOrigin() {
		return origin;
	}

	public void setOrigin(Point origin) {
		this.origin = origin;
	}

	public abstract double area();

	 public String toString(){
		String sentence =  "This is a " + this.color + " " + this.getClass().getSimpleName().toLowerCase() + ". ";
		sentence+="Dimensions: " + this.getDimensionSentence() + ".";
		sentence+=" The area is " + this.area() +".";
		return sentence;
	 }

	 public abstract String getDimensionSentence();

}
