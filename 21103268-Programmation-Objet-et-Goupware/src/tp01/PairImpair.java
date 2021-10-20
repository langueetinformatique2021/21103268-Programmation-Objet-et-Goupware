package tp01;

/** Gestion de la parite d'un nombre entier 
 * 
 * @author montacie
 * @version 0.1 */

public class PairImpair {

	/* méthode de test des parites */
	public static void main(String[] args) {
	  System.out.println(pair(11));
	  System.out.println(pair(10));
	  System.out.println(impair(11));
	  System.out.println(impair(10));
	}
	
	/** test d'imparite
	 * 
	 * @param val entier
	 * @return true si l'entier val est impair false sinon
	 */
	public static boolean impair(int val) {
		return (!pair(val));
	}
	
	/** test de parite
	 * 
	 * @param val entier
	 * @return true si l'entie val est pair false sinon
	 */
	
	public static boolean pair(int val) {
		if ((val % 2) == 0) return true;
		else return false;
	}

}
