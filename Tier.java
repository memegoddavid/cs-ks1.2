import java.util.Hashtable;

public class Tier {
	
protected String art;
protected String Ger�usch;
public int Beinanzahl;

public Tier(String aArt, String aGer�usch, int aBeinanzahl) {
	art = aArt;
	Ger�usch = aGer�usch;
	Beinanzahl = aBeinanzahl;
	
	if (aBeinanzahl <0) {
		aBeinanzahl = (-1)*aBeinanzahl;
	}
}

public void gibLaut() {
	System.out.println(art + "bellt: " + Ger�usch);
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
