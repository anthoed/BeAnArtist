package fr.eseo.pdlo.projet.artiste.controleur.outils;

import fr.eseo.pdlo.projet.artiste.controleur.actions.ActionSelectionner;
import fr.eseo.pdlo.projet.artiste.modele.formes.*;
import fr.eseo.pdlo.projet.artiste.vue.formes.VueForme;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;


public class OutilSelectionner extends Outil{
	
	private Forme formeSelectionnee;
	
	
	
	public void mouseClicked(MouseEvent event)
	{
		
			boolean detect = false;
			for(VueForme vueForme : super.getPanneauDessin().getVueFormes()) {
				if (vueForme.getForme().contient(getDebut())) {
					formeSelectionnee = vueForme.getForme();
					detect = true;
				}
			}
			
			if (detect) {
				JOptionPane.showConfirmDialog(super.getPanneauDessin(), (Object) formeSelectionnee.toString()
						, ActionSelectionner.NOM_ACTION, JOptionPane.INFORMATION_MESSAGE);
			}
			
		
			
			
			
		
		
	}

}
