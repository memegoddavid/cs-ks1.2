import java.util.Random;
import java.util.Scanner;

public class Wuerfel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Wie oft soll der Würfel gewürfelt werden? ");
		int n = sc.nextInt();
		
		int[] wuerfe = new int[7];
		Random rd = new Random();
		while(wuerfe[0]!=n){
		
		@SuppressWarnings("unused")
		int s = rd.nextInt(6)+1;
		
		wuerfe[rd.nextInt(6)+1]++;
		wuerfe[0]++;
		
		}
		
		System.out.println("Es wurde " + wuerfe[0] + " mal gewürfelt. ");
		System.out.println("Anzahl 1: " + wuerfe[1] + ", Anzahl 2: " + wuerfe[2] + ", Anzahl 3:" + wuerfe[3] + ", Anzahl 4: " + wuerfe[4] + ", Anzahl 5: " + wuerfe[5] + ", Anzahl 6: " + wuerfe[6]);
	
		
		for (int j = 1; j < 7; j++) {
			
			System.out.println("Relative Wahrscheinlichkeit der Zahl " + j +": " + 1.0*wuerfe[j] / n);
			
		}
		
		sc.close();
		
	}

}