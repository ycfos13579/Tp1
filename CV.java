
public class CV {

	private String Nom;
	private String Pr�nom;
	private String Formation;
	private int Exp�riences; 
	private String [] Comp�tences; 
	private String Attentes; 

	public CV(String nom, String pr�nom, String formation, int exp�riences, String[] comp�tences, String attentes) {
		super();
		Nom = nom;
		Pr�nom = pr�nom;
		Formation = formation;
		Exp�riences = exp�riences;
		Comp�tences = comp�tences;
		Attentes = attentes;
	}
	public void affiche() {
		
	}
	public class Tests {

		public void main(String[] args) {
			
			System.out.println("\nBienvenue chez Barette!");
			
			CV cv = new CV(Attentes, Attentes, Attentes, Exp�riences, args, Attentes);
		}
	}
	
}



