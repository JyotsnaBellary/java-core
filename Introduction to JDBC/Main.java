import java.util.List;

public class Main {
	public static void main(String[] args)  {
		//your code goes here...
		System.out.format("%-5s %-15s %-10s %s\n","ID","Name","Deposit","Cost per day");
		
		ItemTypeDAO itemTypeDAO = new ItemTypeDAO();
		List<ItemType> List = itemTypeDAO.getAllItemTypes();
		for(ItemType item:List) {
			System.out.format("%-5s %-15s %-10s %s\n",item.getId(),item.getName(),item.getDeposit(),item.getCostPerDay());
		}
	}
}