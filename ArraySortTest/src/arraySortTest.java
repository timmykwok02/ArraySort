import java.util.Arrays;
import java.util.Scanner;

public class arraySortTest {

	public static void main(String[] args) {
// 		Sort integer array
//		int[] intArray = {4, 2, 3, 5, 1};
		
		Scanner sc = new Scanner(System.in);
//		Taking user input
		System.out.println("Enter if the array is filled with strings or integers");
		
		System.out.print("Enter 'String' or 'Integer': ");
		String arrayType = sc.next();
		while (arrayType.compareTo("String") != 0 && arrayType.compareTo("Integer") != 0) {
			System.out.println("Invalid input");
			System.out.print("Enter 'String' or 'Integer': ");
			arrayType = sc.next();
		}	
			
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] intArray = new int[size];
		
		if (arrayType.compareTo("String") == 0) {
			String[] stringArray = new String[size];
			for (int x = 0; x<size; x++) {
				System.out.print("Enter a string: ");
				stringArray[x] = sc.next();
			}
			System.out.println("Orginal Array");
			System.out.println(Arrays.toString(stringArray));
			System.out.println("Sorted Arrays");
			stringArray = sortString(stringArray);
			System.out.println(Arrays.toString(stringArray));
		}
		
		else if (arrayType.compareTo("Integer") == 0) {
			for (int x = 0; x<size; x++) {
			System.out.print("Enter an integer: ");
			intArray[x] = sc.nextInt();
			}
			System.out.println("Orginal Array");
			System.out.println(Arrays.toString(intArray));
			System.out.println("Sorted Arrays");
			intArray = sortInt(intArray);
			System.out.println(Arrays.toString(intArray));
		}

	}
	
//	Insertion sort for Integer
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
	
//	Insertion sort for String
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
