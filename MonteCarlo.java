import java.util.Random;
import java.util.Scanner;

public class MonteCarlo{
	
  public static void main(String[] args){
	  
    long t = 0L;
    long n;
    
    double x,y;
    Random rdm = new Random();
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Wie viele Punkte? (n>0)");
    n = sc.nextLong();
    sc.close();
    
    for (int i = 1; i <= n; i++) {
    	
    	x = rdm.nextDouble();
    	y = rdm.nextDouble();
      
      
      if (Math.pow(x, 2) + Math.pow(y, 2) <= 1.0) {
    	  
        t++;
        
      } 
      
    }
    
    System.out.println(4.0*t/n);
    System.out.println(Math.PI);
    
   }
 
  
}