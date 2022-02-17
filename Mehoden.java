import java.util.Arrays;
import java.util.Iterator;

public class Mehoden {
static int counter = 0;
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
		System.out.println(mul(10,5));
		System.out.println(potrek(5,2));
		System.out.println(fibo(60));
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
		//System.out.println(Double.NEGATIVE_INFINITY);
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
	
	public static int fak(int n) {
		if(n<=1) {
			return 1;
		}else {
			return n*fak(n-1);
		}
	}
	
	public static int mul(int a, int b) {
		if(a == 0 || b == 0) {
			return 0;
		}else {
			return a + mul(a, b - 1);
		}
	}
	
	public static int potrek(int a, int b) {
		if(b==0) {
			return 1;
			
		}else {
			return a*potrek(a, b-1);
		}
	}
	
	public static long fibo(long n) {
		counter++;
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibo(n - 1) + fibo(n - 2);
    }
	
	 public static int BinoKo (int n, int k)
	   {
	      if (k == 1)
	         return n;
	      else if (n >= k && k == 0)
	         return 1;
	      else
	         return (n * BinoKo(n - 1, k - 1) / k);
	 
	   }
}
