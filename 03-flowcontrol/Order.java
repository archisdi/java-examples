public class Order {
  boolean isFilled;
  double billAmount;
  String shipping;

  public Order(boolean filled, double cost, String shippingMethod) {
    if (cost > 24.00) {
      System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }

  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
      System.out.println("Shipping cost: " + calculateShipping());
    } else {
      System.out.println("Order not ready");
    }
  }

  public double calculateShipping() {
    // declare conditional statement here
    if (shipping.equals("Regular")) {
      return 0;
    } else if (shipping.equals("Express")) {
      return 1.75;
    } else {
      return 0.50;
    }
  }

  public double calculateShipping2() {
    double shippingCost;
    // declare switch statement here
    switch (shipping) {
    case "Express":
      shippingCost = 1.75;
      break;
    case "Regular":
      shippingCost = 0;
      break;
    default:
      shippingCost = 0.50;
      break;
    }

    return shippingCost;
  }

  public static void main(String[] args) {
    // do not alter the main method!
    Order book = new Order(true, 9.99, "Express");
    Order chemistrySet = new Order(false, 72.50, "Regular");

    book.ship();
    chemistrySet.ship();
  }
}
