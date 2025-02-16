package CoreAssignments;

public class Program1Test {

	public static void main(String[] args) {
		Program1 p=new Program1();
		
		String sentence = "Now is the time to act!";
		String capitalizedSentence = p.getcap(sentence);
		System.out.println(capitalizedSentence);
	}

	
}
