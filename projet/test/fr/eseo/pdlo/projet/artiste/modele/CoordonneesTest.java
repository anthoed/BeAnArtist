package fr.eseo.pdlo.projet.artiste.modele;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class CoordonneesTest {

	@Test
	void Constructeur_argu() {
		Coordonnees p1 = new Coordonnees( 4,5);
		assertEquals( 4, p1.getAbscisse(), "4 est bien la bonne abscisse");
		assertEquals(5,p1.getOrdonnee(), "5'est bien la bonne coordonnees");
		
		//assertEquals(double,p1.getCoordY().getClass().getSimpleName(), "5'est bien la bonne coordonnees");

	
	
		}
	
	@Test
	void Constructeur_without_argu() {
		Coordonnees p2 = new Coordonnees();
		assertEquals( 10, p2.getAbscisse(), "4 est bien la bonne abscisse");
		assertEquals(10,p2.getOrdonnee(), "5'est bien la bonne coordonnees");
	
		}
	
	@Test
	void verif_deplaceVers() {
		Coordonnees p3 = new Coordonnees(5,5);
		p3.deplacerVers(5,5);
		assertEquals( 5, p3.getAbscisse(), "on s'est bien déplace à 5 en x");
		assertEquals(5,p3.getOrdonnee(), "on s'est bien déplace à 5 en y");
	
		}
	
	@Test
	void verif_deplaceDe_positif() {
		Coordonnees p4 = new Coordonnees(5,5);
		p4.deplacerDe(5,5);
		assertEquals( 10, p4.getAbscisse(), "on s'est bien déplace de 5 en x");
		assertEquals(10,p4.getOrdonnee(), "on s'est bien déplace de 5 en y");
	
		}
	
	@Test
	void verif_deplaceVers_negatif() {
		Coordonnees p5 = new Coordonnees(5,5);
		p5.deplacerDe(-5,-5);
		assertEquals(0 , p5.getAbscisse(), "on s'est bien déplace à 5 en x");
		assertEquals(0,p5.getOrdonnee(), "on s'est bien déplace à 5 en y");
	
		}
	
	
	@Test
	void verif_distance() {
		Coordonnees p6 = new Coordonnees(5,5);
		Coordonnees  p7 = new Coordonnees(10,5);
		assertEquals(5 ,p6.distanceVers(p7), "on s'est bien déplace à 5 en x");
	
		}
	
	@Test
	void verif_angles() {
		
		Coordonnees p8 = new Coordonnees(5,5);
		Coordonnees p9 = new Coordonnees(10,5);
		assertEquals(0 ,p8.angleVers(p9), "on s'est bien déplace à 5 en x");
		//System.out.println(p8.angleVers(p9));
	}
	
	@Test
	void verif_angles_deux() {
		
		Coordonnees p8 = new Coordonnees(0,0);
		Coordonnees p9 = new Coordonnees(0,4);
		//assertEquals(0 ,p8.angleVers(p9), "on s'est bien déplace à 5 en x");
		System.out.println(p8.angleVersdeux(p9));
	}
		
	
	
	@Test
	void strverif()
	{
		Coordonnees point = new Coordonnees(6.2,4.1);
		//assertEquals((6,2,4,1),point.toString(), "on s'est bien déplace à 5 en x");
		System.out.println(point.toString());
		
		
	}
	
	@Test
	
		void valeur_angle() {
		
		Coordonnees c1 = new Coordonnees(0,0);
		Coordonnees c2 = new Coordonnees(0,4); // on a 90 degres donc 1,57 radian
		Coordonnees c3 = new Coordonnees(0,-4);// on a -90 degres donc -1,57 radian
		Coordonnees c4 = new Coordonnees(-4,0);// on a 180 degres donc 3,14
		Coordonnees c5 = new Coordonnees(-4,0.5); // on est proce de 180 degres donc 3,14
		Coordonnees c6 = new Coordonnees(-0.01,4);// on a un peu plus de 90 degres donc avec un peu plus de 1,57
		Coordonnees c7 = new Coordonnees(0.01,4);
		
		//assertEquals(0 ,p8.angleVers(p9), "on s'est bien déplace à 5 en x");
		System.out.println("l'angle vaut "+ c1.angleVers(c2));
		System.out.println("l'angle vaut "+ c1.angleVers(c3));
		System.out.println("l'angle vaut "+ c1.angleVers(c4));
		System.out.println("l'angle vaut "+ c1.angleVers(c5));
		System.out.println("l'angle vaut "+ c1.angleVers(c6));
		System.out.println("l'angle vaut "+ c1.angleVers(c7));
	}
	
	
	
	
	
	
	
	

}
