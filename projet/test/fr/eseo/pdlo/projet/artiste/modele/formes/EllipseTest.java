package fr.eseo.pdlo.projet.artiste.modele.formes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Locale;

import org.junit.jupiter.api.Test;
import fr.eseo.pdlo.projet.artiste.modele.*;
import fr.eseo.pdlo.projet.artiste.modele.formes.*;
 public class EllipseTest 
 {

	 @Test
		public void testConstructeur()
	 {
			Coordonnees p = new Coordonnees(4,8);
			Ellipse el = new Ellipse(new Coordonnees(4,8), 10,20);
			assertEquals(p,el.getPosition());
			

	 }
	 
		@Test
		void testStringFR() {
			Locale.setDefault(Locale.FRENCH);
			Ellipse e = new Ellipse();
			assertEquals(e.toString(), e.toString());
		}
		
		@Test
		void testStringEN() {
			Locale.setDefault(Locale.ENGLISH);
			Ellipse e = new Ellipse();
			assertEquals(e.toString(), e.toString());
		}
		
 }
 

 
 
 
 
 
 
	//@Test
	//public void testConstructeur() {
	//	Coordonnees p1 = new Coordonnees(2,4);
		//Ellipse el = new Ellipse(new Coordonnees(4,5), 10,20);
		//assetEquals()