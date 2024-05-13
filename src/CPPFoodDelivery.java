import java.util.ArrayList;
import java.util.List;

public class CPPFoodDelivery {
    private static CPPFoodDelivery instance;
    private List<Customer> customers = new ArrayList<>();
    private List<Driver> drivers = new ArrayList<>();
    private List<Restaurant> restaurants = new ArrayList<>();

    private CPPFoodDelivery() { }

    public static CPPFoodDelivery getInstance() {
        if (instance == null) {
            synchronized (CPPFoodDelivery.class) {
                if (instance == null) {
                    instance = new CPPFoodDelivery();
                }
            }
        }
        return instance;
    }

    public void registerUser(User user) {
        if (user instanceof Customer) {
            customers.add((Customer) user);
        } else if (user instanceof Driver) {
            drivers.add((Driver) user);
        } else if (user instanceof Restaurant) {
            restaurants.add((Restaurant) user);
        }
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}

