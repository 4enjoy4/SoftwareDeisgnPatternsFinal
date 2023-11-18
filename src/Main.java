public class Main {
    public static void main(String[] args) {
        // Create a CoffeeFactory (Factory Pattern)
        CoffeeFactory factory = new CoffeeFactory();

        // Create a CoffeeAdapter to adapt the CoffeeFactory (Adapter Pattern)
        CoffeeAdapter adapter = new CoffeeAdapter(factory);

        // Create an Espresso coffee (Strategy Pattern)
        Coffee espresso = adapter.makeCoffee("Espresso");

        // Create a Latte coffee with Milk and Sugar (Decorator Pattern)
        Coffee latteWithMilkAndSugar = new SugarDecorator(new MilkDecorator(adapter.makeCoffee("Latte")));

        // Create a CoffeeShop (Singleton Pattern)
        CoffeeShop coffeeShop = CoffeeShop.getInstance();

        // Create two Customers (Observer Pattern)
        Customer customer1 = new Customer("Customer 1");
        Customer customer2 = new Customer("Customer 2");

        // Register customers with the CoffeeShop
        coffeeShop.addCustomer(customer1);
        coffeeShop.addCustomer(customer2);

        // Serve Espresso to customers
        coffeeShop.serveCoffee(espresso);

        // Serve Latte with Milk and Sugar to customers
        coffeeShop.serveCoffee(latteWithMilkAndSugar);
    }
}