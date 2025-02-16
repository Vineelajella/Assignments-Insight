package Day4Ass;

import java.util.Comparator;

public class MoviesortAcctoDir implements Comparator<Movies>{
	
	public int compare(Movies m1,Movies m2) {
		return m1.getDirector().compareTo(m2.getDirector())
	}

}
