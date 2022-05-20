package fr.eseo.pdlo.projet.artiste.controleur.actions;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.pdlo.projet.artiste.controleur.outils.OutilLigne;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauBarreEtat;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauBarreOutils;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauBarreOutilsTest;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;

public class ActionChoisirCouleurTest {
	
	
	private void testActionChoisirCouleur() {
		JFrame fenetre = new JFrame("testPanneauBarreOutil");
				
		Color fond = new Color(255,255,000);
		PanneauDessin panneau = new PanneauDessin(800,500,fond);
		panneau.associerOutil(new OutilLigne());
		
		PanneauBarreOutils panneauBarreOutils = new PanneauBarreOutils(panneau);
		fenetre.add(panneauBarreOutils, BorderLayout.EAST);
		
		
		PanneauBarreEtat panneauEtat = new PanneauBarreEtat(panneau);
		fenetre.add(panneauEtat, BorderLayout.SOUTH);
		
		fenetre.setSize(PanneauDessin.LARGEUR_PAR_DEFAUT, PanneauDessin.HAUTEUR_PAR_DEFAUT);
		fenetre.setLocationRelativeTo(null);
		fenetre.setVisible(true);
		fenetre.add(panneau);
		fenetre.pack();
		
	}		
		


	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				ActionChoisirCouleurTest test = new ActionChoisirCouleurTest();
				test.testActionChoisirCouleur();
				
			}
		});
	}


}
