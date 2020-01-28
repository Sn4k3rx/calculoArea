package entities;

public class Rectangle extends Shape{

	private Double widht;
	private Double height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(Double width, Double height) {
		this.height = height;
		this.widht = width;
	}
	
	public Double getWidht() {
		return widht;
	}

	public void setWidht(Double widht) {
		this.widht = widht;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double Area() {
		return widht * height;
	}

}
