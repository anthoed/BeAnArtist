package fr.eseo.pdlo.projet.artiste.vue.ihm;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;

public class PanneauBarreEtat extends JPanel implements MouseMotionListener {

	private JLabel valeurX;
	private JLabel valeurY;
	private PanneauDessin panneauDessin;
	
	// CONSTRUCTEUR //
	public PanneauBarreEtat(PanneauDessin panneauDessin) 
	{
		this.panneauDessin = panneauDessin;
		
		this.valeurX = new JLabel("x: "+0);
		this.valeurY = new JLabel("y: "+0);
		
		this.add(valeurX);
		this.add(valeurY);
		
		this.panneauDessin.addMouseMotionListener(this);
		this.panneauDessin.setLayout(new FlowLayout());
	}

	// METHODES //
	
	public void mouseDragged(MouseEvent event) 
	{
		double x1 = event.getX();
		double y2 = event.getY();
		
		mettreAJourAffichage(new Coordonnees(x1,y2));
	}

	@Override
	public void mouseMoved(MouseEvent event) 
	{
		double x1 = event.getX();
		double y2 = event.getY();
		
		mettreAJourAffichage(new Coordonnees(x1,y2));
	}
	
	private void mettreAJourAffichage(Coordonnees coords) 
	{
		valeurX.setText("x: "+ coords.getAbscisse());
		valeurY.setText("y: "+ coords.getOrdonnee());
	}

	

}
