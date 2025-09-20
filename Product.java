public class Product {
    private static double discount = 0.0;
    
    private final String productID;
    private String productName;
    private double price;
    private int quantity;
    
    public Product(String productName, String productID, double price, int quantity) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }
    
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
    
    public static double getDiscount() {
        return discount;
    }
    
    public void displayProductDetails() {
        double discountedPrice = price * (1 - discount / 100);
        System.out.println("Product: " + productName);
        System.out.println("ID: " + productID);
        System.out.println("Original Price: $" + price);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Discounted Price: $" + discountedPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: $" + (discountedPrice * quantity));
        System.out.println("----------------------");
    }
    
    public String getProductID() {
        return productID;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public static void processIfProduct(Object obj) {
        if (obj instanceof Product) {
            Product product = (Product) obj;
            product.displayProductDetails();
        } else {
            System.out.println("Error: The provided object is not a Product instance");
        }
    }
    
    public static void main(String[] args) {
        Product.updateDiscount(15.0);
        
        Product product1 = new Product("Laptop", "PROD001", 999.99, 2);
        Product product2 = new Product("Smartphone", "PROD002", 499.99, 3);
        Product product3 = new Product("Headphones", "PROD003", 79.99, 5);
        
        System.out.println("Current Discount: " + Product.getDiscount() + "%");
        System.out.println("Processing products with instanceof check:");
        
        Product.processIfProduct(product1);
        Product.processIfProduct(product2);
        
        Double testObject = 123.45;
        Product.processIfProduct(testObject);
        
        Product.updateDiscount(20.0);
        System.out.println("Updated Discount: " + Product.getDiscount() + "%");
        Product.processIfProduct(product3);
        
        System.out.println("Product 1 ID: " + product1.getProductID());
        System.out.println("Product 2 Name: " + product2.getProductName());
        System.out.println("Product 3 Price: $" + product3.getPrice());
    }
}