package tp06;

public class TestChat {

	public static void main(String[] args) {
		Chat c = new Chat();
		c.pr�sente();
		c.crie();
		//pour l'instant le chat est sauvage
		
		c.domestiquer("Anko");
		c.pr�sente();
		c.crie();
		
	}

}
