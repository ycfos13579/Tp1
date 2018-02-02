import java.util.ArrayList;

public class CV {

	private String nom;
	private String prenom;
	private String formation;
	private int experiences; 
	private String [] competences; 
	private String attentes; 

	public CV(String nom, String prenom, String formation, int experiences, String[] competences, String attentes) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.formation = formation;
		this.experiences = experiences;
		this.competences = competences;
		this.attentes = attentes;
	}
	public void affiche() {
		
		String competenceAjust ="" ;
		
		for (int i = 0; i < competences.length; i++) {
			competenceAjust += competences[i];
			if (i == competences.length-1) {
				competenceAjust +=". ";
			}else {
				competenceAjust +=", ";
			}
		}
		System.out.println("Nom: " + nom + "\nPrénom: "+ prenom +"\nFormation: " + formation + "\nExpériences: "+ experiences+ "\nCompétences:" + competenceAjust + "\nAttentes:" + attentes);
	}	

	public static void main(String[] args) {
		
		System.out.println("\nBienvenue chez Barette!");
		
		CV cv1 = new CV("Bokari", "Oussama Youcef", "Programation", 01, new String [] {"Java", "C#", "Html"}, "Réussir");
	
		CV cv2 = new CV("Fofana", "Justin", "Programation", 01, new String [] {"Java", "C#", "Html"}, "Réussir");
		
		CV cv3 = new CV("Bokari", "Oussama Youcef", "Programation", 01, new String [] {"Java", "C#", "Html"}, "Réussir");
		
		ArrayList<CV> equipe = new ArrayList<CV>(); 
		
		equipe.add(cv1);
		equipe.add(cv2);
		equipe.add(cv3);	
		
		for (int i = 0; i < equipe.size(); i++) {
			equipe.get(i).affiche();
		}
	}
}




