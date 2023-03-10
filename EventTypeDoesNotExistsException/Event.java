
public class Event {
    private String name;
    private String detail;
    private String ownerName;
    private Long typeId;

    public Event() {
    }

    public Event(String name, String detail, String ownerName, Long typeId) {
        this.name = name;
        this.detail = detail;
        this.ownerName = ownerName;
        this.typeId = typeId;
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

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

	@Override
	public String toString() {
	String newLine = System.getProperty("line.separator");
	
	return "" + super.toString()
            .concat(newLine)
            .concat("The details of the item type are:")
            .concat(newLine)
            .concat("Name:" + getName())
            .concat(newLine)
            .concat("Deposit:" + getDetail())
            .concat(newLine)
            .concat("Name:" + getOwnerName())
            .concat(newLine)
            .concat("Cost Per Day:" + getTypeId());
	}
}
