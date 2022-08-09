package Arrays;

//Array is a linear data structure
//equally sized elements
//random access using index
//operations are store and retrieve
public class Arrays {

	public static void main(String[] args) {
		//first way of using Arrays in Java
		int age[] = new int[5]; //setting the size and declaration of the array
		age[0] = 1;  
		age[1] = 2;
		age[2] = 3; //setting the values of the index of the array
		age[3] = 4;
		age[4] = 5;
		for(int i=0; i<age.length; i++) {
			System.out.println(age[i]);
		}
		 
		//second way of using Arrays in Java
		
		int[] rank = {1, 2}; //directly setting the values of an Array without declaring its size
		//creates and initializes an array
		System.out.println(rank.length);		
	}

}
