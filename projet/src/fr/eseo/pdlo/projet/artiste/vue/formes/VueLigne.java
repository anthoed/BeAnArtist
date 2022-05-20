package fr.eseo.pdlo.projet.artiste.vue.formes;
import fr.eseo.pdlo.projet.artiste.modele.formes.Ligne;
import fr.eseo.pdlo.projet.artiste.modele.formes.*;
import fr.eseo.pdlo.projet.artiste.vue.formes.VueForme;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;



import java.awt.Graphics2D;
import java.awt.Color;

public class VueLigne extends VueForme {

	
	//CONSTRUCTEUR
	public VueLigne(Ligne ligne)
	{
		super(ligne);
	}
	
	
	//METHODES

	public void affiche(Graphics2D g2d)
	{
		  int X1 = (int)Math.round(((Ligne) this.getForme()).getC1().getAbscisse());
	      int Y1 = (int)Math.round(((Ligne) this.getForme()).getC1().getOrdonnee());
	      int X2 = (int)Math.round(((Ligne) this.getForme()).getC2().getAbscisse());
	      int Y2 = (int)Math.round(((Ligne) this.getForme()).getC2().getOrdonnee());
	     
	     
		  g2d.setColor(this.getForme().getCouleur());
	      g2d.drawLine(X1, Y1, X2, Y2);
	      
	 
	}



}
