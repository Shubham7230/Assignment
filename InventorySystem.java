import java.util.Scanner;

class Item {
    private int itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: ₹" + price);
    }
}

public class InventorySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter item code: ");
        int code = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter price per unit: ");
        double price = scanner.nextDouble();
        
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        
        Item item = new Item(code, name, price);
        item.displayDetails();
        System.out.println("Total cost for " + quantity + " units: ₹" + item.calculateTotalCost(quantity));
        
        scanner.close();
    }
}