
import java.util.ArrayList;
import java.util.List;

public class StandardPackage {
    private String name;
    private String status;
	private Double cost = (double) 0;
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
		ArrayList<Book> l = (ArrayList<Book>) this.bookList;
		for(Book book: l) {
			this.setCost(this.cost + book.getCost());	
		}
	}
	
	public void display() {
		//Fill your code here
		System.out.printf("%-25s %-25s %s\n", "Name", "Status", "Cost");
		System.out.printf("%-25s %-25s %s\n", this.getName(), this.getStatus(), this.cost);
		System.out.println("Product Details:");
		System.out.printf("%-30s %-40s %-15s %-30s %-15s\n", "Name", "Description", "Cost", "Category","Author");
		for(Book book: this.getBookList()) {
			System.out.printf(book.toString(), book.getName(), book.getDescription(), book.getCost(), book.getCategory(), book.getAuthor());
		}
	}
}
