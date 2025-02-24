package Threads;

public class Advisor {

	public static void main(String[] args) {
		String[] advices= {"Never begin to stop and never stop to begin.",
				"Only destination isn’t important, one should enjoy the  journey.",
				" impossible itself says ‘i m possible’"
		};
		int randomind=(int) (Math.random()*advices.length);
		System.out.println(advices[randomind]);

	}

}
