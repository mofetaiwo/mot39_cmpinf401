package edu.pitt.lab6;

/**
 * Class MyRectangle
 * Created 13/10/2022
 */
public class MyRectangle {
	private int width;
	private int height;
	private int startX;
	private int startY;
	
	public MyRectangle() {
		this.width = 0;
		this.height = 0;
		this.startX = 0;
		this.startY = 0;
	}

	public MyRectangle(int x, int y, int w, int h) {
		this.startX = x;
		this.startY = y;
		this.width = w;
		this.height = h;
	}

	public int area() {
		return width * height;
	}

	// A StringBuilder is utilized. It can be modified without having to
	// create a new object each time (unlike a String).
	public String toString() {
		StringBuilder S = new StringBuilder();
		S.append("Width: " + width);
		S.append(" Height: " + height);
		S.append(" X: " + startX);
		S.append(" Y: " + startY);
		return S.toString();
	}

	/*
	 * returns true if the point (x, y) is inside or on the borders
	 * of the rectangle and false otherwise
	 */
	public boolean isInside(int x, int y) {
		int endX = width + startX;
		int endY = height + startY;
		
		if ((x >= startX && x <= endX) && (y >= startY && y <= endY)) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * 
	 * @param set newWidth to width
	 * @param set newHeight to height
	 */
	public void setSize(int newWidth, int newHeight) {
		this.width = newWidth;
		this.height = newHeight;
	}

	/**
	 * 
	 * @param set newX to startX
	 * @param set newY to startY
	 */
	public void setPosition(int newX, int newY) {
		this.startX = newX;
		this.startY = newY;
	}
}
