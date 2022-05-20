package fr.eseo.pdlo.projet.artiste.controleur.actions;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;

@SuppressWarnings("serial")
public class ActionEffacer extends AbstractAction{
	
	public static final String NOM_ACTION ="Effacer dessin";
	
	private PanneauDessin panneauDessin ;
	
	public ActionEffacer(PanneauDessin panneauDessin)
	{
		super(NOM_ACTION);
		this.panneauDessin = panneauDessin;
	}
	
	public void actionPerformed(ActionEvent event)
	{
		int n = JOptionPane.showConfirmDialog(
			    panneauDessin,
			    "Voulez-vous vraiment effacer",
			    "Effacer dessin",
			    JOptionPane.YES_NO_OPTION);
		
		if (n == 0)
		{
			this.panneauDessin.getVueFormes().clear();
			this.panneauDessin.repaint();
		}
	}

}
