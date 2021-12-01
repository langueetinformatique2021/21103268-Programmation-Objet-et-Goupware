package tp06;

/** @author NgauvAxel
 *  @version 0.1 */

public class Charrue extends Bronze {
	private String objet;
	private boolean enFonctionnement;
	
	/**Constructeur de la classe Charrue qui fait appel au constructeur de la sur-classe Bronze
	 * @param type indique nom du type de métal (oxydable, inoxydable)
	 * @param etat indique l'état du métal (solide, liquide, gazeux)
	 * @param couleur indique la couleur du métal
	 * @param objet indique le type d'objet (outil, décor, jouet...)
	 */
	public Charrue(String type, String etat) {
		super(type, etat);
		this.objet = "outil";
		this.enFonctionnement = false;
	}
	
	public String getCouleur() {
		return super.getCouleur();
	}
	
	/** décrit des caractéristiques de l'objet */
	public void décrit() {
		System.out.println("Je suis un " + this.objet + " et je suis fait de bois et de métal " + getType() + " de couleur " + getCouleur());
	}
	
	public void setUtilisation(boolean b) {
		this.enFonctionnement = b;
	}

}
