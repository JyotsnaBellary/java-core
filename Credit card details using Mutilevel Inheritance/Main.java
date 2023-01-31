import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//fill your code here
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the travel details");
		System.out.println("Travel Place");
		String place = sc.nextLine();
		System.out.println("Number of tickets");
		int numberOfPersons = sc.nextInt();
		System.out.println("Cost per ticket");
		Double cost = sc.nextDouble();
		System.out.println("1)Travel Creditcard\r\n" + 
				"2)RewardCreditcard\r\n" + 
				"Enter credit card type");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("1)International\r\n" + 
					"2)National\r\n" + 
					"Enter travel creditcard type");
			int t = sc.nextInt();
			switch(t) {
			case 1:
				InternationalCard card = new InternationalCard();
				System.out.println("Enter the creditcard number");
				String creditcard = sc.next();
				card.setNumber(creditcard);
				System.out.println("Enter the creditcard holdername");
				card.setHolderName(sc.next());
				System.out.println("Enter the available amount");
				card.setAmount(Double.parseDouble(sc.next()));
				card.setExchangePercentage(0.10);
				System.out.print("Hello "  + card.getHolderName() + ", You have to pay Rs");
				System.out.printf("%.1f", card.calculateAmount(cost, numberOfPersons));
				
				break;
			case 2:
				CountryCard Ccard = new CountryCard();
				System.out.println("Enter the creditcard number");
				Ccard.setNumber(sc.next());
				System.out.println("Enter the creditcard holdername");
				Ccard.setHolderName(sc.next());
				System.out.println("Enter the available amount");
				Ccard.setAmount(Double.parseDouble(sc.next()));
				Ccard.setExchangePercentage(0.10);
				System.out.print("Hello " + Ccard.getHolderName() + ", You have to pay Rs");
				System.out.printf("%.1f", Ccard.calculateAmount(cost, numberOfPersons));
				
				break;
			default:
				System.out.println("Invalid Card Type");
			}
			
			break;
		case 2:
			RewardsCreditCard Rcard = new RewardsCreditCard();
			System.out.println("Enter the creditcard number");
			Rcard.setNumber(sc.next());
			System.out.println("Enter the creditcard holdername");
			Rcard.setHolderName(sc.next());
			System.out.println("Enter the available amount");
			Rcard.setAmount(Double.parseDouble(sc.next()));
			System.out.println("Enter the available rewards");
			Rcard.setCreditPoints(sc.nextDouble()); 
			System.out.print("Hello " + Rcard.getHolderName() + ", You have to pay Rs");
			System.out.printf("%.1f", Rcard.calculateAmount(cost, numberOfPersons));
			
			break;
		default:
			System.out.println("Invalid Card Type");
		
			
		}
	}

}
