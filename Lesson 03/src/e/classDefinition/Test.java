package e.classDefinition;

public class Test {
	
	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point(25, 55);
		Point p3 = new Point(100);
		
		System.out.println(p3.getX()); // use a get method to get the value of a private attribute
		System.out.println(p3.getY());
		
		p3.setX(200);  // use a set method to set the value of a private attribute

		System.out.println(p3.getX());
		System.out.println(p3.getY());
	}

}
