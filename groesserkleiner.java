import java.util.Scanner;

public class groesserkleiner {

	public static void main(String[] args) {
			
		double x, y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Gib zwei Zahlen an: ");
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x >= 0 && y >= 0) {
			
			if (x > y) {
				
				System.out.println(x + " ist größer als " + y);
				} else if (x < y) {
					System.out.println(x + " ist kleiner als " + y);
				} else {
					System.out.println(x + " ist gleich "+ y);
				} 
			
		} else {
			
			System.out.println("Keine negativen Zahlen.");
			
		}
			
	}	
		
}


