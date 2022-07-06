//Product
//ICS4U1, Dip Tandel
//Nov 16, 2021

public class Product {
  //Instance Variables
  private String name;
  private double price;
  private Boolean diet;
  private int calories;
  private int amount; //in fl oz

  //Default Constructor
  public Product() {
    name = "Coke";
    price = 2.49;
    diet = false;
    calories = 130;
    amount = 12;
  }

  //Constructor
  public Product(
    String namee,
    double pricee,
    Boolean diett,
    int caloriess,
    int amountt
  ) {
    name = namee;
    price = pricee;
    diet = diett;
    calories = caloriess;
    amount = amountt;
  }

  //Accessors
  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public Boolean getDiet() {
    return diet;
  }

  public int getCalories() {
    return calories;
  }

  public int getAmount() {
    return amount;
  }

  //toString
  public String toString() {
    String dietOrNot = "";
    if (diet == true) {
      dietOrNot = " Diet";
    }
    return (
      "$" +
      price +
      " can of" +
      dietOrNot +
      " " +
      name +
      ". It contains " +
      amount +
      " fl oz " +
      "and " +
      calories +
      " calories."
    );
  }

  //Mutators
  public void setName(String abc) {
    name = abc;
  }

  public void setPrice(double x) {
    price = x;
  }

  public void setDiet(Boolean y) {
    diet = y;
  }

  public void setCalories(int j) {
    calories = j;
  }

  public void setAmount(int k) {
    amount = k;
  }

  //compare calories
  public void compareCalories(Product other) {
    if (other.getCalories() > calories) {
      System.out.println(other.getName() + " has more calories");
    } else if (other.getCalories() > calories) {
      System.out.println(calories + " has more calories");
    } else {
      System.out.println("They have the same amount of calories");
    }
  }
}
