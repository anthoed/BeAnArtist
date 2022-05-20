package fr.eseo.pdlo.projet.artiste.modele;
import java.text.DecimalFormat;
import java.util.Objects;


public class Coordonnees {
	public static final double ABSCISSE_PAR_DEFAUT = 10;
	public static final double ORDONNEE_PAR_DEFAUT = 10;
	
	double abscisse;
	double ordonnee;
	
	

	public Coordonnees(double abscisse , double ordonnee)
	{
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
	}

	public Coordonnees()
	{
		this.abscisse=ABSCISSE_PAR_DEFAUT;
		this.ordonnee=ORDONNEE_PAR_DEFAUT;
	}

	public double getOrdonnee()
	{
		return this.ordonnee;
	}
	
	public String getOrdonneeString()
	{
		String ordonne_whith_coma = String.valueOf(this.ordonnee).replace(".", ","); // n'est plus utile grace a Digitalformat
		return ordonne_whith_coma;
	}

	public double getAbscisse()
	{
		return this.abscisse;
	}
	
	public String getAbscisseString()
	{
		String abscisse_whith_coma = String.valueOf(this.abscisse).replace(".", ",");  // n'est plus utile grace a Digitalformat
		return abscisse_whith_coma;
	}
	
	public void setAbscisse(double abscisse)
	{
		this.abscisse = abscisse;
	}
	
	public void setOrdonnee(double ordonnee)
	{
		this.ordonnee= ordonnee;
	}



	public void deplacerVers(double nouvelleAbscisse, double nouvelleOrdonnee)
	{
		this.abscisse = nouvelleAbscisse;
		this.ordonnee =  nouvelleOrdonnee;
	}

	public void deplacerDe(double deltaX, double deltaY)
	{
		this.abscisse = this.abscisse + deltaX;
		this.ordonnee = this.ordonnee + deltaY;
	}

	public double distanceVers(Coordonnees autreCoordonnees)
	{
		double distance = Math.pow(Math.pow((autreCoordonnees.getAbscisse() - this.getAbscisse()),2) + Math.pow((autreCoordonnees.getOrdonnee() - this.getOrdonnee()),2),0.5);
		return distance;
	}

	public double angleVers(Coordonnees autreCoordonnees)

	{
		
		double angle =  Math.atan2((autreCoordonnees.getOrdonnee()-this.getOrdonnee()),(autreCoordonnees.getAbscisse()-this.getAbscisse()));
		return angle;
	}
	
	public double angleVersdeux(Coordonnees autreCoordonnees)
	{
		Coordonnees prime = new Coordonnees (0,-autreCoordonnees.getOrdonnee()); // autreCoordonnees.deplacerDe(0,autreCoordonnees.getOrdonnee());
		double angle =  Math.acos((prime.distanceVers(this))/(autreCoordonnees.distanceVers(this)));
		return angle;
	}


	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.0#");
		return "(" +df.format(getAbscisse()) + " , " + df.format(getOrdonnee()) + ")";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordonnees other = (Coordonnees) obj;
		return Double.doubleToLongBits(abscisse) == Double.doubleToLongBits(other.abscisse)
				&& Double.doubleToLongBits(ordonnee) == Double.doubleToLongBits(other.ordonnee);
	}
	

}
