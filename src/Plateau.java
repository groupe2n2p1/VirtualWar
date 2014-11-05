public class Plateau {
	int hauteur, largeur;
	Cellule[][] plateau;

	public Plateau() {
		this.hauteur = 10;
		this.largeur = 10;
		plateau = new Cellule[hauteur][largeur];
	}
		
}
