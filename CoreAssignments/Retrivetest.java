package CoreAssignments;

public class Retrivetest {

	public static void main(String[] args) {
		Set5Retriveposition r=new Set5Retriveposition();
		int[] a={12,1,32,3};
		int[] b={0,12,2,23};
		int[] c=r.retrievePosition(a,b);
		for(int d:c)
			System.out.println(d);
	}

}


