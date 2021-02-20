package sortingAlgorithms;

///////////////////////////////////////////////////////
//													 //
//  Made by: Matty Slyzys				     		 //
//  Started on: February 19, 2021					 //	
//													 //
//  This program demonstrates various sorting 		 //
//  algorithms that will be used to sort an array	 //
//													 //
///////////////////////////////////////////////////////

public class Setup {
	
	// Instance variables
	int elements = (int) (20 * Math.random() + 10);
	int minValue = 0;
	int maxValue = 20;
	
	public Setup() {
		// Create the array
		elements = 20;
		int[] array = new int[elements];
		
		// Populate the array with random numbers
		for (int i = 0; i <= array.length - 1; i++) {
			array[i] = (int) ((maxValue - minValue) * Math.random() + minValue);
		}
		
		// Print the array
		System.out.println("---------------------------------Unsorted Array---------------------------------");
		System.out.println("");
		
		printArray(array);
		
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------");
		
		// Sort the Array
		
		
		// Print the sorted array
		System.out.println("---------------------------------Unsorted Array---------------------------------");
		System.out.println("");
		
		printArray(array);
		
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------");
	}

	// This method prints every element in the array in its current order
	public void printArray(int[] arr) {
		
		for (int i = 0; i <= arr.length - 2; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.print(arr[arr.length - 1]);
		
	}
	
	public static void main(String[] args) {
		Setup s = new Setup();
	}

}
