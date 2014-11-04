
public abstract class Cellule {
	 protected int mine = 0;
	 protected int base = 0;
	 private int largeur;
	 private int hauteur;
	 
	 public Cellule(int largeur, int hauteur){
		 this.hauteur = hauteur;
		 this.largeur = largeur;
	 }
	 
	 public int contientMine(){
		return mine;
	 }
	 
	 public int estBase(){
		 return base;
	 }
	 
	 public Coordonnees getCoordonees(){
		 Coordonnees truc = new Coordonnees(largeur, hauteur);
		 return truc;
	 }
	 
	 public Robot getContenu(){
		 // a faire
		 return null;
	 }
	 
	 public String toString(){
		 return ""; // a faire
	 }
	 
	 abstract void deplaceSur(Robot robot);
	 
	 abstract void ajoute(int equipe);
	 
	 abstract void videCase();
	 
}
