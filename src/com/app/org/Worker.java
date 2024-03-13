package com.app.org;

public class Worker extends Emp {
	
	private int hoursWorked;
	private double hourlyRate;
	
	public Worker(String name, String dept, double sal, int hoursWorked, double hourlyRate) {
		super(name, dept, sal);
		this.hoursWorked =hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	public String toString() {
		return "Worker details: " + super.toString() + " hoursWorked = " + hoursWorked + " hourlyRate " + hourlyRate;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	
	public double getHourlyRate() {
		return hourlyRate;
	}
	@Override
	public double computeNetSalary() {
		return getSalary() + (getHoursWorked()*getHourlyRate());
	}

}
