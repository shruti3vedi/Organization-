package day7_assignment;

public interface Stack {
	void push(Employee emp) throws StackFullException;
	Employee pop() throws StackEmptyException;
	int STACK_SIZE = 5;
	

}
