package StacksAndQueues;
//Implementation of Circular Queue

class MyCircularQueue{
	int SIZE = 5;
	int front, rear;
	int queue[] = new int[SIZE];
	MyCircularQueue() {
		front = -1;
		rear = -1;
	}
	//isFull() method to check for enqueue method
	public boolean isFull() {
		if((rear+1)%SIZE == front) {
			return true;
		}else {
			return false;
		}
	}
	//isEmpty() method to check for dequeue method
	public boolean isEmpty() {
		if((front == -1) && (rear == -1)) {
			return true;
		}else {
			return false;
		}
	}
	public void Enqueue(int item){
		if(isFull()){
			System.out.println("Cannot enqueue as the queue is full");
		}else {
			if(front == -1) {
				front = 0;
			}
			rear = (rear +1)%SIZE;
			queue[rear] = item;
			System.out.println(item+" ");
		}
	}
	public void Dequeue() {
		int element;
		if(isEmpty()) {
			System.out.println("Cannot dequeue as the queue is empty");
		}else {
			element = queue[front];
			if(front == rear) {
				front = -1;
				rear = -1;
			}else {
				front = (front+1)%SIZE;
			}
			System.out.println(element+" deleted");
		}
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}else {
			System.out.println("front: "+ front);
			System.out.println("rear: "+ rear);
			System.out.println("Queue elements :");
			int i = front;
			while(i!=rear) {
				System.out.print(queue[i]+" ");
				i = (i+1)%SIZE;
			}
			System.out.println(queue[i]);
		}
	}
}

public class CircularQueue {

	public static void main(String[] args) {
		MyCircularQueue c1 = new MyCircularQueue();
		c1.Enqueue(4);
		c1.Enqueue(5);
		c1.Enqueue(6);
		c1.Enqueue(7);
		c1.Enqueue(8);
		
		c1.display();
	}

}
