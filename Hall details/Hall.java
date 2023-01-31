import java.io.*;
import java.util.*;
public class Hall {
	private String name;
    private String contact;
    private Double costPerDay;
    private String owner;
	public String getName() {
		return name;
	}
	public Hall(){
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Hall(String name, String contact, Double costPerDay, String owner) {
		super();
		this.name = name;
		this.contact = contact;
		this.costPerDay = costPerDay;
		this.owner = owner;
	}
	public static void writeHallDetails(List<Hall> halls)throws IOException{
	  BufferedWriter bw = new BufferedWriter(new FileWriter("hall.csv",false));
    for (Hall hall : halls) {
      bw.write(String.format("%s,%s,%.1f,%s\n", hall.getName(), hall.getContact(), hall.getCostPerDay(), hall.getOwner()));
    }
    bw.close();
  }
}
