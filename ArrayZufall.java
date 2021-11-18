import java.util.Arrays;
import java.util.Random;

public class ArrayZufall {
	
	public static void main(String[] args) {
		
		int [] ar = new int[10];
		
		Random zf = new Random();
		
		
		for (int i = 0; i < ar.length; i++) {
			
			int r = zf.nextInt(100)+1;
			ar[i] = r;
			
		}
		
		System.out.println(Arrays.toString(ar));
	
		
	}

}
