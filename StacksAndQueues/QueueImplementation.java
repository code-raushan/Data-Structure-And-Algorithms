package StacksAndQueues;
//Queue Implementation

//using array

class MyQueue{
	private int queue[];
	private int front, rear, capacity;
	
	public MyQueue(int size) {
		front = rear = 0;
		capacity = size;
		queue = new int[capacity];
	}
	void enqueue(int item) {
		//checking if the queue is full or not 
		if(capacity == rear) { //if capacity is equal to rear, then it means that the Queue is already full.
			System.out.println("Can't enqueue as queue is full");
		}else {
			queue[rear]=item;
			rear++;	//enqueue method adds the element at the rear position
		}
	}
	void dequeue() { //not takes any argument as it return the front most element
		//checking if the queue is empty or not
		if(front == rear) { //in empty condition, front is always equal to rear position
			System.out.println("can't dequeue as queue is empty");
		}//shift elements to the right by one place upto rear
		else {
			for(int i=0; i<rear-1;i++) {
				queue[i] = queue[i+1];
			}
			rear--;
		}
	}
	void display() {
		if(front == rear) {
			System.out.println("queue is empty");
			
		}else {
			for(int i=front; i<rear; i++) {
				System.out.print(queue[i]+" ");
			}
			System.out.println(\n);
		}
	}
}



public class QueueImplementation {

	public static void main(String[] args) {
		MyQueue q1 = new MyQueue(4);
		q1.enqueue(4);
		q1.enqueue(5);
		q1.enqueue(6);
		q1.enqueue(8);
//		q1.enqueue(8);
		q1.display();
		System.out.println("after dequeue operation");
		q1.dequeue();
		q1.dequeue();
		q1.display();
	}

}
