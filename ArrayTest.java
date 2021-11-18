import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
		int [] Array = new int[5];
		//System.out.println(Array[0]); Standardfeldwert ist null
		
		for (int i = 0; i < Array.length; i++) {
			
			Array[i] = i;
			
		}
		
		System.out.println(Arrays.toString(Array));
		System.out.println(Array.length);
		
		for (int i = 0; i < Array.length; i++) {
			
			System.out.println(Array[i]);
			
		}
		
		int[] b = Array;
		Array[2] = 10;
		
		System.out.println(b[2]);		//wird auch geändert
		System.out.println(Array[2]);
		
	}

}
