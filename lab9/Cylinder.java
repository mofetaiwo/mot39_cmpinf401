package edu.pitt.lab9;

public class Cylinder extends Circle {
	private double height = 1.0;
	
	public Cylinder() {
		super();
		this.height = 0;
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public Cylinder(double radius,double height, String color) {
		super(radius, color);
		this.height = height;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	/**
	 * @return the volume
	 */
	public double getVolume() {
		return Math.PI * Math.pow(getRadius(), 2) * height;
	}
}
