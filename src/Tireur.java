import java.util.List;


public class Tireur extends Robot {

	public Tireur(Vue vue, int l, int h, int equipe) {
		super(vue, l, h, equipe);
	}

	public boolean peutTirer() {
		return true;// a faire
	}

	public int getCoutAction() {
		return 2;
	}

	public int getCoutDep() {
		return 1;
	}

	public int getDegatTir() {
		return 3;
	}

	public int getDegatMine() {
		return 3;
	}

	public String getType() {
		return "Tireur";
	}

	public List<Coordonnees> getDeplacements() {
		return null;// a faire
	}

}
