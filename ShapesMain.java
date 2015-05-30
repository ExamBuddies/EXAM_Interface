package Shapes;
// Demonstrates shape classes.
public class ShapesMain {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
	
		shapes[0] = new Rectangle(18, 18);
		shapes[1] = new Circle(12);
		
		for (int i = 0; i < shapes.length; i++) {
			System.out.println("area = " + shapes[i].getArea());
		}
	}
}
