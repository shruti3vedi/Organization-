package com.app.org;

public abstract class Emp implements Employee {
	private static int idGenerator = 100;
	static {
		idGenerator = 100;
	}
	
	private int id;
	private String name;
	private String deptId;
	private double salary;
	
	public Emp(String name, String dept, double sal){
		this.id=++idGenerator;
		this.name=name;
		this.deptId= dept;
		this.salary= sal;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDeptId() {
		return deptId;
	}

	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double increment) {
		this.salary = salary + increment;
	}

	public double computeNetSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", deptId=" + deptId + ", salary=" + salary + "]";
	}
	
	
}
