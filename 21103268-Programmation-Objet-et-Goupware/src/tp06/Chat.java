package tp06;

public class Chat extends F�lin implements Domesticable {
	
	String nom;
	
	public Chat() {
		super("chat");
		
	}
	
	public void domestiquer(String nom) {
		domestique = true; 
		this.nom = nom; // this.nom c'est l'attribut nom

	}

	
	public String nom() {
		return nom;
	}
	
	public void pr�sente() {
		super.pr�sente();
		if (domestique == true)
			System.out.print("Je m'appelle " + nom());
	}
	
	public void crie() {
		if (domestique == true)
			System.out.print("Miaou ! Je miaule donc je suis !");
		else
			super.crie();
	}

}