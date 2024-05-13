public class Driver extends User {
    private String shift;
    private String operatingCounty;

    public Driver(String name, String address, String county, String shift, String operatingCounty) {
        super(name, address, county);
        this.shift = shift;
        this.operatingCounty = operatingCounty;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getOperatingCounty() {
        return operatingCounty;
    }

    public void setOperatingCounty(String operatingCounty) {
        this.operatingCounty = operatingCounty;
    }
}

