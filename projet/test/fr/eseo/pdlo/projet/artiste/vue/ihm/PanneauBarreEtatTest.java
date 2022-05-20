package fr.eseo.pdlo.projet.artiste.vue.ihm;
import fr.eseo.pdlo.projet.artiste.controleur.outils.*;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class PanneauBarreEtatTest {
	public void PanneauBarreEtatTest() {
		JFrame fenetre = new JFrame("testOutilVueligne");
		fenetre.setSize(400, 400);
		fenetre.setBackground(new Color(255,000,000));
		
		Color fond = new Color(255,255,000);
		PanneauDessin panneau = new PanneauDessin(800,500,fond);
		fenetre.add(panneau);
		fenetre.pack();
		fenetre.setLocationRelativeTo(null);
		fenetre.setVisible(true);
		panneau.associerOutil(new OutilLigne());
		
		
		PanneauBarreEtat panneauEtat = new PanneauBarreEtat(panneau);
		
		panneau.add(panneauEtat, BorderLayout.SOUTH);
		fenetre.add(panneau);
		
	
	}



	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				PanneauBarreEtatTest test = new PanneauBarreEtatTest();
				test.PanneauBarreEtatTest();
			}
		});
	}

}
