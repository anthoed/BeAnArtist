package fr.eseo.pdlo.projet.artiste.modele.formes;
import java.util.Locale;

import fr.eseo.pdlo.projet.artiste.modele.*;


public class Cercle extends Ellipse {
	
	//CONSTRUCTEUR
	
	public Cercle()
	{
		super(LARGEUR_PAR_DEFAUT, LARGEUR_PAR_DEFAUT);
		//setRemplissage(Remplissage.AUCUNE);
	}
	
	public Cercle(double taille)
	{
		super(taille,taille);
		//setRemplissage(Remplissage.AUCUNE);
	}
	
	public Cercle(Coordonnees position)
	{
		super(position,LARGEUR_PAR_DEFAUT, LARGEUR_PAR_DEFAUT);
		//setRemplissage(Remplissage.AUCUNE);
	}
	
	public Cercle(Coordonnees position, double taille)
	{
		super(position, taille, taille);
		//setRemplissage(Remplissage.AUCUNE);
	}
	
	//ACCESSEUR ET MUTATEUR
	
	public void setLargeur(double largeur)
	{
		super.setLargeur(largeur);
	}
	
	public void setHauteur(double hauteur)
	{
		super.setHauteur(hauteur);
	}
	
	//METHODES
	
	public double perimetre()
	{
		return 2*Math.PI*(this.getLargeur()/2);    // j'aurais aussi pu prendre getHauteur/2 car getLargeur == getHauteur
	}
	
	public double aire()
	{
		return Math.PI*Math.pow((this.getLargeur()/2),2);
	}
	

	
	@Override
	public String toString() 
	{
		Locale locale = Locale.getDefault();
		if (locale== Locale.ENGLISH) 
		{
		return "[Cercle] : pos " + getPosition() +" rayon "+ getLargeur()/2 + " périmètre : " + perimetre() + " aire : " + aire()+" couleur = R"+getCouleur().getRed()+",G"+getCouleur().getGreen()+",B"+getCouleur().getBlue();
		}
		
		else 
		{
			return "[Cercle] : pos " + getPosition() +" rayon "+ getLargeur()/2+ " périmètre : " + perimetre() + " aire : " + aire()+" couleur = R"+getCouleur().getRed()+",V"+getCouleur().getGreen()+",B"+getCouleur().getBlue();
		}

	}

}
