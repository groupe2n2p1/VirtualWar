
public abstract class Action {
	
	private Coordonnees direction;
	private Robot robot;
	
	public Robot getRobot(){
		return robot;
	}
	
	public Coordonnees getDirection(){
		return direction;
	}
	
	public Coordonnees getObjectif(){
		// je ne sais pas
		return null;
	}
	
	public Action(Robot robot, Coordonnees direction){
		this.direction = direction;
		this.robot = robot;
	}
	
	abstract void agit();
	
}
