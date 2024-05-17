import java.util.ArrayList;
import java.util.List;

public class OrderManager implements Observable {
    private List<Order> orders;
    private List<Observer> observers;

    public OrderManager() {
        orders = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void createOrder(Order order) {
        orders.add(order);
        notifyObservers(order);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Order order) {
        for (Observer observer : observers) {
            observer.update(order);
        }
    }
}




