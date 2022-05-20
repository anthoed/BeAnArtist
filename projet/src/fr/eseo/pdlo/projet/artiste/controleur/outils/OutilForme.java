package fr.eseo.pdlo.projet.artiste.controleur.outils;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;
import fr.eseo.pdlo.projet.artiste.vue.formes.VueForme;
import fr.eseo.pdlo.projet.artiste.modele.formes.*;
import java.awt.event.*;

public abstract class OutilForme extends Outil {
	
	public void mouseClicked(MouseEvent event)
	{
		double final_x1_mouse = event.getPoint().getX() + Forme.LARGEUR_PAR_DEFAUT;
		double final_y1_mouse = event.getPoint().getY() + Forme.HAUTEUR_PAR_DEFAUT;
		setFin(new Coordonnees(final_x1_mouse,final_y1_mouse));
		if (event.getClickCount() == 2 && (this.getDebut() != getFin())) 
			{
			
				getPanneauDessin().ajouterVueForme(this.creerVueForme());
				this.getPanneauDessin().repaint();
			}
	}
	
	public void mouseReleased(MouseEvent event)
	{
		this.setFin(new Coordonnees((double)event.getPoint().getX(),(double)event.getPoint().getY()));
		if (this.getDebut().getAbscisse()!= this.getFin().getAbscisse())
		{
			
			this.getPanneauDessin().ajouterVueForme(this.creerVueForme());
			this.getPanneauDessin().repaint();
		}
	}
	
	protected abstract VueForme creerVueForme();

}
