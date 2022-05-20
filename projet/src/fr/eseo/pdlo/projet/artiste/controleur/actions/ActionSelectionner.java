package fr.eseo.pdlo.projet.artiste.controleur.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import fr.eseo.pdlo.projet.artiste.controleur.outils.OutilSelectionner;
import fr.eseo.pdlo.projet.artiste.vue.ihm.*;


public class ActionSelectionner extends AbstractAction {
	
	public static final String NOM_ACTION = "selection";
	
	PanneauDessin panneauDessin;
	
	
	public ActionSelectionner (PanneauDessin panneauDessin)
	{
		super(NOM_ACTION);
		this.panneauDessin = panneauDessin;
	}
	
	public void actionPerformed(ActionEvent event) {
		panneauDessin.associerOutil(new OutilSelectionner());
	}
}

