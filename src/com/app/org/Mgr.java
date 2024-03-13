package com.app.org;

public class Mgr extends Emp {
	
	private double performanceBonus;
	
	public Mgr(String name, String dept, double sal, double performanceBonus) {
		super(name, dept, sal);
		this.performanceBonus= performanceBonus;
	}
	
	public String toString() {
		return "Mgr details: " + super.toString() + " Bonnus = " + performanceBonus;
	}
	public double getPerformanceBonus() {
		return performanceBonus;
	}
	@Override
	public double computeNetSalary() {
		return getSalary() + getPerformanceBonus();
	}

}
