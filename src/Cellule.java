public abstract class Cellule {
	protected int mine = 0;
	protected int base = 0;
	private int largeur;
	private int hauteur;
	private String image;
	private Robot r;

	public Cellule(int largeur, int hauteur) {
		this.hauteur = hauteur;
		this.largeur = largeur;
	}

	public int contientMine() {
		return mine;
	}
	
	public void videMine(){
		mine = 0;
	}

	public int estBase() {
		return base;
	}

	public Coordonnees getCoordonees() {
		Coordonnees truc = new Coordonnees(largeur, hauteur);
		return truc;
	}

	public Robot getContenu() {
		return r;
	}
	
	public void videContenu(){
		r = null;
	}

	public String toString() {
		return image; 
	}

	abstract void deplaceSur(Robot robot);

	abstract void ajoute(int equipe);

	abstract void videCase();

	public int getLargeur() {
		return this.largeur;
	}

	public int getHauteur() {
		return this.hauteur;
	}

}
