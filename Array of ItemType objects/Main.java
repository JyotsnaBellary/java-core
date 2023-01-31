import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception{
		//Your code here
		// Scanner sc = new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.println("Enter the Number of Item Type");
		n = Integer.parseInt(br.readLine());
		ItemType[] itemTypeArray = new ItemType[n];
		String name;
		Double deposit, costPerDay;
		for(int i = 0; i < n; i++){
			
			System.out.println("Enter the Item Type "+(i+1)+" Name");
			name = br.readLine();
			System.out.println("Enter the Deposit Amount");
			deposit = Double.parseDouble(br.readLine());
			System.out.println("Enter the Cost per day");
			costPerDay = Double.parseDouble(br.readLine());
			ItemType object = new ItemType(name, deposit, costPerDay);
			new ItemTypeBO().add(object, itemTypeArray, i);

		}
		new ItemTypeBO().display(itemTypeArray);
		String search;
		System.out.println("Enter the Name of the item to be searched");
		search = br.readLine();
		new ItemTypeBO().search(search, itemTypeArray);
	}
}