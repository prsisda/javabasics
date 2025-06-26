package javabasics.klasseneigenschaften001;

public class MatheUtils {
	
	private int laenge; // Objektattribut
	
	private int breite; // Objektattribut
	
	private int radius;	// Objektattribut
	
	public static final double PI = 3.14159;	// Klassenattribut
	
	public MatheUtils(int l, int b) {
		this.laenge = l;
		this.breite = b;
	}
	
	public int rechteckFlaecheBerechnen() {
		return this.laenge * this.breite;
	}
	
	public static double getPIExtended() {	
		return PI + 1;
	}
	
	
}
