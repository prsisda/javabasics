package javabasics.uebung001.EingabenUndAusgaben;

import javabasics.utils.IO;

public class BMI {

	public static void main(String[] args) {
		
		double gewicht = 80.5;
		double groesse = 1.6;
		
		double bmi = gewicht / (groesse * groesse);
		IO.writeln("BMI Wert = " + bmi);
	}

}
