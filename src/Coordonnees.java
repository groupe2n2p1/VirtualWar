
public class Coordonnees {
	private int largeur;
	private int hauteur;
	
	public Coordonnees(int largeur, int hauteur){
		this.hauteur = hauteur;
		this.largeur = largeur;
	}
	
	public int getLargeur(){
		return this.largeur;
	}
	
	public int getHauteur(){
		return this.hauteur;
	}
	
	public String toString(){
		return "hauteur: " + hauteur + " largeur: " + largeur;
	}
	
	public Coordonnees ajout(Coordonnees coordonnees){
		return coordonnees;		
	}
}
