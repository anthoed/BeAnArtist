package fr.eseo.pdlo.projet.artiste.vue.formes;

import java.awt.Color;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessinTest;
import fr.eseo.pdlo.projet.artiste.modele.formes.Ligne;
import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;




public class VueLigneTest {
	VueLigne ligne = new VueLigne(new Ligne(new Coordonnees(56,102),40,56));
	VueLigne ligne2 = new VueLigne(new Ligne(new Coordonnees(69,102),92,300));
	Ligne lign = new Ligne();
	VueLigne ligne3 = new VueLigne(lign);

	
	public VueLigneTest()
	{
		///*
		JFrame fenetre = new JFrame("testvueligne");
		fenetre.setSize(400, 400);
		fenetre.setBackground(new Color(255,000,000));
		
		Color fond = new Color(255,255,000);
		PanneauDessin panneau = new PanneauDessin(10,50,fond);
		fenetre.setContentPane(panneau);
		fenetre.setLocationRelativeTo(null);
		fenetre.setVisible(true);
		
		lign.setCouleur(Color.ORANGE);
	
		panneau.ajouterVueForme(ligne);
		panneau.ajouterVueForme(ligne2);
		panneau.ajouterVueForme(ligne3);
		
		//*/
	}
	
	
	
	public static void main(String[] args)
	{
		
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run(){
				new VueLigneTest();
			}
		});
	
		
		
	
	}

}
