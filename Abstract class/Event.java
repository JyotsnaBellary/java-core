abstract public class Event {

    //Fill your code here
	String name;
	String detail;	
	String type;
	String organiser;
	
	public Event(String name, String detail, String type, String organiser) {
		super();
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.organiser = organiser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOrganiser() {
		return organiser;
	}

	public void setOrganiser(String organiser) {
		this.organiser = organiser;
	}
	
	abstract Double calculateAmount();
	
}