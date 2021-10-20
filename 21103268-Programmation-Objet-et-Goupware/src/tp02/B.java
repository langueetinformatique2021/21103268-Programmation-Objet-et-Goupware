package tp02;

/** @author NgauvAxel
 * @version 0.1 */

public class B {
	
	/** methode divise
	 * 
	 * @param n entier
	 * @return n/2 si n divisible par 13 sinon n+2
	 */	
	public static int divise (int n) {
		if (A.treize(n)) { //methode treize de la classe publique A
			//System.out.println("oui");
			return n/2;
		}
		else { 
			//System.out.println("non");
			return n + 2;
		}
	}
	/*
	public static void main (String[]args) {
		divise(13);
	}
	*/
}


