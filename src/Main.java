import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Get the singleton instance of the platform
        CPPFoodDelivery platform = CPPFoodDelivery.getInstance();

        // Create and register Restaurants
        platform.registerUser(new Restaurant("Taco Bell", "123 Taco St", "LA County", "Mexican", "8AM-10PM", new Menu()));
        platform.registerUser(new Restaurant("Thai Spice", "456 Pad Thai Ave", "Orange County", "Thai", "10AM-9PM", new Menu()));
        platform.registerUser(new Restaurant("Pizza Place", "789 Pizza Rd", "San Bernardino County", "Italian", "11AM-11PM", new Menu()));
        platform.registerUser(new Restaurant("Sushi Boat", "321 Sushi Blvd", "LA County", "Japanese", "9AM-6PM", new Menu()));

        // Create and register Drivers
        platform.registerUser(new Driver("John Doe", "100 Main St", "LA County", "1st shift", "LA County"));
        platform.registerUser(new Driver("Jane Smith", "200 Second St", "Orange County", "2nd shift", "Orange County"));
        platform.registerUser(new Driver("Mike Brown", "300 Third St", "San Bernardino County", "3rd shift", "San Bernardino County"));
        // (Add more drivers as needed)

        // Create and register Customers
        platform.registerUser(new Customer("Alice Johnson", "111 Fourth St", "LA County", "No restrictions"));
        platform.registerUser(new Customer("Bob White", "222 Fifth St", "Orange County", "Vegan"));
        // (Add more customers as needed)

        // Simulate a customer ordering
        Customer customer = platform.getCustomers().get(0); // Getting the first customer
        Restaurant restaurant = platform.getRestaurants().get(0); // Getting the first restaurant
        Order order = new Order(restaurant, customer, "No restrictions", restaurant.getMenu().getMeals(), null, "12:00 PM", "12:30 PM", "1:00 PM");
        restaurant.getMenu().addMeal(new Meal("Burrito", "Delicious Mexican burrito", 500, 18.0, 50.0, 25.0));

        // Assuming Driver and Order Management are set up to handle this
        Driver driver = platform.getDrivers().get(0); // Getting a driver
        // Driver picks up order
        System.out.println(driver.getName() + " is delivering the order from " + restaurant.getName() + " to " + customer.getName());
        // Driver delivers the order
        System.out.println(order + " delivered by " + driver.getName() + " at " + order.getOrderDeliveredTime());

        // Print some outputs to see the interactions
        System.out.println("Total registered customers: " + platform.getCustomers().size());
        System.out.println("Total registered drivers: " + platform.getDrivers().size());
        System.out.println("Total registered restaurants: " + platform.getRestaurants().size());
    }
}
