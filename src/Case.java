public class Case extends Cellule {

	public Case(int largeur, int hauteur) {
		super(largeur, hauteur);
	}

	void deplaceSur(Robot robot) {
		robot.setCoordonnees(new Coordonnees(super.getLargeur(), super.getHauteur()));
	}

	void ajoute(int equipe) {
		
	}

	void videCase() {
		super.videContenu();
		super.videMine();
	}

}
