public class EventBO {
	//Your code here
	static Integer currentPeopleCount = 0;
	
	public static void processEvent(String enterType) {
		String[] entry = enterType.split(" ");
		for(String i:entry) {
			if(i.equals("Entry")) {
				currentPeopleCount += 1;
			}else if(i.equals("Exit")) {
				currentPeopleCount -= 1;
			}
		}
		System.out.println("The number of current participants are " + currentPeopleCount);
	}
}
