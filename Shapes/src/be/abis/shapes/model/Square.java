package be.abis.shapes.model;

import be.abis.shapes.enumeration.Color;

public class Square extends Shape {

    private double length;

    public Square(Color color, Point origin, double length) {
        super(color, origin);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return Math.pow(length,2);
    }

    @Override
    public String getDimensionSentence() {
        return "length= " + length;
    }

}
