package lessons.revision;

public class BlueBox {

	public static void main(String[] args) {
		
		Box defaultBox = new Box(5, 10, 10);
		System.out.println(defaultBox.compute());
		
		Box smallBox = new Box(5, 5, 2);
		System.out.println(smallBox.compute());
		

	}

}
