import java.util.Random;
import java.util.Scanner;

public class Wuerfel {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Wie oft soll der Würfel gewürfelt werden? ");
		int anzahl = sc.nextInt();
		
		int[] wuerfe = new int[7];
		
		Random rd = new Random();
		int s = rd.nextInt(6)+1;
		
	}

}
