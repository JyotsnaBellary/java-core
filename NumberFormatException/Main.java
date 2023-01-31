import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
       //fill your code here
		Scanner sc = new Scanner(System.in);
	
		try {
			System.out.println("Enter the Item type details:");
			System.out.println("Enter the name:");
			String s = sc.next();
			System.out.println("Enter the deposit:");
			Double deposit = Double.parseDouble(sc.next());
			System.out.println("Enter the cost per day:");
			Double cost = Double.parseDouble(sc.next());
			ItemType item = new ItemType(s, deposit, cost);
			item.toString();
		}catch(NumberFormatException e) {
			System.out.println(e);
		}
	   
	}
}