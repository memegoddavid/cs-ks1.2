//abstrakte Klasse als Muster f�r konkrete erbende Klassen
//von einer solchen Klasse k�nnen keine Objekte erzeugt werden
public abstract class Figur {

	protected double umfang;
	protected double fl�che;
	
	abstract double berechneUmfang();
	abstract double berechneFl�che();
	
}
