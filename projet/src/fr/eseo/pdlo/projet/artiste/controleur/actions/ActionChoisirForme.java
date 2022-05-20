package fr.eseo.pdlo.projet.artiste.controleur.actions;

import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauBarreOutils;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;
import fr.eseo.pdlo.projet.artiste.controleur.outils.*;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;

public class ActionChoisirForme extends AbstractAction {
	
	public static final String NOM_ACTION_LIGNE = "ligne" ;
	public static final String NOM_ACTION_ELLIPSE = "ellipse";
	public static final String NOM_ACTION_CERCLE = "cercle";
	
	private PanneauDessin panneauDessin;
	private PanneauBarreOutils panneauOutils;
	private String nom ;
	
	public ActionChoisirForme(PanneauDessin panneauDessin,PanneauBarreOutils panneauOutils,String action)
	{
		super(action);
		this.panneauDessin = panneauDessin;
		this.panneauOutils = panneauOutils;
	}
	
	public void actionPerformed (ActionEvent event)
	{
		/*
		if (event.getActionCommand() == NOM_ACTION_LIGNE) //en comparantl’actionCommand récupérée dans l’ActionEvent avec les différentes constantes de classe
		 {
			 OutilLigne Outil = new OutilLigne();
			 this.panneauDessin.associerOutil(Outil);
		 }
		 
		 if (event.getActionCommand() == NOM_ACTION_ELLIPSE) 
		 {
			 OutilEllipse Outil = new OutilEllipse();
			 this.panneauDessin.associerOutil(Outil);
		 }
		 
		 if (event.getActionCommand() == NOM_ACTION_CERCLE) 
		 {
			 OutilCercle Outil = new OutilCercle();
			 this.panneauDessin.associerOutil(Outil);
		 }
		*/    
		 switch (event.getActionCommand()) 
		 {
		        case NOM_ACTION_LIGNE : OutilLigne Outilligne = new OutilLigne();
										this.panneauDessin.associerOutil(Outilligne);
										break;
					
		        case NOM_ACTION_ELLIPSE : OutilEllipse Outilellipse = new OutilEllipse();
					 					  this.panneauDessin.associerOutil(Outilellipse);
					 					  break;
		  
		        case NOM_ACTION_CERCLE : OutilCercle Outil = new OutilCercle();
										 this.panneauDessin.associerOutil(Outil);
										 break;
		        default :
		      
		 }
	}

}
