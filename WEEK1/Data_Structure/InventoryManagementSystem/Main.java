package WEEK1.Data_Structure.InventoryManagementSystem;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product product1 = new Product(101, "Laptop", 10, 75000);
        Product product2 = new Product(102, "Mouse", 50, 500);
        Product product3 = new Product(103, "Keyboard", 30, 1200);

        manager.addProduct(product1);
        manager.addProduct(product2);
        manager.addProduct(product3);

        System.out.println("\nInventory List:");
        manager.displayInventory();

        manager.updateProduct(101, "Gaming Laptop", 8, 95000);

        manager.deleteProduct(102);

        System.out.println("\nUpdated Inventory List:");
        manager.displayInventory();
    }
}