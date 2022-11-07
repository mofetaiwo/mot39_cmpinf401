package edu.pitt.lab9;

public class Circle {
	private double radius = 5.0;
	private String color = "Green";
	
	public Circle() {
		this.radius = 0;
		this.color = null;
	}
	
	public Circle(double radius) {
		this.radius = radius;
		this.color = null;
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * @return the area
	 */
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}
