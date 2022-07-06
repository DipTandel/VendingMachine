class MainMACHINE {

  public static void main(String[] args) {
    Product p1 = new Product("Sprite", 1.99, false, 180, 12);
    Product p2 = new Product("Pepsi", 1.99, false, 180, 12);
    Product p3 = new Product("Diet Coke", 1.99, true, 180, 12);
    Product p4 = new Product("Iced Tea", 1.99, false, 180, 12);
    Product p5 = new Product("Coke Zero", 1.99, false, 180, 12);
    Product p6 = new Product("Diet Pepsi", 1.99, true, 180, 12);
    Product p7 = new Product("Mountain Dew", 1.99, false, 180, 12);
    Product p8 = new Product("Crush", 1.99, false, 180, 12);
    Product p9 = new Product("Root Beer", 1.99, false, 180, 12);
    Product p10 = new Product("Dr Pepper", 1.99, false, 180, 12);
    Product p11 = new Product("Lemonade", 1.99, false, 180, 12);
    Product p12 = new Product("Water", 1.99, false, 180, 12);

    VendingMachine v = new VendingMachine(
      p1,
      p2,
      p3,
      p4,
      p5,
      p6,
      p7,
      p8,
      p9,
      p10,
      p11,
      p12
    );

    System.out.println(v);
  }
}
