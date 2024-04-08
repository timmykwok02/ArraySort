import java.util.Arrays;

public class arraySortTest {

	public static void main(String[] args) {
		// testing GitHub
		int[] intArray = {4, 2, 3, 5, 1};
		String[] stringArray = {"Hello", "Apple", "Cat"};
		
		System.out.println("Orginal Arrays");
		System.out.println(Arrays.toString(intArray));
		System.out.println(Arrays.toString(stringArray));
		
		System.out.println("Sorted Arrays");
		intArray = sortInt(intArray);
		System.out.println(Arrays.toString(intArray));
		stringArray = sortString(stringArray);
		System.out.println(Arrays.toString(stringArray));
	}
	
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
