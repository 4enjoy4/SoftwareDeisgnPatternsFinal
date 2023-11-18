// Observer pattern
class Customer implements CoffeeObserver {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String coffeeName) {
        System.out.println(name + " received " + coffeeName);
    }
}
