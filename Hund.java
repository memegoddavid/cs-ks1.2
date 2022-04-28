
public class Hund extends Tier {
	
private String rasse;
private String fellfarbe;



public Hund(String aRasse, String aFellfarbe) {
super("Hund", "wau", 4);
rasse = aRasse;
fellfarbe = aFellfarbe;
}


public void sageRasse() {
	System.out.println("Ich bin ein/e "+rasse);
}

public void gibLaut() {
	System.out.println(rasse + " bellt " + super.Geräusch+".");
}

public void sageBeinanzahl() {
	System.out.println("Ich habe " + Beinanzahl + " Beine.");
}

public void kastrieren() {
	System.out.println("Oh nein, mein Geschlechtsteil ist weg :o");
}

public void Asiate() {
	System.out.println("Asiate macht ching chong, Hund tot, Asiate satt.");
}


}
