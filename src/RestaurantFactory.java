public class RestaurantFactory implements UserFactory {
    @Override
    public User createUser(String name, String address, String county) {
        // Example values, these should be provided based on your specific requirements
        String cuisineType = "Mexican";
        String operatingHours = "8AM-10PM";
        return new Restaurant(name, address, county, cuisineType, operatingHours, new Menu());
    }
}


