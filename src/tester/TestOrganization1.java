package tester;

import java.util.Scanner;

import com.app.org.Employee;
import com.app.org.Mgr;
import com.app.org.Worker;

public class TestOrganization1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Employee[] org = new Employee[100];
		boolean exit = false;
		int counter = 0;
		int option = 0;
		while (!exit) {
			System.out.println("\nOptions:");
			System.out.println("1. Hire Manager");
			System.out.println("2. Hire Worker");
			System.out.println("3. Display information of all employees");
			System.out.println("4. Update basic salary");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			option = sc.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Enter manager details name, dept, sal, Bonus:");
				org[counter++] = new Mgr(sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble());

				break;
			}
			case 2: {
				System.out.println("Enter Worker details name, dept, sal, hours, rate :");
				org[counter++] = new Worker(sc.next(), sc.next(), sc.nextDouble(), sc.nextInt(), sc.nextDouble());

				break;
			}
			case 3: {
				System.out.println(" Display information of all employees");
				for (Employee e : org) {
					if (e != null) {
						System.out.println(e);
						System.out.println(e.computeNetSalary());
						if (e instanceof Mgr) {
							System.out.println("Performance bonus = " + ((Mgr) e).getPerformanceBonus());
						}
						if (e instanceof Worker) {
							System.out.println("hourly rate of the worker = " + ((Worker) e).getHourlyRate());
						}
					}
				}
				break;
			}
			case 4: {
				System.out.println("Enter empId");
				int empId = sc.nextInt();
				System.out.println("Enter increment");
				double increment = sc.nextDouble();
				boolean found = false;
				for (Employee e : org) {
					if (e != null && e.getId() == empId) {
						e.setSalary(increment);
						System.out.println("Salary updated");
						found = true;
					} 
					
				}
				if(!found) {
					System.out.println("Invalid empId!!!");
				}
				break;
			}
			case 5: {
				System.exit(0);

				break;
			}

			default:
				System.out.println("Invalid input!!!");
				System.exit(0);
			}
		}

		sc.close();

	}

}
