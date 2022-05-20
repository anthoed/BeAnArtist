package fr.eseo.pdlo.projet.artiste.vue.formes;
import fr.eseo.pdlo.projet.artiste.modele.formes.Ellipse;
import fr.eseo.pdlo.projet.artiste.modele.formes.Ligne;
import java.awt.Color;

public class VueEllipse extends VueForme{
	
	//CONSTRUCTEUR
	public VueEllipse(Ellipse ellipse)
	{
		super(ellipse);
	}
	
	//METHODES
	
		public void affiche(java.awt.Graphics2D g2d)
		{
			int X1 = (int)Math.round(((Ellipse) this.getForme()).getPosition().getAbscisse());
		    int Y1 = (int)Math.round(((Ellipse) this.getForme()).getPosition().getOrdonnee());
		    int largeur = (int)Math.round(this.getForme().getLargeur());
		    int hauteur = (int)Math.round(this.getForme().getHauteur());
		    
		    
		    g2d.setColor(this.getForme().getCouleur());
		    g2d.drawOval(X1, Y1, largeur, hauteur);
		}

}
