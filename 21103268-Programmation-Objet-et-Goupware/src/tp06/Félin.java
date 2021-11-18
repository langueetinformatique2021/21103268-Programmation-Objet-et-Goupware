package tp06;
/** Cr�ation et gestion de f�lins */
public class F�lin extends Animal {
	// ajout d'attributs propres � la sous-classe
	protected boolean domestique = false;
	
	/** le constructeur de F�lins fait appel au constructeur de la sur-classe Animal */
	public F�lin(String type) { // les f�lins ont 4 pattes
		super(type, 4);
	}
	
	/** pr�sentation des caract�ristiques du f�lin */
	public void pr�sente() {

		//appel de la m�thode de la sur-classe
		super.pr�sente();
		String etat = (domestique) ? "domestique" : "sauvage";
		System.out.println("je suis vraiment un animal " + etat) ;
}
	
	/** cri du f�lin */
	public void crie() {
	System.out.println("je crie donc je suis");
	}
}