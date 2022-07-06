//VendingMachine
//ICS4U1, Dip Tandel
//Nov 16, 2021
import java.util.ArrayList;

public class VendingMachine {
  ArrayList<Product> drinks = new ArrayList<Product>();
  private ArrayList<Integer> amount = new ArrayList<Integer>();

  public VendingMachine(
    Product p1,
    Product p2,
    Product p3,
    Product p4,
    Product p5,
    Product p6,
    Product p7,
    Product p8,
    Product p9,
    Product p10,
    Product p11,
    Product p12
  ) {
    drinks.add(p1);
    drinks.add(p2);
    drinks.add(p3);
    drinks.add(p4);
    drinks.add(p5);
    drinks.add(p6);
    drinks.add(p7);
    drinks.add(p8);
    drinks.add(p9);
    drinks.add(p10);
    drinks.add(p11);
    drinks.add(p12);
    for (int i = 0; i < 12; i++) {
      amount.add(i, 5);
    }
  }

  public String toString() {
    String vm = "";
    for (int i = 0; i < 12; i++) {
      vm = vm + (drinks.get(i)).getName() + " " + amount.get(i) + ", ";
    }
    return vm;
  }
}
