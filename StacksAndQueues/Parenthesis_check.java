package StacksAndQueues;
import java.util.Scanner;
import java.util.Stack;


//push opening brackets and pop top item if same closing bracket occurs
//if stack is empty in the end, return true
public class Parenthesis_check {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		Stack<Character> st = new Stack<>();
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			}else if(ch == ')') {
				boolean val = handleClosing(st, '(');
				if(val == false) {
					System.out.println(val);
					return;
				}
			}else if(ch == '}') {
				boolean val = handleClosing(st, '{');
				if(val == false) {
					System.out.println(val);
					return;
				}
			}else if(ch == ']') {
				boolean val = handleClosing(st, '[');
				if(val == false) {
					System.out.println(val);
					return;
				}
			}
		}
		if(st.size()==0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	}
	public static boolean handleClosing(Stack<Character> st, char correspondingOpCh) {
		if(st.size()==0) {
			return false;
		}else if(st.peek()!=correspondingOpCh) {
			return false;
		}else {
			st.pop();
			return true;
		}
	}

}


