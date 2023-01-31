import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Customer c = new Customer();
    	Customer c1 = new Customer();
		// fill your code here
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter First Customer Details :");
    	System.out.println("Enter Customer Name :");
    	c.setName(sc.nextLine());
    	System.out.println("Enter Customer Email :");
    	c.setEmail(sc.nextLine());
    	
    	System.out.println("Enter Second Customer Details :");
    	System.out.println("Enter Customer Name :");
    	c1.setName(sc.nextLine());
    	System.out.println("Enter Customer Email :");
    	c1.setEmail(sc.nextLine());
    	if(c.getEmail().equals(c1.getEmail())) {
    		System.out.println("The Email ids of "+ c.getName() + " and " + c1.getName() + " are equal");
    	}else {
    		System.out.println("The Email ids of "+ c.getName() + " and " + c1.getName() + " are not equal");	
    	}
    	System.out.println("Comparing without considering the cases :");
    	if(c.getEmail().equalsIgnoreCase(c1.getEmail())) {
    		System.out.println("The Email ids of "+ c.getName() + " and " + c1.getName() + " are equal");
    	}else {
    		System.out.println("The Email ids of "+ c.getName() + " and " + c1.getName() + " are not equal");	
    	}
    	
	}
}