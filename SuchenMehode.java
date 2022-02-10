import java.util.*;
public class SuchenMehode {

	public static void main(String[] args) {

		Random zf = new Random();
		int[] array= new int[100];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = zf.nextInt(100)+1;
			}
		//System.out.println(find(array, 15));
		
		Arrays.sort(array);
		System.out.println(BinarySearch(array, 99));
	}
		
		public static int find(int[] a, int v) {
			for (int i = 0; i < a.length; i++) {
				if(a[i] == v) {
					return i;// wenn ja: i zurückgeben, Befehl endet nach return
				}
			}
			return Integer.MIN_VALUE; //unmöglicher Index, Zahl kann gar nicht gefunden werden
		}
		
		public static int BinarySearch(int[] a, int v) {
			int low = 0;
			int high = a.length;
			while(low<=high) {
				int m = (low + high)/2;
				if(a[m] == v){
					return m;
				}else if(v > a[m]) {
					low = m+1;
				}else {
					high = m-1;
				}
			}
			return Integer.MIN_VALUE;
		}
		
	}


