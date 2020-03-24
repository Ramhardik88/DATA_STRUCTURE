package stackfixedarray;

public class Stack {
	int stack[] = new int[5];

	int top = 0;//keeps track of the cell which is last occupied in Array, this will help in insertion/deletion

	public void push(int data) {
		if (isFull()) {
			System.out.println("stack is full");// stack overflow will occur
		} else {
			stack[top] = data;
			top++;
		}

	}

	public int pop() {
		int data = 0;
		if(isEmpty()) {
			System.out.println("stack is empty");// stack underflow will occur
			
		}
		else {
		top--;
		data = stack[top];
		stack[top] = 0;
		}
		return data;
		
	}

	public int peek() {
		int data;

		data = stack[top - 1];
		return data;

	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public boolean isFull() {
		return top == stack.length;

	}

	public void show() {
		for (int n : stack) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}
