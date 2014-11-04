import java.util.List;


public class Piegeur extends Robot {

	public Piegeur(Vue vue, int l, int h, int equipe) {
		super(vue, l, h, equipe);
	}

	public boolean peutTirer() {
		return true;// a faire
	}

	public int getCoutAction() {
		return 2;
	}

	public int getCoutDep() {
		return 2;
	}

	public int getDegatTir() {
		return 2;
	}

	public int getDegatMine() {
		return 2;
	}

	public String getType() {
		return "piegeur";
	}

	public List<Coordonnees> getDeplacements() {
		return null;// a faire
	}

}
