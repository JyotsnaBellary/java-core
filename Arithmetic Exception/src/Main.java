import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the cost of the item for n days");
		Integer cost=Integer.parseInt(br.readLine());
		System.out.println("Enter the value of n");
		Integer n=Integer.parseInt(br.readLine());
		double costPerDay;
		try{
			costPerDay = new CalculateBO().calculateCost(cost, n);
			System.out.println("Cost per day of the item is "+costPerDay);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
	}
}