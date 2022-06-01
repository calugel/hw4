package ge.ufc.main;

public class Rectangle {

	private double width;
	private double length;
	
	
	private static double maxWidth;
	private static double maxLength;

	
	
	static
	{
	maxWidth = 200;
	maxLength = 300;
	}
	
	
	
	// setter methods
	
	public void setWidth(double width) {
		if (width > maxWidth) {
			this.width = maxWidth; 
		}else {
			this.width = width;
		}
	}
	
	
	public void setLength(double length) {
		if(length > maxLength) {
			this.length = maxLength;
		}else {
			this.length = length;
		}
	}
	
	
	
	// getter methods
	
	public double getWidth() {
		return width;
	}
			
	public double getLength() {
		return length;
	}
	
	
	
	public double getArea() {
		return width * length;
	}
	
	public double getPerimeter() {
		return 2 * (width + length);
	}
	
	

	// constructor methods
	
	public Rectangle(double width, double length) {
		setWidth(width);
		setLength(length);
	}
		
	public Rectangle(double length) {
		this(0,length);
	}
	
	public Rectangle() {
		this(77,0);
	}
	
	
	
	
	// static method
	
	public static Rectangle maxArea(Rectangle [] arr) {
		
		Rectangle rect = new Rectangle();
		double max_Area = Double.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			double current_Area = arr[i].getArea();
			
			if(current_Area > max_Area) {
				max_Area = current_Area;
				rect = arr[i];
			}
			
		}
		
		System.out.println("The Area in numbers = " + rect.getArea());
		return rect;
	}	
	
}
