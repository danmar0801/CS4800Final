public class Meal {
    private String name;
    private String description;
    private int calories; // Total caloric content of the meal
    private double fats;  // Fats in grams
    private double carbs; // Carbohydrates in grams
    private double proteins; // Proteins in grams

    public Meal(String name, String description, int calories, double fats, double carbs, double proteins) {
        this.name = name;
        this.description = description;
        this.calories = calories;
        this.fats = fats;
        this.carbs = carbs;
        this.proteins = proteins;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getFats() {
        return fats;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public double getCarbs() {
        return carbs;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    public double getProteins() {
        return proteins;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }
}


