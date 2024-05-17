public class Main {
    public static void main(String[] args) {
        // Get the singleton instance of the platform
        CPPFoodDelivery platform = CPPFoodDelivery.getInstance();

        // Create factories
        UserFactory customerFactory = new CustomerFactory();
        UserFactory driverFactory = new DriverFactory();
        UserFactory restaurantFactory = new RestaurantFactory();

        // Create and register Restaurants
        platform.registerUser(restaurantFactory.createUser("Taco Bell", "123 Taco St", "LA County"));
        platform.registerUser(restaurantFactory.createUser("Thai Spice", "456 Pad Thai Ave", "Orange County"));
        platform.registerUser(restaurantFactory.createUser("Pizza Place", "789 Pizza Rd", "San Bernardino County"));
        platform.registerUser(restaurantFactory.createUser("Sushi Boat", "321 Sushi Blvd", "LA County"));

        // Create and register Drivers
        platform.registerUser(driverFactory.createUser("John Doe", "100 Main St", "LA County"));
        platform.registerUser(driverFactory.createUser("Jane Smith", "200 Second St", "Orange County"));
        platform.registerUser(driverFactory.createUser("Mike Brown", "300 Third St", "San Bernardino County"));
        platform.registerUser(driverFactory.createUser("Sarah Lee", "400 Fourth St", "LA County"));
        platform.registerUser(driverFactory.createUser("Chris Johnson", "500 Fifth St", "Orange County"));
        platform.registerUser(driverFactory.createUser("Emily Davis", "600 Sixth St", "San Bernardino County"));
        platform.registerUser(driverFactory.createUser("David Wilson", "700 Seventh St", "LA County"));
        platform.registerUser(driverFactory.createUser("Laura Martinez", "800 Eighth St", "Orange County"));

        // Create and register Customers
        platform.registerUser(customerFactory.createUser("Alice Johnson", "111 Fourth St", "LA County"));
        platform.registerUser(customerFactory.createUser("Bob White", "222 Fifth St", "Orange County"));
        platform.registerUser(customerFactory.createUser("Charlie Green", "333 Sixth St", "San Bernardino County"));
        platform.registerUser(customerFactory.createUser("Daisy Brown", "444 Seventh St", "LA County"));
        platform.registerUser(customerFactory.createUser("Evan Black", "555 Eighth St", "Orange County"));
        platform.registerUser(customerFactory.createUser("Fiona Clark", "666 Ninth St", "San Bernardino County"));
        platform.registerUser(customerFactory.createUser("George Harris", "777 Tenth St", "LA County"));
        platform.registerUser(customerFactory.createUser("Hannah Scott", "888 Eleventh St", "Orange County"));
        platform.registerUser(customerFactory.createUser("Ian Adams", "999 Twelfth St", "San Bernardino County"));
        platform.registerUser(customerFactory.createUser("Julia Baker", "1010 Thirteenth St", "LA County"));

        // Create an order manager and register drivers as observers
        OrderManager orderManager = new OrderManager();
        for (Driver driver : platform.getDrivers()) {
            orderManager.addObserver(driver);
        }

        // Simulate a customer ordering
        Customer customer = platform.getCustomers().get(0); // Getting the first customer
        Restaurant restaurant = platform.getRestaurants().get(0); // Getting the first restaurant
        Meal meal = new Meal("Burrito", "Delicious Mexican burrito", 500, 18.0, 50.0, 25.0);
        restaurant.getMenu().addMeal(meal);

        Order order = new Order(restaurant, customer, "No restrictions", restaurant.getMenu().getMeals(), null, "1st shift", null, null);
        orderManager.createOrder(order);

        // Assign a driver and simulate order pickup and delivery
        Driver assignedDriver = platform.getDrivers().get(0); // Assume the first driver is assigned
        order.setDriver(assignedDriver);
        order.setOrderPickupTime("12:00 PM");
        System.out.println("Order picked up by: " + assignedDriver.getName() + " at " + order.getOrderPickupTime());

        // Simulate delivery
        order.setOrderDeliveredTime("12:30 PM");
        System.out.println("Order delivered by: " + assignedDriver.getName() + " at " + order.getOrderDeliveredTime());

        // Print some outputs to see the interactions
        System.out.println("Total registered customers: " + platform.getCustomers().size());
        System.out.println("Total registered drivers: " + platform.getDrivers().size());
        System.out.println("Total registered restaurants: " + platform.getRestaurants().size());
    }
}




