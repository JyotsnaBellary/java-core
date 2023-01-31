
import java.util.List;

public class StandardPackage {
    private String name;
    private String status;
	private Double cost;
	private List<Book> bookList;
	
	public StandardPackage(String name, String status,  List<Book> bookList) {
		super();
		this.name = name;
		this.status = status;
		this.bookList = bookList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	public void calculateCost() {
		//Fill your code here
	}
	
	public void display() {
		//Fill your code here
	}
}
