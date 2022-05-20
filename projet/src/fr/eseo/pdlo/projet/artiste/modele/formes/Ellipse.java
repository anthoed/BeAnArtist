package fr.eseo.pdlo.projet.artiste.modele.formes;
import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;
import java.util.Locale;
//import fr.eseo.pdlo.projet.artiste.modele.Remplissage;
//import fr.eseo.pdlo.projet.artiste.modele.Remplissable;

public class Ellipse extends Forme {                 // implements Remplissable
	

	
	public double a = this.getLargeur()/2;         //petit rayon
	public double b = this.getHauteur()/2;         //grand rayon
	public static final double EPSILON = 0.2;
	//public Remplissage remplissage;
	
//CONSTRUCTEUR
	
	public Ellipse()
	{
		super();
		//setRemplissage(Remplissage.AUCUNE);
	}
	
	public Ellipse(double largeur, double hauteur)
	{
		super(largeur,hauteur);
		//setRemplissage(Remplissage.AUCUNE);
		
		if (largeur<0 || hauteur<0) {
			throw new IllegalArgumentException("la largeur et la hauteur ne peut etre négative");
		}
		
	}
	
	public Ellipse(Coordonnees position)
	{
		super(position);
		//setRemplissage(Remplissage.AUCUNE);
	}
	
	public Ellipse(Coordonnees position, double largeur, double hauteur)
	{
		super(position,largeur,hauteur);
		//setRemplissage(Remplissage.AUCUNE);
		
		if (largeur<0 || hauteur<0) {
			throw new IllegalArgumentException("la largeur et la hauteur ne peut etre négative");
			
		}
	
	}

	
//ACCESSEUR ET MUTATEUR
	
	public void setLargeur(double largeur)
	{
		super.setLargeur(largeur);                 //super.Methode() c'est comme this.methode() sauf que ça appelle la méthode de la classe mère
	}
	
	public void setHauteur(double hauteur)
	{
		super.setHauteur(hauteur);
	}
	
	public double aire()
	{
		//double a = this.getLargeur()/2;
		//double b = this.getHauteur()/2;
		
		double aire = Math.PI*a*b;               // formule d'air d'une ellipse 
		return aire;
		
	}
	
	public double perimetre()
	{
		//double a = this.getLargeur()/2;
		//double b = this.getHauteur()/2;
		double h = Math.pow(((a-b)/(a+b)),2);
		
		double perimetre =  Math.PI*(a+b)*(1+((3*h)/(10+Math.pow(4-3*h, 1/2))));  // formule du périmetre d'une ellipse
		return perimetre;
		
		
	}
	
	public boolean contient(Coordonnees coordonnees)
	{
		boolean contient = false;
		Coordonnees centre = new Coordonnees(this.getPosition().getAbscisse()+this.getLargeur()/2, this.getPosition().getOrdonnee()+this.getHauteur()/2);
		double xCentre = centre.getAbscisse();
		double yCentre = centre.getOrdonnee();
		double a = this.getLargeur()/2;
		double b = this.getHauteur()/2;	
		double r = (coordonnees.getAbscisse()-xCentre)*(coordonnees.getAbscisse()-xCentre)/(a*a)+(coordonnees.getOrdonnee()-yCentre)*(coordonnees.getOrdonnee()-yCentre)/(b*b);
		if((r-1)<Ellipse.EPSILON){
			contient = true;
		}
		return contient;
	}
	/*
	@Override
	public Remplissage getRemplissage() {
		return this.remplissage;
	}
	@Override
	public void setRemplissage(Remplissage modeRemplissage) {
		this.remplissage = modeRemplissage;
	}
	*/

	@Override
	public String toString() 
	{
		Locale locale  = Locale.getDefault();
	
		if (locale== Locale.ENGLISH) 
		{
		return "[Ellipse] : pos "+ getPosition() +" petit rayon "+ a + " grand rayon " + b + " périmètre : " + perimetre() + " aire : " + aire()+" couleur = R"+getCouleur().getRed()+",G"+getCouleur().getGreen()+",B"+getCouleur().getBlue();
		}
		
		else 
		{
			return "[Ellipse] : pos "+ getPosition() +" petit rayon "+ a + " grand rayon " + b + " périmètre : " + perimetre() + " aire : " + aire()+" couleur = R"+getCouleur().getRed()+",V"+getCouleur().getGreen()+",B"+getCouleur().getBlue();
		}
	}


	
	
	
	
	
	
}
