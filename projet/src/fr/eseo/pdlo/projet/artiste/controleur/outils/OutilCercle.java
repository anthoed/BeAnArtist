package fr.eseo.pdlo.projet.artiste.controleur.outils;

import java.awt.event.MouseEvent;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;
import fr.eseo.pdlo.projet.artiste.modele.formes.Cercle;
import fr.eseo.pdlo.projet.artiste.vue.formes.VueCercle;
import fr.eseo.pdlo.projet.artiste.vue.formes.VueForme;

public class OutilCercle extends OutilForme {
	
	protected VueForme creerVueForme() {
		double x = 0;
		double y = 0;
		double diametre =  Math.max(Math.abs(getFin().getAbscisse() - getDebut().getAbscisse()), 
				Math.abs(getFin().getOrdonnee() - getDebut().getOrdonnee()));
		/*
		if (getFin().getAbscisse() > getDebut().getAbscisse())
			x = getDebut().getAbscisse();
		else
			x = getDebut().getAbscisse() - diametre;
		*/
		x = (getFin().getAbscisse() > getDebut().getAbscisse())? getDebut().getAbscisse() : getDebut().getAbscisse() - diametre;
		
		/*
		if (getFin().getOrdonnee() > getDebut().getOrdonnee())
			y = getDebut().getOrdonnee();
		else
			y = getDebut().getOrdonnee() - diametre;
		
		Cercle cercle = new Cercle(new Coordonnees(x, y), diametre);
		
		cercle.setCouleur(this.getPanneauDessin().getCouleurCourante());
		*/
		y = (getFin().getOrdonnee() > getDebut().getOrdonnee())? getDebut().getOrdonnee() :getDebut().getOrdonnee() - diametre;
		Cercle cercle = new Cercle(new Coordonnees(x, y), diametre);
		return new VueCercle(cercle);
	}
	
	
	public void mouseClicked(MouseEvent event) {
		super.mouseClicked(event);
	}

}
