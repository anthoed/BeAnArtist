package fr.eseo.pdlo.projet.artiste.vue.ihm;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.pdlo.projet.artiste.controleur.outils.OutilLigne;

public class PanneauBarreOutilsTest 
{
	private void testPanneauBarreOutil() {
		JFrame fenetre = new JFrame("testPanneauBarreOutil");
				
		Color fond = new Color(255,255,000);
		PanneauDessin panneau = new PanneauDessin(800,500,fond);
		panneau.associerOutil(new OutilLigne());
		
		PanneauBarreOutils panneauBarreOutils = new PanneauBarreOutils(panneau);
		fenetre.add(panneauBarreOutils, BorderLayout.EAST);
		
		
		PanneauBarreEtat panneauEtat = new PanneauBarreEtat(panneau);
		fenetre.add(panneauEtat, BorderLayout.SOUTH);
		
		
		fenetre.add(panneau);
		fenetre.pack();
		fenetre.setLocationRelativeTo(null);
		fenetre.setVisible(true);
		
	}		
		


	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				PanneauBarreOutilsTest test = new PanneauBarreOutilsTest();
				test.testPanneauBarreOutil();
				
			}
		});
	}

}
