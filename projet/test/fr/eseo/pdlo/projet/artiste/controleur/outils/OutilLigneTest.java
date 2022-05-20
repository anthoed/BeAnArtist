package fr.eseo.pdlo.projet.artiste.controleur.outils;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;

public class OutilLigneTest {


	
	public OutilLigneTest()
	{
		///*
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
		
		
		//*/
	}
	
	
	
	public static void main(String[] args)
	{
		
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run(){
				new OutilLigneTest();
			}
		});
	
		
		
	
	}
}
