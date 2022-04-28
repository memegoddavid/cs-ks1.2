//abstrakte Klasse als Muster für konkrete erbende Klassen
//von einer solchen Klasse können keine Objekte erzeugt werden
public abstract class Figur {

	protected double umfang;
	protected double fläche;
	
	abstract double berechneUmfang();
	abstract double berechneFläche();
	
}
