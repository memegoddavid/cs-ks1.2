import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class Lotto {

	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] tipp = new int[6];
		int[] zahlen = new int[6];
		
		
			for (int i = 0; i < tipp.length; i++) {
				
					System.out.println("Gib deinen " + (i+1) + ". Tipp ein: ");
					tipp[i] = sc.nextInt();
				
			}
		System.out.println(Arrays.toString(tipp));

	}

}
