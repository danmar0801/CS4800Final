import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Meal> meals;

    public Menu() {
        meals = new ArrayList<>();
    }

    public void addMeal(Meal meal) {
        meals.add(meal);
    }

    public List<Meal> getMeals() {
        return meals;
    }
}

