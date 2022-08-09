package StacksAndQueues;
//Stack is a data structure that follow the concept of LIFO- Last In First Out and FILO- First In Last Out
//Applications in parenthesis validation, systematic memory management, backtracking etc.

class MyStack{
	int Stk[];
	int top;
	int size;
	//constructor creation
	MyStack(int s){
		Stk = new int[s];
		size = s;
		top = -1;
		
	}
	//pushing an item at the top
	void push(int item) {
		if(top==size-1) {
			System.out.println("Stack Overflow");
		}else {
			Stk[++top]=item;
		}
	}
	// removing an item from the top
	int pop() {
		if(top == -1) {
			System.out.println("Empty Stack");
			return -1;
		}else {
			return Stk[top--];
		}
	}
	// getting the value of the item at the top
	int peek() {
		if(top == -1) {
			System.out.println("Empty Stack");
			return -1;
		}else {
			return Stk[top];
		}
	}
	// checking if stack is empty or not
	boolean isEmpty() {
		return top == -1;
	}
}


public class StackImplementation {

	public static void main(String[] args) {
		MyStack s1 = new MyStack(5);
		s1.push(5);
		s1.push(4);
		s1.push(8);
		s1.push(7);
		s1.push(2);
		s1.push(4);

	}

}
