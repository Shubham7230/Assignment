public class ProductInventory {
    // Instance variables
    private String productName;
    private double price;
    
    // Class variable
    private static int totalProducts = 0;
    
    // Constructor
    public ProductInventory(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment total products when a new product is created
    }
    
    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("----------------------");
    }
    
    // Class method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
    
    // Getter methods
    public String getProductName() {
        return productName;
    }
    
    public double getPrice() {
        return price;
    }
    
    public static int getTotalProducts() {
        return totalProducts;
    }
    
    // Main method to test the implementation
    public static void main(String[] args) {
        // Create some products
        ProductInventory product1 = new ProductInventory("Laptop", 999.99);
        ProductInventory product2 = new ProductInventory("Smartphone", 499.99);
        ProductInventory product3 = new ProductInventory("Headphones", 79.99);
        
        // Display individual product details
        System.out.println("Product Details:");
        System.out.println("==================");
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();
        
        // Display total number of products
        ProductInventory.displayTotalProducts();
        
        // Create one more product and show updated count
        ProductInventory product4 = new ProductInventory("Mouse", 29.99);
        System.out.println("\nAfter adding a new product:");
        product4.displayProductDetails();
        ProductInventory.displayTotalProducts();
        
        // Demonstrate getter methods
        System.out.println("\nUsing Getter Methods:");
        System.out.println("Product 1 Name: " + product1.getProductName());
        System.out.println("Product 2 Price: $" + product2.getPrice());
    }
}