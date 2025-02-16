package Day2Assignment;

public class Rectangle {
	int length;
	int breadth;
	public Rectangle(int val) {
		super();
		this.length = val;
		this.breadth=val;
	
	}
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public int calarea() {
		return length*breadth;
	}
	public int calper() {
		 return 2 * (length + breadth);
	}
	
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(2);
		Rectangle r2=new Rectangle(4,5);
		
		System.out.println("area: "+r1.calarea());
		System.out.println("perimeter: "+r2.calper());
		
		
	}
		

}
