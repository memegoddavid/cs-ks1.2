
public class Quadrat extends Figur{

	private Double Seitenl�nge;
	
	public Quadrat(Double a) {
		Seitenl�nge = a;
	}
	
	
	double berechneUmfang() {
		umfang = 4*Seitenl�nge;
		return umfang;
	}

	
	double berechneFl�che() {	
		fl�che = Seitenl�nge * Seitenl�nge;
		return fl�che;
	}

}
