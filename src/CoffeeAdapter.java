// Adapter pattern
class CoffeeAdapter {
    private final CoffeeFactory coffeeFactory;

    public CoffeeAdapter(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee makeCoffee(String type) {
        return coffeeFactory.createCoffee(type);
    }
}
