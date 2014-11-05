import java.util.ArrayList;

public class Base extends Cellule {

	private ArrayList<Robot> list;

	public Base(int largeur, int hauteur) {
		super(largeur, hauteur);
		this.list = new ArrayList<Robot>();
	}

	public void ajoutRobot(Robot r) {
		list.add(r);
	}

	public void deplaceSur(Robot robot) {
		robot.setCoordonnees(new Coordonnees(getLargeur(), getHauteur()));
	}

	public void ajoute(int equipe) {
		
	}

	public void videCase() {
		this.videContenu();
		this.videMine();
	}

}
