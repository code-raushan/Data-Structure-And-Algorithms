package Arrays;
import java.util.Scanner;
public class PracticeProblems {

	public static void main(String[] args) {
		//1) Implement a program for inserting a new element to the specified position of an array
		int arr[] = {1,2,3,4,5,6};
		int n = arr.length;
		
		Scanner scn =  new Scanner(System.in);
		System.out.println("Enter the new element");
		int newNum = scn.nextInt();
		System.out.println("Enter the new position");
		int position = scn.nextInt();
		//better approach would be from the last index after incrementing the size
		n = n++;
		for(int i=n-1; i>position-1; i--) {
			arr[i] = arr[i-1]; //shifting the part of array after position forward
		}
		arr[position-1]=newNum; //assigining new value at the desired position
		
		for(int elem: arr) {
			System.out.println(elem);
		}
		
		//Implement a program for deleting an element from the specified position of an array.
		int arr2[] = {1,2,3,4,5};
		int s = arr2.length;
		
		
		
		
		
	}

}
