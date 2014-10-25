
public class Piegeur extends Robot {

	public Piegeur(Vue vue, int l, int h, int equipe) {
		super(vue, l, h, equipe);
	}

	public boolean peutTirer() {
		return false;
	}

	public int getCoutAction() {
		return 0;
	}

	public int getCoutDep() {
		return 0;
	}

	public int getDegatTir() {
		return 0;
	}

	public int getDegatMine() {
		return 0;
	}

	public String getType() {
		return null;
	}

	public List<Coordonees> getDeplacements() {
		return null;
	}

}
