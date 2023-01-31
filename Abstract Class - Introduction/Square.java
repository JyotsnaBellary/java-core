public class Square extends Shape{
	//write your code here
	Float side;

	public Float getSide() {
		return side;
	}

	public void setSide(Float side) {
		this.side = side;
	}

	public Square(Float side) {
		super();
		this.side = side;
	}
	
	
	public Double calculatePerimeter() {
	
		return (double) (4*side);
	}
}
