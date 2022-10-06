package LinkedList;

//class of Singly Linked List
public class SinglyLinkedList {
	private ListNode head; //declaring head node of data type ListNode
	
	//ListNode class
	private static class ListNode{
		private int data; //can be any Generic Type
		private ListNode next; //pointer to next reference
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
		public void print() {
			ListNode curr = head;
			while(curr!=null) {
				System.out.print(curr.data+"->");
				curr = curr.next;
			}
			System.out.println("null");
			
		}
		public int length() {
			int count = 0;
			ListNode curr = head;
			while(curr!=null) {
				count++;
				curr = curr.next;
			}
			return count;
		}
		public void insertFirst(int value) {
			ListNode node = new ListNode(value);
			node.next = head;
			head = node;
		}
		public void insert(int pos, int value) {
			ListNode node = new ListNode(value); //new node;
			if(pos == 1) {
				node.next =  head;
				head = node;
			}else {
				ListNode previous = head;
				int count = 1;// to go upto position -1;
				while(count < pos-1) {
					previous = previous.next;
					count++;
				}
				ListNode current = previous.next;//reference saved;
				previous.next = node;
				node.next = current;
			}
		}
		public void insertLast(int value) {
			ListNode node = new ListNode(value);
			if(head == null) {
				head = node;
				return;
			}
			ListNode current = head;
			while(current.next!=null) {
				current = current.next; //last node reference saved;
			}
			current.next = node;
		}
		public ListNode deleteFirst() {
			if(head==null) {
				System.out.println("List is empty");
				return null;
			}
			ListNode temp = head;
			head= head.next;
			temp.next = head;
			return temp;
		}
		public void delete(int pos) {
			if(pos==1) {
				head = head.next;
				return;
			}else {
				ListNode previous = head;
				int count = 1;
				while(count<pos-1) {
					previous = previous.next;
					count++;
				}
				ListNode current = previous.next;
				previous.next = current.next;
			}
		}
		public ListNode deleteLast() {
			if(head == null) {
				return null;
			}
			if(head.next==null) {
				ListNode temp = head;
				head = head.next;
				return temp;
			}
			ListNode current = head;
			ListNode previous = null;
			
			while(current.next!=null) {
				previous = current; //initializing the previous value to current: head value;
				current= current.next; //goes till the reference of last node;
				
			}
			previous.next = null;
			return current;
		}
		
		
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		
		//Chaining them up forms a linked list
		
		sll.head.next = second; // 10-->20
		second.next = third; // 10-->20-->30
		third.next = fourth; //10-->20-->30-->40-->null
		//fouth.next = null;
		sll.deleteLast();
		
		sll.print();
		System.out.println(sll.length());

	}
	

}
