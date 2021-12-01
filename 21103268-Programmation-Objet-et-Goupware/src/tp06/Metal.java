package tp06;

/** @author NgauvAxel
 * @version 0.1
 * Création et gestion de métaux*/
public abstract class Metal {
	private String typeMetal;
	private String etat;
	
	/** création d'une nouvelle instance de la classe Métal
	 * @param type indique le nom du type de métal (oxydable, inoxydable)
	 * @param etat indique l'état du métal (solide, liquide, gazeux)
	 */
	public Metal (String type, String etat) {
		typeMetal = type;
		this.etat = etat;
	}
	
	/** présentation des caractéristiques du métal */
	public void présente() {
		System.out.println("je suis un métal " + typeMetal + " et je suis " + this.etat);
	}
	
	/** changement d'état du métal */
	public void changementEtat(String nouvelEtat) {
		this.etat = nouvelEtat;
	}
	
	public String getType() {
		return this.typeMetal;
	}
	
}
