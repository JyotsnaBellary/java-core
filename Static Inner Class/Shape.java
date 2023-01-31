public class Shape {

        //fill your code here
	public static Double value1;
	public static Double value2;

	public static class Rectangle {
	    //fill your code here
		public void setValue1(Double one) {
			value1 = one;
		}
		
		public void setValue2(Double two){
			value2 = two;
		}
		public Double computeRectangleArea() {
			return value1 * value2;
		}
	}
	
	public static class Triangle {
	    //fill your code here
		public void setValue1(Double one) {
			value1 = one;
		}
		
		public void setValue2(Double two){
			value2 = two;
		}
		public Double computeTriangleArea() {
			return .5 * value1 * value2;
		}
		
	}	
}