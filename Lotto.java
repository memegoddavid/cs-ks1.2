import java.util.Arrays;
import java.util.Random;

public class Lotto{
  public static void main(String[] args){
    Random r = new Random();
    boolean[] numbers = new boolean[50];
    int g = 0;
   
    
    while(g < 6){
    int zahl = r.nextInt(49)+1;
    	if(numbers[zahl] == false){
    		numbers[zahl] = true;
    		g++;
    	}
    
      }
    
    for (int i = 1; i <= 49; i++) {
    	if(numbers[i] == true) {
    		System.out.println(i);
    	}
	}
    
  } 
   
}
  

