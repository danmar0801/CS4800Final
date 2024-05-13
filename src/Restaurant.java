public class Restaurant extends User {
    private String cuisineType;
    private String operatingHours;
    private Menu menu;

    public Restaurant(String name, String address, String county, String cuisineType, String operatingHours, Menu menu) {
        super(name, address, county);
        this.cuisineType = cuisineType;
        this.operatingHours = operatingHours;
        this.menu = menu;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public String getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(String operatingHours) {
        this.operatingHours = operatingHours;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}

