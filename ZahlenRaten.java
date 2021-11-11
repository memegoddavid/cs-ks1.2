import java.util.Random;
import java.util.Scanner;

public class ZahlenRaten {

	public static void main(String[] args) {
		
		Random zf = new Random();
		Scanner sc = new Scanner(System.in);
		boolean cond = true;

		
		while (cond == true) {
			
			
			System.out.println("Wie groﬂ soll das Zahlenspektrum sein?");
			int d = sc.nextInt();
			int zahl = zf.nextInt(d)+1;
			int tipp;
			int c = 1;
			boolean er = false;
			
			System.out.println("Zahl zwischen 1 und "+d);
			
			do {

				System.out.println("Was ist meine Zahl?");
				tipp = sc.nextInt();

				if (tipp < 0) {

					System.out.println("Keine negativen Zahlen. Programm schlieﬂt sich.");
					System.exit(0);

				}

				if (tipp == zahl) {

					er = true;

					if (c == 1) {

						System.out.println("Sehr gut gemacht. Nur 1 Versuch.");

					} else if (c > 1) {

						System.out.println("Gut gemacht. " + c + " Versuche.");

					}

					System.out.println("Willst du weiterspielen? (J/N): ");
					String eing = sc.next();
					if(eing.equalsIgnoreCase("N")) {
						cond = false;
						System.out.println("Tsch¸ss!");
						System.exit(0);
					}
					
				} else {

					System.out.println("Leider falsch. Nochmal versuchen.\n");

					if (tipp > zahl) {

						System.out.println("Dein Tipp ist zu groﬂ\n");

					} else if (tipp < zahl) {

						System.out.println("Dein Tipp ist zu klein\n");

					}
					c++;
				}
			} while (er == false);
		}
		sc.close();
	}
}