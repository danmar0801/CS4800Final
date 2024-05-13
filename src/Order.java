import java.util.List;

public class Order {
    private Restaurant restaurant;
    private Customer customer;
    private String dietaryRestriction;
    private List<Meal> orderedMeals;
    private Driver driver;
    private String orderCreationTime;
    private String orderPickupTime;
    private String orderDeliveredTime;

    public Order(Restaurant restaurant, Customer customer, String dietaryRestriction, List<Meal> orderedMeals, Driver driver, String orderCreationTime, String orderPickupTime, String orderDeliveredTime) {
        this.restaurant = restaurant;
        this.customer = customer;
        this.dietaryRestriction = dietaryRestriction;
        this.orderedMeals = orderedMeals;
        this.driver = driver;
        this.orderCreationTime = orderCreationTime;
        this.orderPickupTime = orderPickupTime;
        this.orderDeliveredTime = orderDeliveredTime;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getDietaryRestriction() {
        return dietaryRestriction;
    }

    public List<Meal> getOrderedMeals() {
        return orderedMeals;
    }

    public Driver getDriver() {
        return driver;
    }

    public String getOrderCreationTime() {
        return orderCreationTime;
    }

    public void setOrderCreationTime(String orderCreationTime) {
        this.orderCreationTime = orderCreationTime;
    }

    public String getOrderPickupTime() {
        return orderPickupTime;
    }

    public void setOrderPickupTime(String orderPickupTime) {
        this.orderPickupTime = orderPickupTime;
    }

    public String getOrderDeliveredTime() {
        return orderDeliveredTime;
    }

    public void setOrderDeliveredTime(String orderDeliveredTime) {
        this.orderDeliveredTime = orderDeliveredTime;
    }
}

