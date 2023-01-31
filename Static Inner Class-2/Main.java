import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		//fill your code here
    	Scanner sc=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.00");
        System.out.println("Enter the ticket type\n1.Platinum\n2.Gold\n3.Silver");
        int input=sc.nextInt();
        
        switch (input)
        {
             case 1:
             System.out.println("Enter the no. of seats");     
             Ticket.Platinum plat = new Ticket.Platinum();
             plat.setNoOfSeats(sc.nextInt());
             System.out.println("Cost of the tickets is Rs."+df.format(plat.computeCost()));
             break;
             
             case 2:
            	 System.out.println("Enter the no. of seats");     
                 Ticket.Gold gold = new Ticket.Gold();
                 gold.setNoOfSeats(sc.nextInt());
                 System.out.println("Cost of the tickets is Rs."+df.format(gold.computeCost()));
                 break;
                 
             case 3:
            	 System.out.println("Enter the no. of seats");     
                 Ticket.Silver sil = new Ticket.Silver();
                 sil.setNoOfSeats(sc.nextInt());
                 System.out.println("Cost of the tickets is Rs."+df.format(sil.computeCost()));
                 break;
             
             default:
             System.out.println("Invalid choice");
        
        
        }
	}
}