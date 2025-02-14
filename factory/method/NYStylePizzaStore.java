package patterns.factory.method;

public class NYStylePizzaStore extends PizzaStore {
  @Override
  public Pizza createPizza(String type) { // Factory
    System.out.print("creates pizza NY style \n");

    if (type.equals("cheese")) {
      return new NYCheesePizza();
    } else {
      return null;
    }

  }
}
