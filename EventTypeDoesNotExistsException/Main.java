import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		ArrayList<EventType> typeList=new ArrayList<>();
		ArrayList<Event> eventList = new ArrayList<>();
		typeList.add(new EventType("Stage Event",new Long(1)));
		typeList.add(new EventType("Exhibition",new Long(2)));
		typeList.add(new EventType("Sports meet",new Long(3)));
		
		Scanner sc = new Scanner(System.in);
		//write your code here
		System.out.println("Enter the number of the events:");
		int n = sc.nextInt();
		int i = 0;
		while(i<n) {
			try {
				System.out.println("");
				String s = sc.nextLine();
				String[] l = s.split(",");
				isValid(Long.parseLong(l[3]), typeList);
				Event e = new Event(l[0],l[1],l[2],Long.parseLong(l[3]));
				i++;
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (EventTypeDoesNotExistsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("The events entered are:");
		System.out.println("Name           Details        Owner name     Event typeid");
		for(Event event: eventList) {
			System.out.printf("%-15s%-15s%-15s%-15s\n", event.getName(), event.getDetail(), event.getOwnerName(), event.getTypeId());
		}
		
		
//		throw new EventTypeDoesNotExistsException("Mobile number and alternate mobile number are same");

		
	}
	
	public static Boolean isValid(Long typeId, List<EventType> typeList) throws EventTypeDoesNotExistsException {
        //write your code here
		for(EventType type: typeList) {
		if(typeId.equals(type.getId())){
	           return true;
	       }
		}
		throw new EventTypeDoesNotExistsException("No event type available with the given id");
	}
}
