public class Plateau {
	int hauteur, largeur;
	Cellule[][] plateau;

	public Plateau() {
		this.hauteur = 10;
		this.largeur = 10;
		plateau = new Cellule[hauteur][largeur];
	}

	public int getHauteur() {
		return hauteur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void addRobot(Robot r, int equipe) {
		r.setCoordonnees(new Coordonnees(0, 0));
	}

}
