package fr.eseo.pdlo.projet.artiste.vue.ihm;
import fr.eseo.pdlo.projet.artiste.vue.formes.*;
import fr.eseo.pdlo.projet.artiste.controleur.outils.*;
import fr.eseo.pdlo.projet.artiste.modele.formes.Forme;


import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import java.util.*;

import java.util.ArrayList;
import java.util.List;


public class PanneauDessin extends JPanel {
	public static final int LARGEUR_PAR_DEFAUT = 500;
	public static final int HAUTEUR_PAR_DEFAUT =700;
	public static final java.awt.Color COULEUR_FOND_PAR_DEFAUT = new Color(255,255,000);
	
	private final List<VueForme> vueFormes;	
	
	private Outil outilCourant;
	private Color couleurCourante;
	
	
	public PanneauDessin()
	{
		/*
		JFrame fenetre = new JFrame("hello");
		fenetre.setSize(LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
		
		JPanel panneau = new JPanel();
		fenetre.setContentPane(panneau);
		fenetre.setVisible(true);
		panneau.setBackground(COULEUR_FOND_PAR_DEFAUT);
	
		*/
		
		 super();
	      super.setPreferredSize(new Dimension(LARGEUR_PAR_DEFAUT,HAUTEUR_PAR_DEFAUT));
	      super.setBackground(COULEUR_FOND_PAR_DEFAUT);
	      this.vueFormes =  new ArrayList<>();
	      this.setCouleurCourante(Forme.COULEUR_PAR_DEFAUT);
		
		
	}
	
	public PanneauDessin(int largeur, int hauteur, java.awt.Color fond)
	{
		/*
		JFrame fenetre = new JFrame("hello2");
		fenetre.setSize(largeur, hauteur);
		
		JPanel panneau = new JPanel();
		fenetre.setContentPane(panneau);
		fenetre.setVisible(true);
		panneau.setBackground(fond);
		
		*/
		
		super();
	      super.setPreferredSize(new Dimension(largeur, hauteur));
	      super.setBackground(fond);
	      this.vueFormes =  new ArrayList<>();
	      this.setCouleurCourante(Forme.COULEUR_PAR_DEFAUT);
	}
	
	//ACCESSEUR ET MUTATEUR
	
	public List<VueForme> getVueFormes()
	{
		return this.vueFormes;
	}
	
	public Outil getOutilCourant() 
	{
		return this.outilCourant;
	}
	
	private void setOutilCourant(Outil outil) 
	{
		this.outilCourant = outil;
	}
	
	public void ajouterVueForme (VueForme vueForme) 
	{
		vueFormes.add(vueForme);
	}
	
	public Color getCouleurCourante()
	{
		return this.couleurCourante;
	}
	
	public void setCouleurCourante(Color couleur)
	{
		this.couleurCourante = couleur;
	}
	
	//METHODES
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		/* Le paramètre g de la méthode paint est converti//
		* en un Graphics2D grâce à un transtypage (cast)
		* explicite
		*/
		
		Graphics2D g2D = (Graphics2D)g.create();
		/* On utililse l'instance de Graphics2D*/
		 
		
		for (VueForme vueForme : this.getVueFormes())  //parcour toutes les formes
		vueForme.affiche(g2D);
		/* Enfin on libère la memoire utilisé par
		* l'instance de Graphics2D
		*/
		g2D.dispose();
	}
	
	public void associerOutil(Outil outil)
	{
		//this.outilCourant = outil;
		if (outil != null) {
			if (this.getOutilCourant() != null)
				
				this.dissocierOutil();
				this.setOutilCourant(outil);
				this.getOutilCourant().setPanneauDessin(this);
				this.addMouseListener(outil);                               //active la detection d'appuie
				this.addMouseMotionListener(outil);                         //active la detection de mouvement
		}	
	}
	
	public void dissocierOutil()
	{
		if(this.getOutilCourant() != null)
			this.getOutilCourant().setPanneauDessin(null);
			this.removeMouseListener(this.getOutilCourant());            //désactive la detection d'appuie
			this.removeMouseMotionListener(this.getOutilCourant());		 //désactive la detection de mouvement
			this.setOutilCourant(null);
	}

}
