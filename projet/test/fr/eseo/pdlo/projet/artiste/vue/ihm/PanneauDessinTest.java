package fr.eseo.pdlo.projet.artiste.vue.ihm;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class PanneauDessinTest {

	
	
	public PanneauDessinTest(){
		testConstructeurParDefaut();
		testConstructeur();
	}
	
	
	private void testConstructeurParDefaut(){
		JFrame fenetre = new JFrame("Etre un Artiste");
		//PanneauDessin panneau = new PanneauDessin();
		
		PanneauDessin panneau = new PanneauDessin();
		fenetre.setLocationRelativeTo(null);
		//fenetre.setContentPane(panneau);
		fenetre.add(panneau);
		fenetre.pack();
		fenetre.setVisible(true);
		/*
		fenetre.add(new PanneauDessin());
		fenetre.pack();
		fenetre.setVisible(true);
		fenetre.setLocationRelativeTo(null);
		*/
		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void testConstructeur(){
		JFrame fenetre = new JFrame("Blues du Businessman");
		
		Color fond = new Color(255,255,000);
		PanneauDessin panneau = new PanneauDessin(588, 584,fond);
		//fenetre.setContentPane(panneau);
		fenetre.add(panneau);
		fenetre.pack();
		fenetre.setLocationRelativeTo(null);
		fenetre.setVisible(true);
	
		
		/*fenetre.add(new PanneauDessin(600,360, new Color(150,255,255)));
		fenetre.pack();
		fenetre.setVisible(true);
		fenetre.setLocationRelativeTo(null);
		*/
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
	public static void main(String[] args)
	{
		
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run(){
				new PanneauDessinTest();
			}
		});
	
			//new PanneauDessin();
		
	
	}
	

}
