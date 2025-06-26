package javabasics.EingabenUndAusgaben002;

import javabasics.utils.IO;

public class EingabenMitIO {

	public static void main(String[] args) {

		int alter = IO.promptAndReadInt("Wie alt sind Sie?");
		System.out.println("Sie sind " + alter + " Jahre alt.");					// Ausgabe

		
		double groesse = IO.promptAndReadDouble("Wie groß sind Sie?");
		System.out.println("Sie sind " + groesse + " m, wow!");					// Ausgabe

	}

}
