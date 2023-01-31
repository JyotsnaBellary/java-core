class Event{
    
    
     //Your code here
	String	name;
	String	detail;
	String	organizer;
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
	public String getOrganizer() {
		return organizer;
	}
	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}
	public Event(String name, String detail, String organizer) {
		this.name = name;
		this.detail = detail;
		this.organizer = organizer;
	}

	public void totalCredit() {
	}
}