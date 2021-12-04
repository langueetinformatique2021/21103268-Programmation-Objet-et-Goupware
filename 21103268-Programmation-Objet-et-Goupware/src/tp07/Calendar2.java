package tp07;

/** @author NgauvAxel
 *  @version 0.1 */

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Calendar2 extends GregorianCalendar {
	/**Atributs de la classe Calendar2
	 * attribut cours de type boolean qui contient vrai si l'objet est crée durant le cours (jeudi entre 9h30 et 12h)
	 * attribut secondeCreation de type int qui correspond à la seconde de la creation de l'objet*/
	public boolean cours;
	public int secondeCreation; 
	
	public Calendar2() {
		String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);
		if (ids.length == 0)
		     System.exit(0);
		SimpleTimeZone pdt = new SimpleTimeZone(-8 * 60 * 60 * 1000, ids[0]);
		Calendar calendar = new GregorianCalendar(pdt);
		Date trialTime = new Date();
		calendar.setTime(trialTime);
		this.secondeCreation = calendar.get(Calendar.SECOND);
		if (calendar.get(Calendar.DAY_OF_WEEK) == 4 && ((calendar.get(Calendar.HOUR) >= 9) && calendar.get(Calendar.MINUTE) >= 30 && calendar.get(Calendar.HOUR) < 12) && calendar.get(Calendar.AM_PM) == 0) {
			this.cours = true;
		}
		else {
			this.cours = false;
		}
		
	}
	/**Affiche la date et l'heure de la creation de l'objet*/
	public void creation() {
		 System.out.println("Annee: " + this.get(Calendar.YEAR));
		 System.out.println("Mois: " + this.get(Calendar.MONTH));
		 System.out.println("Jour: " + this.get(Calendar.DATE));
		 System.out.println("Heure: " + this.get(Calendar.HOUR_OF_DAY));
		 System.out.println("Minute: " + this.get(Calendar.MINUTE));
		 System.out.println("Seconde: " + this.get(Calendar.SECOND));
	}
	/**Affiche la date et l'heure courante*/
	public void afficher() {
		String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println("Current Time: " + timeStamp);
	}
	/**Affiche le nombre de secondes depuis la creation de l'objet*/
	public void duree() {
		int x = this.secondeCreation;
		int y = this.get(Calendar.SECOND);
		int duration = y - x;
		System.out.println("Duree en secondes depuis la creation de l'objet: " + duration);
	}

}
