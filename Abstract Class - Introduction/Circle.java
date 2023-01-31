public class Circle extends Shape{
	//write your code here
	Float radius;

	public Float getRadius() {
		return radius;
	}

	public void setRadius(Float radius) {
		this.radius = radius;
	}

	public Circle(Float radius) {
		super();
		this.radius = radius;
	}
	
	public Double calculatePerimeter() {
		return 3.14*2*radius;
	}
	
}
