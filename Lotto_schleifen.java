import java.util.Random;
import java.util.Arrays;

public class Lotto_schleifen {
	
	public static void main(String[] args){
  
		Random r = new Random();
		int[] numbers = new int[6];
		
		for (int i = 0; i < numbers.length; i++) {
			
			int number = r.nextInt(49)+1;
			
			for (int j = 0; j < numbers.length; j++) {
        
				if (numbers[j] == number) {
          
					number = r.nextInt(49)+1;
					j = 0;
					
				}
				
      }
			
      numbers[i] = number;
      
    }
		
    System.out.println("Lotto: " + Arrays.toString(numbers));
    
  }
}