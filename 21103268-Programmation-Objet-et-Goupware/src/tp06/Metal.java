package tp06;

/** @author NgauvAxel
 * @version 0.1
 * Cr�ation et gestion de m�taux*/
public abstract class Metal {
	private String typeMetal;
	private String etat;
	
	/** cr�ation d'une nouvelle instance de la classe M�tal
	 * @param type indique le nom du type de m�tal (oxydable, inoxydable)
	 * @param etat indique l'�tat du m�tal (solide, liquide, gazeux)
	 */
	public Metal (String type, String etat) {
		typeMetal = type;
		this.etat = etat;
	}
	
	/** pr�sentation des caract�ristiques du m�tal */
	public void pr�sente() {
		System.out.println("je suis un m�tal " + typeMetal + " et je suis " + this.etat);
	}
	
	/** changement d'�tat du m�tal */
	public void changementEtat(String nouvelEtat) {
		this.etat = nouvelEtat;
	}
	
	public String getType() {
		return this.typeMetal;
	}
	
}
