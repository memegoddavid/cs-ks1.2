import java.util.Arrays;
import java.util.Random;

/*public class Lotto{
  public static void main(String[] args){
    Random r = new Random();
    boolean[] numbers = new boolean[50];
    
    for (int i = 1;i<=6 ;i++ ) {
      numbers[r.nextInt(49)+1]=true;
      boolean dbl = true;
      while (dbl==true) { 
        
      } 
    } 
    System.out.println(Arrays.toString(numbers));
  
  
  
  
  
    }
  }*/

public class Lotto {
	
	public static void main(String[] args){
  
		Random r = new Random();
		int[] numbers = new int[6];
		
		for (int i = 0; i < numbers.length; i++) {
      
			int number = r.nextInt(49);
			
			for (int j = 0; j < numbers.length; j++) {
        
				if (numbers[j] == number) {
          
					number = r.nextInt(49);
					j = 0;
					
				}
				
      }
			
      numbers[i] = number;
      
    }
		
    System.out.println("Lotto: " + Arrays.toString(numbers));
    
  }
}