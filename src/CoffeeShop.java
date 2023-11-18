import java.util.ArrayList;
import java.util.List;
// Observer pattern
class CoffeeShop {
    private final List<CoffeeObserver> customers = new ArrayList<>();
    private static CoffeeShop instance;

    private CoffeeShop() {
    }

    public static CoffeeShop getInstance() {
        if (instance == null) {
            instance = new CoffeeShop();
        }
        return instance;
    }

    public void addCustomer(CoffeeObserver customer) {
        customers.add(customer);
    }

    public void serveCoffee(Coffee coffee) {
        for (CoffeeObserver customer : customers) {
            customer.update(coffee.getDescription());
        }
    }
}
