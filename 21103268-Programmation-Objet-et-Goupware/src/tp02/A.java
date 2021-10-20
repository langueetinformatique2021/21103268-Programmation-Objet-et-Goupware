package tp02;

/** @author NgauvAxel
 * @version 0.1 */

public class A {
	
	/** methode treize
	 * 
	 * @param n entier
	 * @return true si n divisible par 13 sinon false
	 */	
	public static boolean treize (int n) {
		if (n%13==0) {
			//System.out.println("oui");
			return true;
		}else {
			//System.out.println("non");
			return false;
		}
	}
	/*
	public static void main (String[]args) {
		treize(13);
	}
	*/
}

