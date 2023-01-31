
public class Aircraft {
    Integer aircraftId;
    AircraftManufacturer aircraftManufacturerInstance;
    String model;

    public Aircraft() {
    }

    public Aircraft(Integer aircraftId, AircraftManufacturer aircraftManufacturerInstance, String model) {
        this.aircraftId = aircraftId;
        this.aircraftManufacturerInstance = aircraftManufacturerInstance;
        this.model = model;
    }

    public Integer getAircraftId() {
        return aircraftId;
    }

    public void setAircraftId(Integer aircraftId) {
        this.aircraftId = aircraftId;
    }

    public AircraftManufacturer getAircraftManufacturerInstance() {
        return aircraftManufacturerInstance;
    }

    public void setAircraftManufacturerInstance(AircraftManufacturer aircraftManufacturerInstance) {
        this.aircraftManufacturerInstance = aircraftManufacturerInstance;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
}
