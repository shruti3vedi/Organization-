package day7_assignment;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stack = null;
		boolean exit = false;
		while (!exit) {
			System.out.println("Option 1. Choose Fixed Stack, 2. Choose Growable Stack, 3. Push data,"
					+ " 4. Pop data & display the same, 5.  Exit");
			System.out.println("choose");
			switch (sc.nextInt()) {
			case 1: {
				stack = new FixedStack();
				System.out.println("Fixed stack choosen");
				break;
			}

			case 2: {
				stack = new GrowableStack();
				System.out.println("Growable stack choosen");
				break;
			}
			case 3: {
				try {
					if(stack == null) {
						throw new IllegalStateException("no stack choosen");
						
					}
					System.out.println("Enter employee details");
					System.out.println("id: " );
					int id = sc.nextInt();
					System.out.println("Name: ");
					String name = sc.next();
					System.out.println("Salary: ");
					double salary = sc.nextDouble();
					stack.push(new Employee(id, name, salary));
					System.out.println("Employee details pushed");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			case 4: {
				try {
					if(stack == null) {
						throw new IllegalStateException("no stack choosen");
					}
					Employee popEmp = stack.pop();
					System.out.println("pop employee details" + popEmp);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			case 5: {
				System.out.println("Exit the program");
				System.exit(0);
				break;
			}
			default:
				System.out.println("Invalid choice");
			}
		}
		sc.close();

	}

}
