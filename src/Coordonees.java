
public class Coordonees {
	private int largeur;
	private int hauteur;
	
	public Coordonees(int largeur, int hauteur){
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
	
	public Coordonees ajout(Coordonees coordonees){
		
	}
}
