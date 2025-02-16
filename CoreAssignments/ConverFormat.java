package CoreAssignments;

public class ConverFormat {
	 public static String convertFormat(String input) {
	        StringBuilder output = new StringBuilder();
	        int count = 0;
	        
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (Character.isDigit(ch)) {
	                count++;
	                output.append(ch);
	                
	                if (count == 2) {
	                    output.append('-');
	                    count = 0;
	                }
	            }
	        }
	        
	        return output.toString();
	    }

}
