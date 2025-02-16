package Exceptionsdemo;

import java.time.LocalDate;
import java.util.Stack;

public class ContactService {
    public static void main(String[] args) {
        LocalDate dob1 = LocalDate.of(2003, 7, 17);
        LocalDate dob2 = LocalDate.of(2004, 12, 19);
        LocalDate dob3 = LocalDate.of(2002, 9, 23);

        Contact c1 = new Contact("Vineela", "Jella", dob1, "9999999"
        		+ "99", "F", " ");
        Contact c2 = new Contact("Poornima", "Padam", dob2, "9995678904", "F", " ");
        Contact c3 = new Contact("Sowj", "V", dob3, "9234561784", "F", " ");
        Contact c4 = new Contact("Has", "R", dob3, "9456783425", "F", " ");

        Stack<Contact> s = new Stack<>();
        try {
            int maxsize = 3;

            s.push(c1);
            s.push(c2);
            s.push(c3);
            s.push(c4);
            

            if (s.size() > maxsize) {
                throw new StackFullException("Stack is full");
            }
        } catch (StackFullException sf) {
            sf.printStackTrace();
        }

        for (Contact c : s) {
            try {
                if (c.phnNum == null || c.phnNum.length() != 10) {
                    throw new InvalidContactException("Phone number should have exactly 10 digits: " + c.phnNum);
                }

                if (c.fname == null || c.fname.length() < 6) {
                    throw new InvalidContactException("Name should have at least 6 characters: " + c.fname);
                }

                if (c.gender == null || (!c.gender.equals("M") && !c.gender.equals("F"))) {
                    throw new InvalidContactException("Gender should be F or M: " + c.gender);
                }
            } catch (InvalidContactException ie) {
                ie.printStackTrace();
            }
        }

        try {
            while (!s.isEmpty()) {
                Contact poppedContact = s.pop();
                System.out.println("Popped: " + poppedContact);
            }

            if (s.isEmpty()) {
                throw new StackEmptyException("Stack is empty. Cannot pop.");
            }
        } catch (StackEmptyException se) {
            se.printStackTrace();
        }
    }
}
