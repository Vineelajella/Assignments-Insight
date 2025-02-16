package Day2Assignment;

public class TreeOops {
	public Double height;
	

	public TreeOops(Double height) {
		super();
		this.height = height;
		System.out.println("Planting a tree");
		
	}
	public Double getHeight() {
		return height;
	}



	public void setHeight(Double height) {
		this.height = height;
	}
	

	@Override
	public String toString() {
		return "TreeOops [height=" + height + "]";
	}



	public static void main(String[] args) {
		TreeOops t=new TreeOops(2.00);
		t.setHeight(4.6);
		t.getHeight();
		System.out.println("Height of tree is : "+ t.getHeight());
	
		

	}

}
