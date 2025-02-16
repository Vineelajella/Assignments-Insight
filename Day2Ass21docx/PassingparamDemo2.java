package Day2Ass21docx;

public class PassingparamDemo2 {
	
	public void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		System.out.println("swapped a and b are :" +a +"," +b);
		
		
	}
	
	public static void swap(int[] arr1,int[] arr2) {
		 System.out.println("Before swap (arrays):");
	        System.out.print("arr1: ");
	        for (int i : arr1) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	        System.out.print("arr2: ");
	        for (int i : arr2) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	        
	        int[] temp = arr1;
	        arr1 = arr2;
	        arr2 = temp;
	        for (int i : arr1) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	        System.out.print("arr2: ");
	        for (int i : arr2) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	        
	        
	        
	}

}
