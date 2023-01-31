import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class Main {
    public static void main(String[] args) {
		// fill your code here
    	Scanner sc = new Scanner(System.in);
    	BillHeader B = new BillHeader();
    	System.out.println("Enter the issue date as dd/MM/yyyy");
    	String d1 = sc.nextLine();
    	 Date date1;
		try {
			date1 = new SimpleDateFormat("dd/MM/yyyy").parse(d1);
			B.setIssueDate(date1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
    	System.out.println("Enter the due date as dd/MM/yyyy");
    	String d2 = sc.nextLine();
    	Date date2;
		try {
			date2 = new SimpleDateFormat("dd/MM/yyyy").parse(d2);
			B.setDueDate(date2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    	System.out.println("Enter the original amount");
    	String str = sc.nextLine();
    	B.setOriginalAmount(Double.parseDouble(str));
    	System.out.println("Enter amount paid so far");
    	String str1 = sc.nextLine();
    	Double amount = Double.parseDouble(str1);
    	Double amountOut = B.getOriginalAmount() - amount;
    	B.setAmountOutstanding(amountOut);
    	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
    	System.out.println("Issue date: " + dateFormat.format(B.getIssueDate()));
    	System.out.println("Due Date: " + dateFormat.format(B.getDueDate()));
    	System.out.println("Original amount Rs." + String.format("%.1f", B.getOriginalAmount()));
    	System.out.println("Amount outstanding Rs." + String.format("%.1f", B.getAmountOutstanding()));
	}
}