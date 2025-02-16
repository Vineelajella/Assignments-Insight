package CoreAssignments;

public class Program1 {
	public String getcap(String sent) {
		String[] words=sent.split(" ");
		StringBuilder res=new StringBuilder();
		for(String word:words) {
			if(word.length()>0) {
				res.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }

			}
		 return res.toString().trim();
		}
	}

