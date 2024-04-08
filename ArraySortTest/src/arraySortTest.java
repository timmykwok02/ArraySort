import java.util.Arrays;

public class arraySortTest {

	public static void main(String[] args) {
		// Sort integer array
		int[] intArray = {4, 2, 3, 5, 1};
		
		System.out.println("Orginal Array");
		System.out.println(Arrays.toString(intArray));

		System.out.println("Sorted Array");
		intArray = sortInt(intArray);
		System.out.println(Arrays.toString(intArray));
	}
	
	// insertion sort
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
