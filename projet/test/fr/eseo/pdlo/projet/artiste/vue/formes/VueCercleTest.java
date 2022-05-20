package fr.eseo.pdlo.projet.artiste.vue.formes;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;
import fr.eseo.pdlo.projet.artiste.modele.formes.Cercle;
import fr.eseo.pdlo.projet.artiste.modele.formes.Ellipse;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;

public class VueCercleTest {

	VueCercle cercle = new VueCercle(new Cercle(new Coordonnees(56,102),255));
	VueEllipse cercle2 = new VueCercle(new Cercle(56));
	VueEllipse cercle3 = new VueCercle(new Cercle());
	VueCercle cercle4 = new VueCercle(new Cercle(new Coordonnees(56,102)));
	Cercle cercl= new Cercle();
	VueCercle cercle5 = new VueCercle (cercl);
	
	
	public VueCercleTest()
	{

		JFrame fenetre = new JFrame("testvueCercle");
		fenetre.setSize(400, 400);
		fenetre.setBackground(new Color(255,000,000));
		
		Color fond = new Color(255,255,000);
		PanneauDessin panneau = new PanneauDessin(10,50,fond);
		fenetre.setContentPane(panneau);
		fenetre.setLocationRelativeTo(null);
		fenetre.setVisible(true);
		
		cercl.setCouleur(Color.CYAN);
		
		panneau.ajouterVueForme(cercle);
		panneau.ajouterVueForme(cercle2);
		panneau.ajouterVueForme(cercle3);
		panneau.ajouterVueForme(cercle4);
		panneau.ajouterVueForme(cercle5);
	}
	
	

	
	
	public static void main(String[] args)
	{
		
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run(){
				new VueCercleTest();
			}
		});

}
}
