package com.app.org;

public interface Employee {
	int getId();
	String getName();
	String getDeptId();
	double getSalary();
	double computeNetSalary();
	void setSalary(double increment);

}
