package tp08;

/** @author NgauvAxel
 *  @version 0.1 */

import java.util.Random;

public class testBataille {
	public static void main(String[] args) {

		int n= 0;
		
		try {
			while (true) {
				int c1 = getCarte();
				int c2 = getCarte();
				manche(c1, c2);
				n++;
				if (c1 > c2) {
					System.out.println("Le joueur 1 gagne : " + c1 + " est supérieur à " + c2);
				}
				if (c1 < c2) {
					System.out.println("Le joueur 2 gagne : " + c1 + " est inférieur à " + c2);
				}
			}
		}
			catch (Bataille a) {
				System.out.println("Bataille après " + n + " manche");
				System.out.println("Valet a pour valeur 11");
				System.out.println("Reine a pour valeur 12");
				System.out.println("Roi a pour valeur 13");
				System.out.println("As a pour valeur 14");
			}
		}
		public static void manche(int carteJ1, int carteJ2) throws Bataille {
			if(carteJ1==carteJ2) {
				throw new Bataille();
			}
		}
		public static int getCarte() {
			// "Valet" a pour valeur 11
			// "Reine" a pour valeur 12
			// "Roi" a pour valeur 13
			// "As" a pour valeur 14
			// cartes est une liste triee des valeurs possibles des cartes du jeu
			int cartes[] = {2,3,4,5,6,7,8,9,10,11,12,13,14};
			Random h = new Random();
			//pour tirer une carte entre le 2 et l'As
			int valeur = h.nextInt(cartes.length-1);
			return cartes[valeur];
		}


}
