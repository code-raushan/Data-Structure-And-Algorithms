package BasicSortingAndSearch;
// In bubble sort, sorting is done via comparing adjacent items and swapping if necessary.

//Implementation of Bubble Sort
public class BubbleSort {
	

	public static void main(String[] args) {
		int arr[] = {2, 4, 3, 7, 5, 9, 6};//example array for sorting 
		bubbleSort(arr); //sorting function called on the Arr
	}
	//function to bubble sort the array
	
	public static void bubbleSort(int A[]) {
		int n = A.length;
		int i=0, j, temp;
		boolean swapped;
		while(i<=n-2) {
			swapped = false;
			j=0;
			while(j<=n-2-i) {
				if(A[j]>A[j+1]) {
					temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
					swapped = true;
				}
				j++;
				
			}
			if(swapped = false) {
				break;
			}
			i++;
			
		}
		for(int index=0; index<A.length; index++) {
			System.out.print(A[index]+" ");
		}
	}

}
