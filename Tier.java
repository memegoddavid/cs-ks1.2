import java.util.Hashtable;

public class Tier {
	
protected String art;
protected String Geräusch;
public int Beinanzahl;

public Tier(String aArt, String aGeräusch, int aBeinanzahl) {
	art = aArt;
	Geräusch = aGeräusch;
	Beinanzahl = aBeinanzahl;
	
	if (aBeinanzahl <0) {
		aBeinanzahl = (-1)*aBeinanzahl;
	}
}

public void gibLaut() {
	System.out.println(art + "bellt: " + Geräusch);
}

public void sageArt() {
	System.out.println("Ich bin ein " + art + ".");
}

public void bewegen() {
	for (int i = 1; i <= Beinanzahl; i++) {
		System.out.println("tapp");
	}
	if(Beinanzahl == 0) {
		System.out.println("Kriech.");
	}
}

}
