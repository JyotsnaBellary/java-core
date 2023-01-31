import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		// fill your code here
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Address Details :");
    	System.out.println("Enter Line 1 :");
    	String Line1 = sc.nextLine();
    	System.out.println("Enter Line 2 :");
    	String Line2 = sc.nextLine();
    	System.out.println("Enter City :");
    	String city = sc.nextLine();
    	System.out.println("Enter Country :");
    	String Country = sc.nextLine();
    	System.out.println("Enter Zip Code :");
    	int zip = sc.nextInt();
    	Address a = new Address();
    	a.setLine1(Line1);
    	a.setLine1(Line2);
    	a.setCity(city);
    	a.setCountry(Country);
    	a.setZipCode(zip);
    	a.toString();
	}
}