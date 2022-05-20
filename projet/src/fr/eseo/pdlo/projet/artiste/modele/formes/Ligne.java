package fr.eseo.pdlo.projet.artiste.modele.formes;
import java.text.DecimalFormat;
import java.util.Locale;

import fr.eseo.pdlo.projet.artiste.modele.*;

public class Ligne extends Forme{
	
	public static final double EPSILON = 0.2;
	

//CONSTRUCTEUR

	public Ligne()
	{
		super();
	}
	
	public Ligne(Coordonnees position, double largeur, double hauteur)
	{
		super (position,largeur,hauteur);
	}
	
	public Ligne(double x, double y,double largeur, double hauteur)
	{
		super(new Coordonnees(x,y), largeur, hauteur);
	}
	
	public Ligne(Coordonnees position)
	{
		super(position);
	}
	
	
	public Ligne(double largeur,double hauteur)
	{
		super(largeur, hauteur);
	}
	

//ACCESSEUR ET MUTATEUR
	
	
	public Coordonnees getC1()
	{
		return this.getPosition();
	}
	
	public Coordonnees getC2()
	{
		return (new Coordonnees(this.getC1().getAbscisse()+this.getLargeur(),this.getC1().getOrdonnee()+this.getHauteur()));
	}
	
	public void setC1(Coordonnees coord)
	{
		setLargeur(getC2().getAbscisse()-coord.getAbscisse());
		setHauteur(getC2().getOrdonnee()-coord.getOrdonnee());
		setPosition(coord);
	}
	
	public void setC2(Coordonnees coord)
	{
		setLargeur(coord.getAbscisse()-getC1().getAbscisse());
		setHauteur(coord.getOrdonnee()-getC1().getOrdonnee());
	}
	
	public double aire()
	{
		return 0;
	}
	
	public double perimetre()
	{
		return this.getC1().distanceVers(getC2());
	}
	
	public double angle()
	{
		return (Math.toDegrees(this.getC1().angleVers(getC2()))+360)%360 ; // pour les deux dernieropération sert a couvrire l'angle sur 1 tour complet
	}
	
	public boolean contient(Coordonnees coordonnees)
	{
		return (getC1().distanceVers(coordonnees)+getC2().distanceVers(coordonnees)-getC1().distanceVers(getC2())<= EPSILON);
	}

	@Override
	public String toString() {
		Locale locale  = Locale.getDefault();
		DecimalFormat df = new DecimalFormat("0.0#");
		
		if (locale == Locale.ENGLISH) {
		return "[Ligne] c1 : " + getC1() + " c2 : " + getC2() +" longueur : "+df.format(perimetre())+ " angle : "
			+ df.format(angle()) +"°"+" couleur = R"+getCouleur().getRed()+",G"+getCouleur().getGreen()+",B"+getCouleur().getBlue();
		}
		
		else {
			return "[Ligne] c1 : " + getC1() + " c2 : " + getC2() +" longueur : "+df.format(perimetre())+ " angle : "
					+ df.format(angle()) +"°"+" couleur = R"+getCouleur().getRed()+",V"+getCouleur().getGreen()+",B"+getCouleur().getBlue();
		}
	}
	
	
	
	
	

}
