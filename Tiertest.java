
public class Tiertest {

	public static void main(String[] args) {
		Hund knecht = new Hund("Rottweiler", "Schwarz");
		knecht.sageRasse();
		knecht.sageArt();
		knecht.gibLaut();
		knecht.bewegen();
		
		Blindenhund fetterknecht = new Blindenhund("Bluthund", "Gelb", "Hans-Peter");
		fetterknecht.sageArt();
		fetterknecht.sageRasse();
		fetterknecht.sageName();
		fetterknecht.gibLaut();
		fetterknecht.bewegen();
		fetterknecht.amputieren();
		fetterknecht.bewegen();
		fetterknecht.sageBeinanzahl();
		fetterknecht.amputieren();
		fetterknecht.amputieren();
		fetterknecht.amputieren();
		fetterknecht.sageBeinanzahl();
		fetterknecht.bewegen();
		fetterknecht.amputieren();
		fetterknecht.kastrieren();
		fetterknecht.Asiate();
	}
	
}
