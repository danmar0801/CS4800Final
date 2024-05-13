public class Customer extends User {
    private String dietaryRestrictions;

    public Customer(String name, String address, String county, String dietaryRestrictions) {
        super(name, address, county);
        this.dietaryRestrictions = dietaryRestrictions;
    }

    public String getDietaryRestrictions() {
        return dietaryRestrictions;
    }

    public void setDietaryRestrictions(String dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions;
    }
}

