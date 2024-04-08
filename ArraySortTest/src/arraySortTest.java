import java.util.Arrays;

public class arraySortTest {

	public static void main(String[] args) {
		// Sort String array
		String[] stringArray = {"Hello", "Apple", "Cat"};
		
		System.out.println("Orginal Array");
		System.out.println(Arrays.toString(stringArray));
		
		System.out.println("Sorted Arrays");
		stringArray = sortString(stringArray);
		System.out.println(Arrays.toString(stringArray));
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
