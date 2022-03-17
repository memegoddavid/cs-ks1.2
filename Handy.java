public class Handy {

	//Eigenxschaften
	private String Marke;
	private int akku;
	private String OS;
	private double guthaben;
	
	//Beispiel für eine Klassenvariable
	private static int counter = 0;
	
	
	//Konstuktor
	public Handy(String aMarke, int aAkku, String aOS) {
		Marke = aMarke;
		OS = aOS;
		akku = aAkku;
		guthaben = 0.0;
		counter++;
	}
	
	
	
	//Fähigkeiten
	
	public String getMarke() {
		return Marke;
	}
	
	public int getAkku() {
		return akku;
	}
	
	public void laden() {
		akku = 100;
	}
	
	public String getOS() {
		return OS;
	}
	
	public String updateOS() {
		String no = OS.replaceAll("[^0-9]", "");
		int newosnum = Integer.parseInt(no);
		int hlp = newosnum + 1;
		String newos = "bios"+hlp;
		OS = newos;
		return OS + " wurde erfolgreich installiert.";
		
	}
	
	public double getGuthaben() {
		return guthaben;
	}
	
	public void ladeGuthaben() {
		guthaben = guthaben + 10;
	}
	
	public void ladeGuthaben(double Betrag) {
		guthaben = guthaben + Betrag;
	}
	
	public void telefoniere() {
		if ((guthaben>=0.5) && (akku>0)) {
			System.out.println("Ring ring...");
			akku--;
			guthaben = guthaben - 0.5;
		} else {
			if(guthaben < 0.5) {
				System.out.println("Fehlednes Guthaben. Bitte guthaben aufladen.");
			}
			
			if (akku == 0) {
				System.out.println("Akku leer, bitte laden.");
			}
		}
	}
	
	public static int getCounter() {
		return counter;
	}
	
	
}
