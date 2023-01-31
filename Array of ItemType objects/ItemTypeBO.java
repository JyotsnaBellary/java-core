
public class ItemTypeBO {
    
	public void add(ItemType n1,ItemType[] itemTypeArray,Integer index){
		//Your code here
		if(index != itemTypeArray.length){
			itemTypeArray[index] = n1;
			System.out.println("New item added successfully");
		}
	}
    
	public void search(String search,ItemType[] itemTypeArray){
		//Your code here
		int flag = 0;
		for(ItemType item : itemTypeArray){
			if(item.getName().equals(search)){
				flag = 1;
				System.out.println("Searched Item Type is:");
				System.out.println("Name:" + item.getName());
				System.out.println("Deposit Amount:" + item.getDeposit());
				System.out.println("Cost Per Day:" + String.format("%.1f", item.getCostPerDay()));
				break;
			}
		}
		if(flag == 0){
			System.out.println("Searched Item Type not found");
		}
	}
	public void display(ItemType[] itemTypeArray){
		//Your code here
		int i = 1;
		for(ItemType item : itemTypeArray){
			System.out.println("Item Type Number " + (i++) +":");
			System.out.println("Name:" + item.getName());
			System.out.println("Deposit Amount:" + item.getDeposit());
			System.out.println("Cost Per Day:" + String.format("%.1f", item.getCostPerDay()));
		}
	}
}
