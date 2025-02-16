package Day4Ass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieTest {

    public static void main(String[] args) {
        List<Movies> mlist = new ArrayList<>();

       
        mlist.add(new Movies("Ala Vaikunthapurramuloo", "Telugu", "12 January 2020", "Trivikram Srinivas", "vIN", 167));
        mlist.add(new Movies("Dangal", "Hindi", "23 December 2016", "Nitesh Tiwari", "Aamir Khan", 161));
        mlist.add(new Movies("Inception", "English", "16 July 2010", "Christopher Nolan", "Christopher Nolan", 148));

       Collections.sort(mlist);
       for (Movies movie : mlist) {
           System.out.println(movie);
          
       }
       Collections.sort(mlist, Comparator.comparing(Movies::getDirector)); // Sort by director's name

        for (Movies movie : mlist) {
            System.out.println(movie);
           
        }
        
        
    }
    
}

