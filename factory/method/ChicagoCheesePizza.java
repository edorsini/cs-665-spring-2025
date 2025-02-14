package patterns.factory.method;

public class ChicagoCheesePizza implements Pizza {
    public ChicagoCheesePizza() {

    }

    @Override
    public void prepare() {
        System.out.println("prepares Chicago Cheese Pizza...");
    }

    @Override
    public void cook() {
        System.out.println("cooks Chicago Cheese Pizza...");
    }
}
