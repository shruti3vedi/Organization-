package day7_assignment;

public class FixedStack implements Stack {
	private Employee[] stackArray;
	private int top;
	

	public FixedStack() {
		
		stackArray = new Employee[STACK_SIZE];
		top = -1;
		
	}

	@Override
	public void push(Employee emp) throws StackFullException {
		if (top == STACK_SIZE-1) {
			throw new StackFullException("Stack is full");
		}
		stackArray[++top] = emp;
	}

	@Override
	public Employee pop() throws StackEmptyException  {
		if(top<0) {
			throw new StackEmptyException("Stack is empty");
			
		}
		else {
			Employee popEmp= stackArray[top--];
			System.out.println("Employee poped from stack = " + popEmp);
			return popEmp;
			
		}
		
	}

}
