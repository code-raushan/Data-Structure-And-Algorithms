package LinkedList;

public class DoublyLinkedList {
	
	private ListNode head;
	private ListNode tail;
	private int length;
	
	private class ListNode{
		private int data;
		private ListNode next;
		private ListNode previous;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	public boolean isEmpty() {
		return length == 0;//head==null;
	}
	
	public int length() {
		return length;
	}
	
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		if(isEmpty()) {
			tail = newNode;
		}else {
			head.previous = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
	}
	
	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if(isEmpty()) {
			head = newNode;
		}else {
			tail.next = newNode;
			newNode.previous = tail;
		}
		tail = newNode;
		length++;
	}
	public ListNode deleteFirst() {
		if(isEmpty()) {
			System.out.println("List is empty"); 
			return null;
		}
		ListNode temp = head;
		if(head == tail) {
			tail = null;
		}else {
			head.next.previous = null;//breaking the link
		}
		head = head.next;
		temp.next = null;
		length--;
		return temp;//returning the deleted node;
	}
	public ListNode deleteLast() {
		if(isEmpty()) {
			System.out.println("List is empty");
			return null;
		}
		ListNode temp = tail;
		if(head==tail) {
			head = null;
		}else {
			tail.previous.next = null;
		}
		tail = tail.previous;//shifted the tail pointer
		temp.previous = null;
		length--;
		return temp; //returned the deleted node;
	}
	
	
	public void displayForward() {
		if(head==null) {
			return;
		}
		ListNode temp = head;
		while(temp!=null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.print("null");
	}
	public void displayBackward() {
		if(tail==null) {
			return;
		}
		ListNode temp = tail;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp = temp.previous;
		}
		System.out.print("null");
				
	}
	
	
	
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertFirst(4);
		dll.insertFirst(10);
		dll.displayForward();
		System.out.println();
		dll.insertLast(39);
		dll.displayForward();

	}

}
