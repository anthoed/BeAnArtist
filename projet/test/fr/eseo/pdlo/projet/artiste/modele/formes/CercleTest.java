package fr.eseo.pdlo.projet.artiste.modele.formes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Locale;

import org.junit.jupiter.api.Test;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;


public class CercleTest {

	@Test
	public void testConstructeur() {
		Coordonnees p = new Coordonnees(4,8);
		Cercle el = new Cercle(new Coordonnees(4,8), 10);
		assertEquals(p,el.getPosition());
	}
	
	@Test
	void testStringFR() {
		Locale.setDefault(Locale.FRENCH);
		Cercle cercle = new Cercle();
		assertEquals(cercle.toString(), cercle.toString());
	}
	
	@Test
	void testStringEN() {
		Locale.setDefault(Locale.ENGLISH);
		Cercle cercle = new Cercle();
		assertEquals(cercle.toString(), cercle.toString());
	}
	
}


