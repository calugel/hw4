package ge.ufc.main;

public class Main {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(300,300);
		System.out.println(r.getLength());   // 300
		System.out.println(r.getWidth());	 // 200
		
		
		
		Rectangle r1 = new Rectangle(100);
		System.out.println(r1.getLength());   // 100
		System.out.println(r1.getWidth());    // 0
		
		r1.setLength(600);                    
		System.out.println(r1.getLength());   // 300
		r1.setWidth(140);
		System.out.println(r1.getWidth());	  // 140
		
		
		
		Rectangle r2 = new Rectangle();
		System.out.println(r2.getLength());   // 0
		System.out.println(r2.getWidth());    // 77
		
		r2.setWidth(700);
		System.out.println(r2.getWidth());    // 200
		
		
		
		
		
		// rectangle array
		
		Rectangle[] rectArr = {r1,r2,r};
		
		System.out.println(Rectangle.maxArea(rectArr));  // returns both, address of array and the value of Area.
		
	}

}
