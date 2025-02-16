package Day2Ass21docx;

public class GameTest {

	public static void main(String[] args) {
		Game[] g=new Game[3];
		g[0]=new Cricket();
		g[1]=new Football();
		g[2]=new Tennis();
		
		for(Game ga:g) {
			ga.displayInfo();
		}
		
		

	}

}
