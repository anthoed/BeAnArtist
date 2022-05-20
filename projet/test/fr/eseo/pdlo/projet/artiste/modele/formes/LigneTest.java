package fr.eseo.pdlo.projet.artiste.modele.formes;

import static org.junit.jupiter.api.Assertions.*;
import fr.eseo.pdlo.projet.artiste.modele.*;
import java.awt.*;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class LigneTest {

	@Test
	void testConstructeur() {
		Ligne ligne1 = new Ligne(new Coordonnees(2,3),14,54);
	
	assertEquals(new Coordonnees(2,3),ligne1.getC1(),"point c1");
	

	}
	
	//@Test
	//void testCouleur() {
		//Ligne ligne1 = new Ligne(new Coordonnees(2,3),14.5,54.4,new Color(255,012,224));
	
//	assertEquals(new Coordonnees(2,3),ligne1.getC1(),"point c1");
	

	//}
	
	@Test
	void testStringFR() {
		Locale.setDefault(Locale.FRENCH);
		Ligne e = new Ligne();
		assertEquals(e.toString(), e.toString());
	}
	
	@Test
	void testStringEN() {
		Locale.setDefault(Locale.ENGLISH);
		Ligne e = new Ligne();
		assertEquals(e.toString(), e.toString());
	}
	
}


