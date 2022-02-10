import java.util.Arrays;

public class Mehoden {

	public static void main(String[] args) {
		
		//sagHallo();
		//System.out.println(addiere(7, 6));
		//System.out.println(Arrays.toString(args));
		System.out.println(machAufgabe1("David", "Kajkic"));
		add(7, 5);
		div(0, 0);
		add(4, 11);
		System.out.println(com(11, 15));
		System.out.println(fläche(3, 4, 5) + " FE");
		System.out.println(ver(3,3));
	}
	
	//Befehle ohne Rückgabewert 
	public static void sagHallo() {
		System.out.println("Hallo");
	}
	
	//Befehle mit Rückgabewert (Datentyp int)
	public static int gibSieben() {
		return 7;
	}
	//Befehle mit Rückgabewert (Datentyp int) und zwei Parametern
	public static int addiere(int a, int b) {
		int ergebnis = a + b;
		return ergebnis;
	}
	
	public static String machAufgabe1(String Vorname, String Nachname) {
		String VollerName = Vorname +" "+Nachname;
		return VollerName;
	}
	
	public static void add(double a, double b) {
		double ergebnis = a + b;
		System.out.println(ergebnis);
		//return ergebnis;
	}
	
	public static void sub(double a, double b) {
		double ergebnis = a - b;
		System.out.println(ergebnis);
	}
	
	public static void mul(double a, double b) {
		double ergebnis = a * b;
		System.out.println(ergebnis);
	}
	
	public static void div(double a, double b) {
		if(b == 0) {
			System.out.println("Durch 0 darf man nicht teilen du Idiot");
		}else {
			double ergebnis = a / b;
			System.out.println(ergebnis);
		}
		System.out.println(Double.NEGATIVE_INFINITY);
	}
	
	public static int com(int a , int b) {
		if (a < b) {
			System.out.println(a + " ist kleiner als " + b);
			return b;
		}else if (a > b) {
			System.out.println(a + " ist größer als " + b);
			return a;
		}else {
			System.out.println("Die Zahlen sind gleich groß");
			return a;
		}
	}
	
	public static double fläche(double a, double b, double c) {
		double s = (a+b+c)/2;
		double A = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		return A;
	}
	
	public static int ver(int a , int b) {
		if (a > b) {
			return a;
			
		}else {
			return b;
		}
	}
}
