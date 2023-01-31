import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		//your code goes here...
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details of hall in csv format:");
		String line = sc.nextLine();
		String l[]=line.split(",");
		System.out.println("Enter the username:");
		String username = sc.nextLine();
		UserDAO userDAO = new UserDAO();
		User u = userDAO.getUser(username);
		HallDAO hallDao = new HallDAO();
		if(u == null){
			do {
				System.out.println("Username seems to be wrong!! Enter the correct username:");
				String cUsername = sc.nextLine();
				u = userDAO.getUser(cUsername);
			}while(u == null);
		}
		Hall h = new Hall(l[0], l[1], Double.parseDouble(l[2]), u);
		hallDao.saveHall(h);
		
		
		System.out.format("%-5s %-15s %-10s %s\n","Name","Mobile","Cost","Owner");
		List<Hall> List = hallDao.getAllHall();
		for(Hall hall: List) {
			User us = hall.getOwner();
			System.out.format("%-5s %-15s %-10s %s\n",hall.getName(),hall.getContactNumber(),hall.getCostPerDay(), us.getName());
		}
	}

}
