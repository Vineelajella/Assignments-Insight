package Exceptionsdemo;

public class Source {

    public static void main(String[] args) {
        Activity a1 = new Activity("Vineela", "Poori", "+");
        Activity a2 = new Activity("Vinny", "sowj", "+");
        Activity a3 = new Activity("sowji", "manasii", "-");

        Activity[] activities = { a1, a2, a3 };
        Source source = new Source();
        

        for (Activity ac : activities) {
            if (source.validate(ac)) {
                String result = source.doOperation(ac);
                System.out.println("Result: " + result);
            }
        }
    }
    
    boolean validate(Activity ac) {
        try {
            if (ac.s1 == null || ac.s2 == null || ac.operator == null) {
                throw new NullPointerException("Strings should not be null");
            }

            if (!ac.operator.equals("+") && !ac.operator.equals("-")) {
                throw new OperatorException("Operator should be + or - only");
            }

            return true;
        } catch (OperatorException | NullPointerException on) {
            on.printStackTrace();
            return false;
        }
    }

    String doOperation(Activity ac) {
        StringBuilder res = new StringBuilder();

        if (ac.operator.equals("+")) {
            res.append(ac.s1).append(ac.s2);  // Concatenate strings
        } else if (ac.operator.equals("-")) {
            for (int i = 0; i < ac.s1.length(); i++) {
                if (!ac.s2.contains(String.valueOf(ac.s1.charAt(i)))) {
                    res.append(ac.s1.charAt(i));  
                }
            }
        }

        return res.toString();  
        
    }
}
