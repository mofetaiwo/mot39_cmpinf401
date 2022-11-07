package edu.pitt.lab9;

public class Staff extends Person {
	private String school;
	private double pay;
	
	public Staff(String name, String address, double pay) {
		super();
		this.pay = pay;
	}

	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}

	/**
	 * @return the pay
	 */
	public double getPay() {
		return pay;
	}

	/**
	 * @param pay the pay to set
	 */
	public void setPay(double pay) {
		this.pay = pay;
	}
	
	public String toString() {
		return "School: " + school + " " + "Pay: " + pay;
	}
}
