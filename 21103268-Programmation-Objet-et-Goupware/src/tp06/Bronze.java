package tp06;

/** @author NgauvAxel
 *  @version 0.1 */

public class Bronze extends Metal {
	private String couleur;
	
	/**Constructeur de la classe Bronze qui fait appel au constructeur de la sur-classe Metal
	 * @param type indique nom du type de m�tal (oxydable, inoxydable)
	 * @param etat indique l'�tat du m�tal (solide, liquide, gazeux)
	 * @param couleur indique la couleur du m�tal
	 */
	public Bronze(String type, String etat) {
		super(type, etat);
		this.couleur = "marron";
	}
	
	/** pr�sentation des caract�ristiques du m�tal */
	public void pr�sente() {
		//appel de la m�thode de la super classe
		super.pr�sente();
		System.out.println("Je suis �galement de couleur " + this.couleur);
	}
	
	/** peindre */
	public void changementCouleur(String nouvelleCouleur) {
		this.couleur = nouvelleCouleur;
	}
	
	public String getType() {
		return super.getType();
	}
	public String getCouleur() {
		return this.couleur;
	}
}

