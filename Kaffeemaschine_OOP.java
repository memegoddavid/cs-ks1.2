

public class Kaffeemaschine_OOP {

	private int Wasserstand;
	private int Bohnenstand;
	private String Marke;
	
	
		
	public Kaffeemaschine_OOP(String aMarke) {
		
		Marke = aMarke;
		Bohnenstand = 0;
		Wasserstand = 0;
		
		
		
	}
	
	
	
	public void nenneBohnenstand() {
		
		System.out.println("Es sind " + Bohnenstand + " Einheiten Bohnen in der Maschine.");
	}
	
	public void NenneWasserstand() {
		System.out.println("Es sind " + Wasserstand + " Einheiten Wasser in der Maschine.");
	}
	
	public void SageMarke() {
		System.out.println("Die Maschine ist von der Marke " + Marke);
	}
	
	
	
	public void FuelleBohnen(int b) {
		if(b<0) {
			b=(-1)*b;
		}
		Bohnenstand = Bohnenstand + b;
	}
	
	public void FuelleWasser(int w) {
		if(w<0) {
			w=(-1)*w;
		}
		Wasserstand = Wasserstand + w;
	}
	
	public void KocheKaffee() {
		
		if((Bohnenstand>0) && (Wasserstand>0)){
			
			System.out.println("Eine Tasse Kaffee!");
			Bohnenstand--;
			Wasserstand--;
			
		}else {
			
			System.out.println("Es fehlt Material!");
			
			if(Bohnenstand==0) {
				
				System.out.println("Es fehlen Bohnen!");
				
			}
			
			if(Wasserstand==0) {
				
				System.out.println("Es fehlt Wasser!");
				
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
}
