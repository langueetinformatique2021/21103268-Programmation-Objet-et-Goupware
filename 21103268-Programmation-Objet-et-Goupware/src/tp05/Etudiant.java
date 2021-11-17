package tp05;

/** @author NgauvAxel
 *  @version 0.1 */

public class Etudiant {
	
	/**Attributs de la classe Etudiant
	 * Un etudiant a pour caracteristiques des chaines de caracteres (nom, prenom, cours, ufr)
	 * mais aussi un entier (numero etudiant) et un booleen (boursier ou pas)
	 */
	private final String nom, prenom;
	private final int numEtudiant;
	public String [] cours;
	public String ufr;
	private boolean boursier;
	
	/** Constructeur
	 *  @param nom, prenom, num, nbCours, ufr, boursier */
	public Etudiant (String nom, String prenom, int num, int nbCours, String ufr, boolean boursier) {
		this.nom = nom;
		this.prenom = prenom;
		this.numEtudiant = num;
		this.cours = new String [nbCours];
		for (int i=0 ; i<this.cours.length ; i++) {
			this.cours[i] = "";
		}
		this.ufr = ufr;
		this.boursier = boursier;
	}
	
	/**Accesseur qui permet d'obtenir le nom de l'objet courant
	 * @return le nom de l'etudiant (String)
	 */
	public String getNom() {
		return this.nom;
	}
	/**Accesseur qui permet d'obtenir le prenom de l'objet courant
	 * @return le prenom de l'etudiant (String)
	 */
	public String getPrenom() {
		return this.prenom;
	}
	/**Accesseur qui permet d'obtenir le numero d'etudiant de l'objet courant
	 * @return le numero d'etudiant de l'etudiant (int)
	 */
	public int getNum() {
		return this.numEtudiant;
	}
	/**Accesseur qui permet d'obtenir le statut (boursier ou non) de l'etudiant courant
	 * @return un boolean selon s'il est boursier ou non
	 */
	public boolean getBoursier() {
		return this.boursier;
	}
	/**Modificateur qui permet de changer le statut boursier de l'objet courant
	 * @param boursier qui indique si l'etudiant courant est boursier ou non
	 */
	public void setBourse(boolean boursier) {
		this.boursier = boursier;
	}
	
	/**Parcours le tableau de cours de l'etudiant courant
	 * Et ajoute le cours donne en parametre 
	 * Au premier emplacement libre du tableau
	 * S'il n'est pas deja present et qu'il reste de la place
	 * @param le cours a ajouter (String)
	 */
	public void ajoutCours (String cours) {
		boolean b = false;
		int x = 0;
		for (int i=0 ; i<this.cours.length ; i++) {
			if (this.cours[i].equals("") && (x == 0)) {
				x = i;
			}
			if (this.cours[i].equals(cours)) {
				b = true;
				System.out.println("Impossible d'ajouter ce cours dans lequel l'etudiant est deja inscrit...");
			}
		}
		if (b = false) {
			this.cours[x] = cours;
		}
	}
}
