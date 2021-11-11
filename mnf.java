import java.util.Scanner;  
public class mnf  {  
	public static void main(String[] Strings) {  
		
		Scanner sc = new Scanner(System.in);  
		 
		double a,b,c,D;
		System.out.print("a: "); 
		a = sc.nextDouble();
		
		System.out.println("b: ");
		b = sc.nextDouble();
		
		System.out.println("c: ");
		c = sc.nextDouble();
		
		D = Math.sqrt(Math.pow(b, 2) - 4*a*c);
		
		if (D>0) {
			System.out.println("2 Lösungen.");	
		} else if (D==0) {
			System.out.println("1 Lösung.");
		} else {
			System.out.println("Keine Lösung.");
		}
		
		if (D>0) {
			
			double x = (-b + Math.sqrt(b*b-4*a*c));
			double xfinal = x / (2*a);
			double y = (-b - Math.sqrt(b*b-4*a*c));
			double yfinal = y/(2*a);
			System.out.println("x1 = "+xfinal+"\n"+"x2 = "+yfinal);
			
		} else if(D == 0) {
			
			double x = (-b + Math.sqrt(b*b-4*a*c));
			double xfinal = x /(2*a);
			System.out.println("Nullstelle: "+xfinal);
			
			
			}
		}
			
	}
