import java.util.*;

public class GnomeSort {

	public static void main(String[] args) {
		
		int [] ar = new int[10000000];
		Random zf = new Random();
		
		
		for (int i = 0; i < ar.length; i++) {
			
			int r = zf.nextInt(10)+1;
			ar[i] = r;
			
		}
		//Arrays.sort(ar);
		//System.out.println(Arrays.toString(ar));
		long start = System.nanoTime();
		for (int i = 1; i < ar.length;) {
			if (ar[i-1] <= ar[i]) {
				i++;
			}else {
				int h = ar[i];
				ar[i] = ar[i-1];
				ar[i-1] = h;
				i--;
				if(i == 0) {
					i = 1;
				}
			}
		}
		long stop = System.nanoTime();
		//System.out.println(Arrays.toString(ar));
		System.out.println(1.0e-6*(stop - start) + "ms");
	}

}
