
public class CV {

	private String Nom;
	private String Prénom;
	private String Formation;
	private int Expériences; 
	private String [] Compétences; 
	private String Attentes; 

	public CV(String nom, String prénom, String formation, int expériences, String[] compétences, String attentes) {
		super();
		Nom = nom;
		Prénom = prénom;
		Formation = formation;
		Expériences = expériences;
		Compétences = compétences;
		Attentes = attentes;
	}
	public void affiche() {
		
	}
	public class Tests {

		public void main(String[] args) {
			
			System.out.println("\nBienvenue chez Barette!");
			
			CV cv = new CV(Attentes, Attentes, Attentes, Expériences, args, Attentes);
		}
	}
	
}



