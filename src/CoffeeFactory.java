// Factory pattern
class CoffeeFactory {
    public Coffee createCoffee(String type) {
        if ("Espresso".equalsIgnoreCase(type)) {
            return new Espresso();
        } else if ("Latte".equalsIgnoreCase(type)) {
            return new Latte();
        }
        return null;
    }
}