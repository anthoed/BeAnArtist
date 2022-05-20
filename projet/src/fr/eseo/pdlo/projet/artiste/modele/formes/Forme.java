package fr.eseo.pdlo.projet.artiste.modele.formes;
import fr.eseo.pdlo.projet.artiste.modele.*;


import java.awt.Color;

import javax.swing.UIManager;


public abstract class Forme implements Coloriable {

	static final Coordonnees Coordonnees_PAR_DÉFAUT = new Coordonnees(0,0);
	public static final double LARGEUR_PAR_DEFAUT = 100;
	public static final double HAUTEUR_PAR_DEFAUT = 100;
	public static final Color COULEUR_PAR_DEFAUT =  UIManager.getColor("Panel.foreground");

	private double largeur;
	private double hauteur;
	private Coordonnees position;
	private Color couleur;
	
		
//CONSTRUCTEUR
	
	public Forme()
	{
		this ( new Coordonnees () , LARGEUR_PAR_DEFAUT ,HAUTEUR_PAR_DEFAUT, COULEUR_PAR_DEFAUT);

	}
	
	public Forme(double largeur, double hauteur)
	{
		this ( new Coordonnees () , largeur , hauteur,  COULEUR_PAR_DEFAUT );
	}
	
	public Forme(Coordonnees position)
	{
		this ( position , LARGEUR_PAR_DEFAUT , HAUTEUR_PAR_DEFAUT, COULEUR_PAR_DEFAUT);	
	}
	
	public Forme(Coordonnees position, double largeur, double hauteur)
	{
		setPosition(position);
		setLargeur(largeur);
		setHauteur(hauteur);
		setCouleur(COULEUR_PAR_DEFAUT);
	}
	
	public Forme(Coordonnees position, double largeur, double hauteur , Color couleur)
	{
		setPosition(position);
		setLargeur(largeur);
		setHauteur(hauteur);
		setCouleur(couleur);
	}
	
	
	
//ACCESSEUR ET MUTATEUR
	
	public Coordonnees getPosition() 
		{
			return this.position;
		}
	
	public double getLargeur()
		{
			return this.largeur;
		}
	
	public double getHauteur()
		{
			return this.hauteur;
		}
	
	public void setPosition ( Coordonnees position )
		{
			this.position = position;
		}
	
	public void setLargeur ( double largeur )
		{
			this.largeur = largeur;
		}
	
	public void setHauteur ( double hauteur )
		{
			this.hauteur = hauteur;
		}

	

	
//METHODES
	
	//Recuperer les coordonnees du cadre qui entoure la forme
	
	public double getCadreMinX()
	{
		double X_du_cadre_de_la_forme= this.getPosition().getAbscisse();                 //Abs du coin supérieur gauche du rectangle qui englobe la forme
		double X_de_la_forme = this.getPosition().getAbscisse() + this.getLargeur();     //Abs de la forme ( donc a droite ou a gauche sur l'axe des "x" de Abs du coin supérieur gauche du rectangle
		double Xmin = Math.min(X_du_cadre_de_la_forme, X_de_la_forme);
		return Xmin;		
	}
	
	public double getCadreMinY()
	{
		double Y_du_cadre_de_la_forme= this.getPosition().getOrdonnee();
		double Y_de_la_forme = this.getPosition().getOrdonnee() + this.getHauteur();
		double Ymin = Math.min(Y_du_cadre_de_la_forme, Y_de_la_forme);
		return Ymin;		
	}
	
	public double getCadreMaxX()
	{
		double X_du_cadre_de_la_forme= this.getPosition().getAbscisse();
		double X_de_la_forme = this.getPosition().getAbscisse() + this.getLargeur();
		double Xmax = Math.max(X_du_cadre_de_la_forme, X_de_la_forme);
		return Xmax;	
	}
	
	public double getCadreMaxY()
	{
		double Y_du_cadre_de_la_forme= this.getPosition().getOrdonnee();
		double Y_de_la_forme = this.getPosition().getOrdonnee() + this.getHauteur();
		double Ymax = Math.max(Y_du_cadre_de_la_forme, Y_de_la_forme);
		return Ymax;		
	}
	
	// Deplacer le cadre de la forme
	
	
	public void deplacerDe(double dx, double dy) {
		this.position.setAbscisse(this.position.getAbscisse()+dx);
		this.position.setOrdonnee(this.position.getOrdonnee()+dy);
	}
	public void deplacerVers(double nx, double ny) {
		this.position.setAbscisse(nx);
		this.position.setOrdonnee(ny);
	}
	
	@Override
	public Color getCouleur() {
		return this.couleur;
	}
	
	@Override
	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}
	
	// abtract methodes
	public abstract double aire();
	public abstract double perimetre();
	public abstract boolean contient(Coordonnees coordonnees);


}
