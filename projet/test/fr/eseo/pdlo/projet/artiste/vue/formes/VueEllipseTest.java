package fr.eseo.pdlo.projet.artiste.vue.formes;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;
import fr.eseo.pdlo.projet.artiste.modele.formes.Ellipse;
import fr.eseo.pdlo.projet.artiste.modele.formes.Ligne;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;

public class VueEllipseTest {
	
	VueEllipse ellipse = new VueEllipse(new Ellipse(new Coordonnees(56,102),40,56));
	VueEllipse ellipse2 = new VueEllipse(new Ellipse());
	Ellipse ellip= new Ellipse();
	VueEllipse ellipse3 = new VueEllipse (ellip);
	
	public VueEllipseTest()
	{
		
		JFrame fenetre = new JFrame("testvueEllipse");
		fenetre.setSize(400, 400);
		fenetre.setBackground(new Color(255,000,000));
		
		Color fond = new Color(255,255,000);
		PanneauDessin panneau = new PanneauDessin(10,50,fond);
		fenetre.setContentPane(panneau);
		fenetre.setLocationRelativeTo(null);
		fenetre.setVisible(true);
		
		ellip.setCouleur(Color.PINK);
		
		panneau.ajouterVueForme(ellipse);
		panneau.ajouterVueForme(ellipse2);
		panneau.ajouterVueForme(ellipse3);
	
	}
	
	

	
	public static void main(String[] args)
	{
		
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run(){
				new VueEllipseTest();
			}
		});

}
}
