package fr.eseo.pdlo.projet.artiste.vue.ihm;

import fr.eseo.pdlo.projet.artiste.controleur.actions.*;

import java.awt.*;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;


public class PanneauBarreOutils extends JPanel {
	
	private PanneauDessin panneauDessin;
	Container boutonChoixForme;
	
	public PanneauBarreOutils(PanneauDessin panneauDessin)
	{
	
	this.panneauDessin = panneauDessin;
	//JPanel listPane = new JPanel();
	this.panneauDessin.setLayout(new BoxLayout(panneauDessin,BoxLayout.PAGE_AXIS));
	this.setLayout(new GridLayout(6, 1));
	initComponents();

	}
	
	private void initComponents()
	{
		Dimension taille = new Dimension(200, 30);
		
		
		JButton boutonEffacer = new JButton(new ActionEffacer(this.panneauDessin));
		boutonEffacer.setMaximumSize(taille);
		boutonEffacer.setName(ActionEffacer.NOM_ACTION);
		this.add(boutonEffacer);
		
		ButtonGroup GroupeDeButton = new ButtonGroup();
	
		ActionChoisirForme actionLigne = new ActionChoisirForme(this.panneauDessin,this, ActionChoisirForme.NOM_ACTION_LIGNE);
		JToggleButton boutonLigne = new JToggleButton(actionLigne);
		boutonLigne.setName(ActionChoisirForme.NOM_ACTION_LIGNE);
		boutonLigne.setMaximumSize(taille);
		GroupeDeButton.add(boutonLigne);
		this.add(boutonLigne);

		
		ActionChoisirForme actionEllipse = new ActionChoisirForme(this.panneauDessin, this, ActionChoisirForme.NOM_ACTION_ELLIPSE);
		JToggleButton boutonEllipse = new JToggleButton(actionEllipse);
		boutonEllipse.setName(ActionChoisirForme.NOM_ACTION_ELLIPSE);
		boutonEllipse.setMaximumSize(taille);
		GroupeDeButton.add(boutonEllipse);
		this.add(boutonEllipse);

		
		ActionChoisirForme actionCercle = new ActionChoisirForme(this.panneauDessin, this, ActionChoisirForme.NOM_ACTION_CERCLE);
		JToggleButton boutonCercle = new JToggleButton(actionCercle);
		boutonCercle.setName(ActionChoisirForme.NOM_ACTION_CERCLE);
		boutonCercle.setMaximumSize(taille);
		GroupeDeButton.add(boutonCercle);
		this.add(boutonCercle);
		
		//JToggleButton boutonSelect = new JToggleButton(new ActionSelectionner(panneauDessin));
		//boutonSelect.setMaximumSize(taille);
		//boutonSelect.setName(ActionSelectionner.NOM_ACTION);
		//boutonChoixForme.add(boutonSelect);
		//this.add(boutonSelect);
		
		JToggleButton boutonSelection = new JToggleButton(new ActionSelectionner(panneauDessin));
		boutonSelection.setMaximumSize(taille);
		boutonSelection.setName(ActionSelectionner.NOM_ACTION);
		this.add(boutonSelection);
		
		JButton boutonCouleur = new JButton(new ActionChoisirCouleur(panneauDessin));
		boutonCouleur.setMaximumSize(taille);
		boutonCouleur.setName(ActionChoisirCouleur.NOM_ACTION);
		boutonCouleur.setBackground(this.panneauDessin.getCouleurCourante());
		this.add(boutonCouleur);

	
		
	}
	

}
