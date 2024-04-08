import java.util.Arrays;
import java.util.Scanner;

public class arraySortTest {

	public static void main(String[] args) {
// 		Sort integer array
//		int[] intArray = {4, 2, 3, 5, 1};
		
		Scanner sc = new Scanner(System.in);
//		Taking user input
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int[] intArray = new int[size];
		for (int x = 0; x<size; x++) {
			System.out.print("Enter an integer: ");
			intArray[x] = sc.nextInt();
		}
		
//		Printing out original and sorted array
		System.out.println("Orginal Array");
		System.out.println(Arrays.toString(intArray));

		System.out.println("Sorted Array");
		intArray = sortInt(intArray);
		System.out.println(Arrays.toString(intArray));
	}
	
//	insertion sort
	public static int[] sortInt(int[] array) {
		int num, index;
		for (int x=1; x<array.length; x++) {
			num = array[x];
			index = x-1;
			
			while (num<array[index]) {
				array[index+1] = array[index];
				array[index] = num;
				index--;
				if (index < 0)
					break;
			}
		}
		return array;
	}

}
