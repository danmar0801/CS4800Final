public class Driver extends User implements Observer {
    private String shift;
    private String operatingCounty;

    public Driver(String name, String address, String county, String shift, String operatingCounty) {
        super(name, address, county);
        this.shift = shift;
        this.operatingCounty = operatingCounty;
    }

    @Override
    public void update(Order order) {
        if (order.getRestaurant().getCounty().equals(this.operatingCounty) &&
                this.shift.equals(order.getOrderCreationTime())) { // Adjust the condition as needed
            System.out.println(this.getName() + " is available to deliver the order.");
        }
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


