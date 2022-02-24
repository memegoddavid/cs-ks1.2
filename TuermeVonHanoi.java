
public class TuermeVonHanoi {
	static int counter = 0;
	public static void main(String[] args) {
		
		himalayamoench('a', 'b', 'c',10);
		System.out.println(counter);
		hanoiunterricht(4, "a", "b", "c");
	
	
	}

	public static void himalayamoench(char a, char b, char c, int n) {
		
		if(n==1) {
			
			System.out.println("Lege die oberste Scheibe von " + a + " auf Turm " + c);
			counter++;
		}else {
			
			himalayamoench(a, c, b, n-1);
			himalayamoench(a, b, c, 1);
			himalayamoench(b, a, c, n-1);
			
			
		}
		
	}
	
	public static void hanoiunterricht(int n, String start, String hilf, String ziel) {
		long s= System.nanoTime();
		if(n<=1) {
			System.out.println("Bewege Scheibe von " + start + " nach " + ziel);
			counter++;
		}else {
			hanoiunterricht(n-1, start, ziel, hilf);
			counter++;
			System.out.println("Bewege Scheibe von " + start + " nach " + ziel);
			hanoiunterricht(n-1, hilf, start, ziel);
			counter++;
		}
		long stop = System.nanoTime();
		long zeit = stop - s;
		System.out.println(zeit);
	}
	
}
