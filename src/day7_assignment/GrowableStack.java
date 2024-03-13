package day7_assignment;

public class GrowableStack implements Stack {
	private Employee[] stackArray;
	private int top;

	public GrowableStack() {

		stackArray = new Employee[STACK_SIZE];
		top = -1;
	}

	@Override
	public void push(Employee emp) {
		if (top == STACK_SIZE - 1) {
			Employee[] newStackArray = new Employee[2 * STACK_SIZE];
			System.arraycopy(stackArray, 0, newStackArray, 0, STACK_SIZE);
			stackArray = newStackArray;
		}
		stackArray[++top] = emp;
		System.out.println("Employee pushed to growable stack");

	}

	@Override
	public Employee pop() throws StackEmptyException {
		if(top<0) {
			throw new StackEmptyException("Growable stack is empty");
			
		}
		else {
			Employee popEmp = stackArray[top--];
			return popEmp;
		}
		
	}

}
