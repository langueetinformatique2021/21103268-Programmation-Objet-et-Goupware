package tp06;

public class TestChat {

	public static void main(String[] args) {
		Chat c = new Chat();
		c.présente();
		c.crie();
		//pour l'instant le chat est sauvage
		
		c.domestiquer("Anko");
		c.présente();
		c.crie();
		
	}

}
