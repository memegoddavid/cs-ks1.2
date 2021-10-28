import java.util.Scanner;  
public class mnf  {  
	public static void main(String[] Strings) {  
		
		Scanner sc = new Scanner(System.in);  
		
		System.out.print("a: ");  
		double a = sc.nextDouble();  
		
		System.out.print("b: ");  
		double b = sc.nextDouble(); 
		
		System.out.print("c: ");  
		double c = sc.nextDouble(); 
		
		double d= b * b - 4.0 * a * c;  
		if (d> 0.0)   
		{  
		double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
		double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
		System.out.println("x1: " + r1 + "  " + r2);  
		}   
		else if (d == 0.0)   
		{  
		double r1 = -b / (2.0 * a);  
		System.out.println("Die Wurzel ist " + r1);  
		}   
		else   
		{  
		System.out.println("Wurzeln sind keine realen Zahlen");  
		}  
		}  
		} 