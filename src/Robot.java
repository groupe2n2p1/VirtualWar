
public abstract class Robot {
	
	private int energie;
	private int equipe;
	
	public Robot(Vue vue, int l, int h, int equipe){
	
	}
	
	
	abstract public boolean peutTirer(){
		
	}
	
	public boolean estSurBase(){
		
	}
	
	public void setCoordonnees(Coordonnees coordonees){
		
	}
	
	public Coordonnees getCoordonees(){
		
	}
	
	public Vue getVue(){
		
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
	
	abstract public int getCoutAction(){
		
	}
	
	abstract public int getCoutDep(){
		
	}
	
	abstract public int getDegatTir(){
		
	}
	
	abstract public int getDegatMine(){
		
	}
	
	abstract public String getType(){
		
	}
	
	abstract public List<Coordonees> getDeplacements(){
		
	}
	
	public void setVue(Vue vue){
		
	}
	
	public String toString(){
		
	}
	
	public void subitTir(){
		
	}
	
	public void subitMine(){
		
	}
	
}
