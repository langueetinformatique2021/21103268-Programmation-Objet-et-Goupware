package tp05;

/** @author NgauvAxel
 * @version 0.1 */

public class Promotion {
	
	/**Attributs de la classe Promotion
	 * Une promotion a pour caracteristiques un tableau d'etudiants, 
	 * Une capacite maximale (int) 
	 * Et un nombre d'etudiants (int)
	 */
	public Etudiant [] etudiants;
	public final int capacite; //capacite d'accueil de la promotion
	public int nbEtudiants;
	
	/** Constructeur
	 *  @param nb */
	public Promotion (int nb) {
		this.capacite = nb;
		this.nbEtudiants = 0;
		this.etudiants = new Etudiant [nb];

	}
	
	/**Parcours le tableau d'etudiant de la promotion courante
	 * Et l'ajoute s'il n'est pas deja inscrit  
	 * Et qu'il reste encore de la place pour une nouvelle inscription
	 * @param le cours a ajouter (String)
	 */
	public void inscription (Etudiant e) {
		if ((this.nbEtudiants < this.capacite) && (chercheEtudiantNum(e.getNum()) == false)) {
			this.etudiants[nbEtudiants] = e;
			this.nbEtudiants ++;
		}else {
			System.out.println("Inscription d'un nouvel etudiant impossible : capacite maximale atteinte...");
		}
		
	}
	
	/**Parcours le tableau d'etudiant de la promotion courante
	 * Et calcule le nombre d'etudiants appartenant a une ufr donnee
	 * @param l'ufr qui nous interesse (String)
	 * @return le nombre d'etudiant de la promotion courante appartenant a cette ufr 
	 */
	public int nbEtuUfr (String ufr) {
		int n = 0;
		for (int i = 0 ; i<etudiants.length ; i++) {
			if (this.etudiants[i].ufr.equals(ufr)) {
				n++;
			}
		}
		return n;
	}
	
	/**Parcours le tableau d'etudiant de la promotion courante
	 * Et verifie si un etudiant avec un numero d'etudiant donne y est inscrit
	 * @param le numero etudiant de l'etudiant (int)
	 * @return un boolean qui indique si ce numero d'etudiant a ete trouve dans la promotion courante
	 */
	public boolean chercheEtudiantNum (int numEtudiant) {
		for (int i = 0 ; i<etudiants.length ; i++) {
			if (this.etudiants[i].getNum() == (numEtudiant)) {
				return true;
			}
		}
		return false;
	}
	/**Parcours le tableau d'etudiant de la promotion courante
	 * Et verifie si un etudiant avec un nom donne donne y est inscrit
	 * @param le nom de l'etudiant (String)
	 * @return un boolean qui indique si ce nom d'etudiant a ete trouve dans la promotion courante
	 */
	public boolean chercheEtudiantNom (String nom) {
		for (int i = 0 ; i<etudiants.length ; i++) {
			if (this.etudiants[i].getNom().equals(nom)) {
				return true;
			}
		}
		return false;
	}
	/**Parcours le tableau d'etudiant de la promotion courante
	 * Et verifie si un etudiant avec un prenom donne y est inscrit
	 * @param le prenom de l'etudiant (String)
	 * @return un boolean qui indique si ce prenom d'etudiant a ete trouve dans la promotion courante
	 */
	public boolean chercheEtudiantPrenom (String prenom) {
		for (int i = 0 ; i<etudiants.length ; i++) {
			if (this.etudiants[i].getPrenom().equals(prenom)) {
				return true;
			}
		}
		return false;
	}
	
	/**Parcours le tableau d'etudiant de la promotion courante
	 * Et calcule le nombre d'etudiant boursier 
	 * @return le nombre d'etudiant boursier de la promotion courante (int)
	 */
	public int nbEtuBoursier () {
		int n = 0;
		for (int i = 0 ; i<etudiants.length ; i++) {
			if (this.etudiants[i].getBoursier() == true) {
				n++;
			}
		}
		return n;
	}
}
