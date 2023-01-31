public class Bike implements BikeDistance, BikeSpeed

{
	Integer distance;
	Integer speed;
	
	

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	
	
	public Bike(Integer distance, Integer speed) {
		super();
		this.distance = distance;
		this.speed = speed;
	}
	
	public Bike() {
		
	}

	@Override
	public int averageSpeed() {
		// TODO Auto-generated method stub
		return this.distance;
	}

	@Override
	public int totalDistance() {
		// TODO Auto-generated method stub
		return this.getDistance() / this.getSpeed() ;
	}

		
        
    //Fill your code

	


}
	

	