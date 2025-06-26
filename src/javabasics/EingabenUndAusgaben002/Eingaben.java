package javabasics.EingabenUndAusgaben002;

import java.util.Scanner;

public class Eingaben {

	public static void main(String[] args) {

		System.out.println("Wie alt sind Sie?");	// Ausgabe 
		
		Scanner scanner = new Scanner(System.in);
		int alter = scanner.nextInt();				// Eingabe über die Tastatur
		System.out.println("Sie sind " + alter + " Jahre alt.");					// Ausgabe
	
		
		System.out.println("Wie groß sind Sie?");
		double groesse = scanner.nextDouble();
		System.out.println("Sie sind " + groesse + " m groß, wow!");
		
		scanner.close();
	}

}
