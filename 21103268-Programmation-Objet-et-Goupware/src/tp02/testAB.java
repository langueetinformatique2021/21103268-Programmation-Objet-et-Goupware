package tp02;
import java.util.Scanner;

/** La methode main initialise une variable i à la valeur 1 et execute m fois la methode divise
 * La methode divise a comme parametre la variable i à la premiere iteration et aux iterations suivantes
 * le résultat du précédent appel à la methode divise
 * 
 * @author NgauvAxel
 * @version 0.1 */

public class testAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		
		Scanner keyboard = new Scanner(System.in); //cree un objet keyboard de type scanner permettant d'enregistrer l'entree au clavier
		System.out.println("Entrez un chiffre :");
		int m = keyboard.nextInt();
		keyboard.close();
		
		while (m > 0) {
			i=B.divise(i);
			m--;
			System.out.println(i);
		}
	}

}
