public class Ticket {
    //fill your code here
	public static Integer noOfSeats;
	
	public static class Platinum{
		
		public void setNoOfSeats(int one) {
			noOfSeats = one;
		}
		
		public int getNoOfSeats() {
			return noOfSeats;
		}
		
		public Double computeCost() {
			return noOfSeats * 210.50;
		}
	}
	
	public static class Gold{
		
		public void setNoOfSeats(int one) {
			noOfSeats = one;
		}
		
		public int getNoOfSeats() {
			return noOfSeats;
		}
		
		public Double computeCost() {
			return noOfSeats * 168.45;
		}
	}
	
public static class Silver{
		
	public void setNoOfSeats(int one) {
		noOfSeats = one;
	}
	
	public int getNoOfSeats() {
		return noOfSeats;
	}
	
		public Double computeCost() {
			return noOfSeats * 107.37;
		}
	}
}