package LinkedList;
//Floyd's Cycle Detection Algorithm
class Node
{
	int data;
	Node next;
	
	Node(int data, Node next){
		this.data = data;
		this.next = next;
	}
}

public class LoopDetection {
	public static boolean detectCycle(Node head) {
		//two pointer
				Node slow = head;
				Node fast = head;
				while(fast!=null && fast.next!=null) {
					//moving slow by one
					slow= slow.next;
					
					//moving fast by two
					fast= fast.next.next;
					//if they meet at any node, then the linked list contains loop
					if(slow==fast) {
						return true;
					}
				}
				return false;
		}
	public static void main(String[] args) {
		//input keys
		int[] keys = {1,2,3,4,5,6,7,8};
		Node head = null;
		for(int i=keys.length-1; i>=0; i--) {
			head = new Node(keys[i], head);
		}
		//inserting cycle
		head.next.next.next.next.next = head.next.next;
		if(detectCycle(head)) {
			System.out.println("Cycle Found");
		}else {
			System.out.println("No Cycle Found");
		}

	}

}
