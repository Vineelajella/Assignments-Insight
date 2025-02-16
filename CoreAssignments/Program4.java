package CoreAssignments;

public class Program4 {
	public String reshape(String s,char c) {
		StringBuilder rev=new StringBuilder();
		rev.reverse();
		
		  StringBuilder result = new StringBuilder();
		  for (int i = 0; i < rev.length(); i++) {
	            result.append(rev.charAt(i));
	            if (i != rev.length() - 1) {
	                result.append(c);
	            }
	        }
	        
	        return result.toString();
		
	}
}
