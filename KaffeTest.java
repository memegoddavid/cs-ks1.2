import java.util.Scanner;

public class KaffeTest {

	public static void main(String[] args) {
		
		Kaffeemaschine_OOP km1 = new Kaffeemaschine_OOP("Jura");
		Kaffeemaschine_OOP km2 = new Kaffeemaschine_OOP("Siemens");
		
		km1.nenneBohnenstand();
		km1.KocheKaffee();
		km1.FuelleBohnen(5);
		km1.FuelleWasser(5);
		km1.KocheKaffee();
		km1.nenneBohnenstand();
		km1.NenneWasserstand();
		//km1.Marke = "Tschibo";
		//km1.SageMarke();
		

	}

}
