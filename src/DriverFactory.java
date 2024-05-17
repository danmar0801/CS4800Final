public class DriverFactory implements UserFactory {
    @Override
    public User createUser(String name, String address, String county) {
        // Example values, these should be provided based on your specific requirements
        String shift = "1st shift";
        String operatingCounty = "LA County";
        return new Driver(name, address, county, shift, operatingCounty);
    }
}

