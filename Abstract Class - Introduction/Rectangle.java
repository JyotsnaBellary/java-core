public class Rectangle extends Shape {
	//write your code here
	Float length;	
	Float breadth;
	
	public Float getLength() {
		return length;
	}
	public void setLength(Float length) {
		this.length = length;
	}
	public Float getBreadth() {
		return breadth;
	}
	public void setBreadth(Float breadth) {
		this.breadth = breadth;
	}
	
	public Rectangle(Float length, Float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	

	public Double calculatePerimeter() {
		//
		return (double) (2*(length + breadth));
	} 
}
