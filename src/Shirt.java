public class Shirt {
  public int shirtID = 10;
  public String description = "-description required-";

  public char colorCode = 'K';
  public double price = 250.99;
  public int quantityInStock = 10;


  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  }
}
