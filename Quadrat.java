
public class Quadrat extends Figur{

	private Double Seitenlänge;
	
	public Quadrat(Double a) {
		Seitenlänge = a;
	}
	
	
	double berechneUmfang() {
		umfang = 4*Seitenlänge;
		return umfang;
	}

	
	double berechneFläche() {	
		fläche = Seitenlänge * Seitenlänge;
		return fläche;
	}

}
