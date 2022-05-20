package fr.eseo.pdlo.projet.artiste.vue.formes;
import fr.eseo.pdlo.projet.artiste.modele.formes.*;

public abstract class VueForme {
	
	protected final Forme forme;

	
	
	//CONSTRUCTEUR
	
	public VueForme(Forme forme)
	{
		this.forme = forme;
	}
	
	
	//METHODE
	public Forme getForme()
	{
		return this.forme;
	}
	
	public abstract void affiche(java.awt.Graphics2D g2d);
	
	
}
