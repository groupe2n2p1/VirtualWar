import java.util.List;


public abstract class Robot {
	private Vue vue;
	public Coordonnees coordonnees;
	private int energie;
	private int equipe;
	
	public Robot(Vue vue, int l, int h, int equipe){
		this.vue = vue;
		this.coordonnees = new Coordonnees(l, h);
		this.equipe = equipe;
	}
	
	
	abstract public boolean peutTirer();
	
	public boolean estSurBase(){
		return true;//a changer
	}
	
	public void setCoordonnees(Coordonnees coordonnees){
		this.coordonnees = coordonnees;
	}
	
	public Coordonnees getCoordonees(Coordonnees coordonees){
		return coordonees;
	}
	
	public Vue getVue(Vue vue){
		return vue;
	}
	
	public int getEnergie(){
		return this.energie;
	}
	
	public void setEnergie(int energie){
		this.energie = energie;
	}
	
	public int getEquipe(){
		return this.equipe;
	}
	
	abstract public int getCoutAction();
	
	abstract public int getCoutDep();
	
	abstract public int getDegatTir();
	
	abstract public int getDegatMine();
	
	abstract public String getType();
	
	abstract public List<Coordonnees> getDeplacements(); 	
	
	public void setVue(Vue vue){
		// a faire
	}
	
	public String toString(){
		return ""; // a faire
	}
	
	public void subitTir(Robot robot){
		this.energie = energie - robot.getDegatTir();
	}
	
	public void subitMine(Robot robot){
		this.energie = energie - robot.getDegatMine();
	}
	
}
