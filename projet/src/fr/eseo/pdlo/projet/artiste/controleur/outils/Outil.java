package fr.eseo.pdlo.projet.artiste.controleur.outils;
import fr.eseo.pdlo.projet.artiste.modele.*;
import fr.eseo.pdlo.projet.artiste.vue.ihm.*;

import javax.swing.event.MouseInputListener;
import java.awt.event.MouseEvent;

public abstract class Outil implements MouseInputListener {
	
	
	private Coordonnees debut;
	private Coordonnees fin;
	private PanneauDessin panneauDessin;
	
	public Coordonnees getDebut()
	{
		return this.debut;
	}
	
	public void setDebut(Coordonnees debut)
	{
		this.debut = debut;
	}
	
	public Coordonnees getFin()
	{
		return this.fin;
	}
	
	public void setFin(Coordonnees fin)
	{
		this.fin = fin;
	}
	
	
	public PanneauDessin getPanneauDessin()
	{
		return this.panneauDessin;
	}
	
	public void setPanneauDessin(PanneauDessin panneauDessin)
	{
		this.panneauDessin = panneauDessin;
	}
	
	public void mouseClicked(MouseEvent event)
	{
		
	}
	
	public void mouseDragged(MouseEvent event)
	{
		
	}
	public void mouseEntered(MouseEvent event )
	{
		
	}
	public void mouseExited(MouseEvent event)
	{
		
	}
	public void mouseMoved(MouseEvent event )
	{
		
	}
	public void mousePressed(MouseEvent event )
	{
		//this.debut =new Coordonnees(event.getPoint().getX(),event.getPoint().getY());  // les deux méthodes marche
		this.setDebut(new Coordonnees(event.getX(),event.getY()));
	}
	public void mouseReleased(MouseEvent event ) 
	{
		this.fin = new Coordonnees(event.getPoint().getX(),event.getPoint().getY());
	}
}
