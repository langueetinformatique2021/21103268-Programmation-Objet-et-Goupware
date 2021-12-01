package tp06;

/** @author NgauvAxel
 *  @version 0.1 */

public class Bronze extends Metal {
	private String couleur;
	
	/**Constructeur de la classe Bronze qui fait appel au constructeur de la sur-classe Metal
	 * @param type indique nom du type de métal (oxydable, inoxydable)
	 * @param etat indique l'état du métal (solide, liquide, gazeux)
	 * @param couleur indique la couleur du métal
	 */
	public Bronze(String type, String etat) {
		super(type, etat);
		this.couleur = "marron";
	}
	
	/** présentation des caractéristiques du métal */
	public void présente() {
		//appel de la méthode de la super classe
		super.présente();
		System.out.println("Je suis également de couleur " + this.couleur);
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

