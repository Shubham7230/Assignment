import java.util.Scanner;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int additionalQuantity) {
        quantity += additionalQuantity;
        System.out.println("Added " + additionalQuantity + " more " + itemName);
    }

    public void removeItem(int removeQuantity) {
        if (removeQuantity <= quantity) {
            quantity -= removeQuantity;
            System.out.println("Removed " + removeQuantity + " " + itemName);
        } else {
            System.out.println("Cannot remove more than available quantity!");
        }
    }

    public double calculateTotalCost() {
        return price * quantity;
    }

    public void displayItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: ₹" + calculateTotalCost());
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        CartItem item = new CartItem("Laptop", 55000, 1);
        
        while (true) {
            System.out.println("\n1. Add more items");
            System.out.println("2. Remove items");
            System.out.println("3. View cart");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter quantity to add: ");
                    int addQty = scanner.nextInt();
                    item.addItem(addQty);
                    break;
                    
                case 2:
                    System.out.print("Enter quantity to remove: ");
                    int removeQty = scanner.nextInt();
                    item.removeItem(removeQty);
                    break;
                    
                case 3:
                    item.displayItemDetails();
                    break;
                    
                case 4:
                    System.out.println("Final total: ₹" + item.calculateTotalCost());
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}