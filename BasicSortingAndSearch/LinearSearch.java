package BasicSortingAndSearch;

//In Linear Search, we find an element in an array iteratively.

public class LinearSearch {

	public static void main(String[] args) {
		int Arr[] = {1,5,7,4,6,3,9,8};
		int k = 21;
		linearSearch(Arr, k);

	}
	//function to linear search the key element in an Array
	
	public static void linearSearch(int[] A, int k) {
		boolean flag = false;
		for(int i=0; i<A.length; i++) {
			if(k==A[i]) {
				flag = true;
			}
		}
		System.out.println(flag);
	}
	
}
