import java.util.Arrays;
import java.util.Scanner;

public class arraySortTest {

	public static void main(String[] args) {
		// Sort String array
		Scanner sc = new Scanner(System.in);
//		String[] stringArray = {"Hello", "Apple", "Cat"};
		
//		Taking user input		
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();

		String[] stringArray = new String[size];
		for (int x = 0; x<size; x++) {
			System.out.print("Enter a string: ");
			stringArray[x] = sc.next();
		}		
		
//		print out original and sorted array
		System.out.println("Orginal Array");
		System.out.println(Arrays.toString(stringArray));
		
		System.out.println("Sorted Arrays");
		stringArray = sortString(stringArray);
		System.out.println(Arrays.toString(stringArray));
	}

//	insertion sort
	public static String[] sortString(String[] array) {
		String string;
		int index;
		for (int x=1; x<array.length; x++) {
			string = array[x];
			index = x-1;
			
			while (string.compareTo(array[index]) < 0) {
				array[index+1] = array[index];
				array[index] = string;
				index--;
				if (index < 0)
					break;
			}
		}
		return array;
	}

}
