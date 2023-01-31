
public class AircraftManufacturer {
    Integer aircraftManufacturerId;
    String name;

    public AircraftManufacturer() {
    }

    public AircraftManufacturer(Integer aircraftManufacturerId, String name) {
        this.aircraftManufacturerId = aircraftManufacturerId;
        this.name = name;
    }

    public Integer getAircraftManufacturerId() {
        return aircraftManufacturerId;
    }

    public void setAircraftManufacturerId(Integer aircraftManufacturerId) {
        this.aircraftManufacturerId = aircraftManufacturerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
