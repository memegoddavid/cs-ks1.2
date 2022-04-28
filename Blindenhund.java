
public class Blindenhund extends Hund{
protected String NameBesitzer;
	public Blindenhund(String aRasse, String aFellfarbe, String aNameBesitzer) {
		super(aRasse, aFellfarbe);
		NameBesitzer = aNameBesitzer;
	}
	
	public void sageName() {
		System.out.println("Mei/e Besitzer/in heiﬂt: " + NameBesitzer);
	}
	
	public int amputieren() {
		if (Beinanzahl == 0) {
			System.out.println("Ich kann nicht noch weniger Beine haben man :(");
		}else {
			Beinanzahl = Beinanzahl -1;
			return Beinanzahl;
		}
		return Beinanzahl;
	}
	

}
