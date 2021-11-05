package tp04;

/**
 * TP4 Partie 1 EX4 : 
 * Obtenir la médiane des variables p1, p2, p3, p4, p5 dans la variable p6 avec des instructions structurées par des branchements conditionnels
 * 
 * @author NgauvAxel
 * @version 0.1 */


public class Conditionnelle4 {
/* il y a 5 variables donc pour qu'une valeur d'une variable soit mediane, 
 * elle doit être supérieure à deux valeurs et inférieure à deux autres valeurs
 * il va donc falloir vérifier cela pour chacune des variables
*/
	public static void main(String[] args) {
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
		int p6 = 0;
		
		if (((p1 > p2 && p1 > p3) || (p1 > p2 && p1 > p4) || (p1 > p2 && p1 > p5) || (p1 > p3 && p1 > p4) || (p1 > p3 && p1 > p5) || (p1 > p4 && p1 > p5)) && ((p1 < p2 && p1 < p3) || (p1 < p2 && p1 < p4) || (p1 < p2 && p1 < p5) || (p1 < p3 && p1 < p4) || (p1 < p3 && p1 < p5) || (p1 < p4 && p1 < p5))) {
				p6 = p1; 
		}
		if (((p2 > p1 && p2 > p3) || (p2 > p1 && p2 > p4) || (p2 > p1 && p2 > p5) || (p2 > p3 && p2 > p4) || (p2 > p3 && p2 > p5) || (p2 > p4 && p2 > p5)) && ((p2 < p1 && p2 < p3) || (p2 < p1 && p2 < p4) || (p2 < p1 && p2 < p5) || (p2 < p3 && p2 < p4) || (p2 < p3 && p2 < p5) || (p2 < p4 && p2 < p5))) {
				p6 = p2; 
		}
		if (((p3 > p1 && p3 > p2) || (p3 > p1 && p3 > p4) || (p3 > p1 && p3 > p5) || (p3 > p2 && p3 > p4) || (p3 > p2 && p3 > p5) || (p3 > p4 && p3 > p5)) && ((p3 < p1 && p3 < p2) || (p3 < p1 && p3 < p4) || (p3 < p1 && p3 < p5) || (p3 < p2 && p3 < p4) || (p3 < p2 && p3 < p5) || (p3 < p4 && p3 < p5))) {
				p6 = p3; 
		}
		if (((p4 > p1 && p4 > p2) || (p4 > p1 && p4 > p3) || (p4 > p1 && p4 > p5) || (p4 > p2 && p4 > p3) || (p4 > p2 && p4 > p5) || (p4 > p3 && p4 > p5)) && ((p4 < p1 && p4 < p2) || (p4 < p1 && p4 < p3) || (p4 < p1 && p4 < p5) || (p4 < p2 && p4 < p3) || (p4 < p2 && p4 < p5) || (p4 < p3 && p4 < p5))) {
				p6 = p4; 
		}
		if (((p5 > p1 && p5 > p2) || (p5 > p1 && p5 > p3) || (p5 > p1 && p5 > p4) || (p5 > p2 && p5 > p3) || (p5 > p2 && p5 > p4) || (p5 > p3 && p5 > p4)) && ((p5 < p1 && p5 < p2) || (p5 < p1 && p5 < p3) || (p5 < p1 && p5 < p4) || (p5 < p2 && p5 < p3) || (p5 < p2 && p5 < p4) || (p5 < p3 && p5 < p4))) {
			p6 = p5; 
		}
		
		System.out.println(p6);
		
	}
			
}
