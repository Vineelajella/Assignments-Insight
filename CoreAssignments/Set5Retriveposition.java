package CoreAssignments;

public class Set5Retriveposition {
	public static int[] retrievePosition(int[] a,int[] b){
		int[] c=new int[a.length];
		int i;
		for(i=0;i<a.length;i++){
			if(i%2==0)
				c[i]=b[i];
			if(i%2!=0)
				c[i]=a[i]; }
		return c;
	}
	}



