package fr.eseo.pdlo.projet.artiste.controleur.outils;

import fr.eseo.pdlo.projet.artiste.modele.formes.Ligne;
import fr.eseo.pdlo.projet.artiste.modele.formes.Ellipse;
import fr.eseo.pdlo.projet.artiste.vue.formes.VueForme;
import fr.eseo.pdlo.projet.artiste.vue.formes.VueLigne;

import fr.eseo.pdlo.projet.artiste.vue.formes.VueEllipse;
import fr.eseo.pdlo.projet.artiste.modele.*;


public class OutilEllipse extends OutilForme {
	Coordonnees coord1;
	Coordonnees coord2;
	
	protected VueForme creerVueForme()
	{
		calculeCoordonnees();
		Ellipse ellipse = new Ellipse(coord1, coord2.getAbscisse()-coord1.getAbscisse(), coord2.getOrdonnee()-coord1.getOrdonnee());
		ellipse.setCouleur(this.getPanneauDessin().getCouleurCourante());
		return new VueEllipse(ellipse);
		//Coordonne getCadreminx  et getCcadreminy  puis apres  getDebut
		//deuxiemme coorodenne getCadremaxX et get CadreMaxY puis getFin()
	}
	
	void calculeCoordonnees() {
		double x1 = getDebut().getAbscisse();
		double y1 = getDebut().getOrdonnee();
		double x2 = getFin().getAbscisse();
		double y2 = getFin().getOrdonnee();
		
		coord1 = new Coordonnees(Math.min(x1, x2), Math.min(y1, y2));
		coord2 = new Coordonnees(Math.max(x1, x2), Math.max(y1, y2));
	}

}
