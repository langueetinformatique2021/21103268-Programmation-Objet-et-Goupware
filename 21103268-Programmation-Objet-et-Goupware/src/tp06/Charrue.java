package tp06;

/** @author NgauvAxel
 *  @version 0.1 */

public class Charrue extends Bronze {
	private String objet;
	private boolean enFonctionnement;
	
	/**Constructeur de la classe Charrue qui fait appel au constructeur de la sur-classe Bronze
	 * @param type indique nom du type de m�tal (oxydable, inoxydable)
	 * @param etat indique l'�tat du m�tal (solide, liquide, gazeux)
	 * @param couleur indique la couleur du m�tal
	 * @param objet indique le type d'objet (outil, d�cor, jouet...)
	 */
	public Charrue(String type, String etat) {
		super(type, etat);
		this.objet = "outil";
		this.enFonctionnement = false;
	}
	
	public String getCouleur() {
		return super.getCouleur();
	}
	
	/** d�crit des caract�ristiques de l'objet */
	public void d�crit() {
		System.out.println("Je suis un " + this.objet + " et je suis fait de bois et de m�tal " + getType() + " de couleur " + getCouleur());
	}
	
	public void setUtilisation(boolean b) {
		this.enFonctionnement = b;
	}

}
