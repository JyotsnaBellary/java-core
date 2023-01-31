import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		//Your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of events");
		int n = sc.nextInt();
		System.out.println("Enter event details in CSV");
		ArrayList<Event> eventList = new ArrayList<Event>();  
		for(int i = 0; i < n; i++) {
			String[] s = sc.nextLine().split(",");
			HallBooking hallBooking = new HallBooking(s[1], Double.parseDouble(s[2]), Integer.parseInt(s[3]), Integer.parseInt(s[4]));
			Event event = new Event(s[0], hallBooking);
			eventList.add(event);
		}
		ComputeStatus computeStatus = new ComputeStatus(eventList);
		computeStatus.start();
	}
}
