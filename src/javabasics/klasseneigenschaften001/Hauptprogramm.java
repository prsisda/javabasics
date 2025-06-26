package javabasics.klasseneigenschaften001;

public class Hauptprogramm {

	public static void main(String[] args) {

		MatheUtils mu1 = new MatheUtils(10, 20);
		int mu1Flaeche = mu1.rechteckFlaecheBerechnen();
		System.out.println("MU1 Fläche: " + mu1Flaeche);
		
		MatheUtils mu2 = new MatheUtils(5, 7);
		int mu2Flaeche = mu2.rechteckFlaecheBerechnen();
		System.out.println("MU2 Fläche: " + mu2Flaeche);
		
		System.out.println(MatheUtils.PI);
		
		
		int radius = 5;
		double flacheKreis = MatheUtils.PI * Math.pow(radius, 2);
		
		
		System.out.println(MatheUtils.getPIExtended());
	}

}
