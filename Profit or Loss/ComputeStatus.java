import java.util.List;

public class ComputeStatus extends Thread{
    List<Event> eventList;
    
    public ComputeStatus() {
    	super();
	}
	
	public ComputeStatus(List<Event> eventList) {
		super();
		this.eventList = eventList;
	}

	@Override
	public void run() {
	    
        //fill your code here
        for(Event event: this.eventList) {
			Double n = (double) (event.getHallBooking().getSeatsBooked()/ event.getHallBooking().getHallCapacity());
        		System.out.println(n);
        	if(event.getHallBooking().getSeatsBooked()/event.getHallBooking().getHallCapacity() * 100 >= 60) {
        		System.out.println(event.getName() + " yeilds profit");
        	}
        	else {
        		System.out.println(event.getName() + " yeilds loss");
        	}
        }
	}
}
