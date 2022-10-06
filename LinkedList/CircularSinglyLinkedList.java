package LinkedList;

public class CircularSinglyLinkedList {
	private ListNode last;
	private int length;
	
	private class ListNode{
		private ListNode next;
		private int data;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	public CircularSinglyLinkedList() {
		last = null;
		length = 0;
	}
	public int length() {
		return length;
	}
	public boolean isEmpty() {
		return length==0;
	}
	public void display() {
		if(last == null) {
			return;
		}
		ListNode first = last.next;
		while(first!=last) {
			System.out.print(first.data+" ");
			first = first.next;
		}
		System.out.print(first.data);//now points to the last;
	}
	public void insertFirst(int value) {
		ListNode temp = new ListNode(value);
		if(last==null) {
			last = temp;
		}else {
			temp.next = last.next;
		}
		last.next = temp;
		length++;
	}
	
	//for demonstration purpose
	public void createInstance() {
		ListNode first = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;
		
		last = fourth;//last pointer
	}
	
	
	public static void main(String[] args) {
		CircularSinglyLinkedList cll = new CircularSinglyLinkedList();
		cll.createInstance();
		cll.display();
		
		
		
	}

}
