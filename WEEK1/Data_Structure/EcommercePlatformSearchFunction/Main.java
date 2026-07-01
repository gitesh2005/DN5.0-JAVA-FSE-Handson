package WEEK1.Data_Structure.EcommercePlatformSearchFunction;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Accessories"),
                new Product(103, "Keyboard", "Accessories"),
                new Product(104, "Mobile Phone", "Electronics"),
                new Product(105, "Shoes", "Fashion")
        };

        System.out.println("Linear Search:");
        Product result1 = SearchAlgorithms.linearSearch(products, 104);

        if (result1 != null) {
            result1.displayProduct();
        } else {
            System.out.println("Product not found.");
        }

        System.out.println("Binary Search:");
        Product result2 = SearchAlgorithms.binarySearch(products, 103);

        if (result2 != null) {
            result2.displayProduct();
        } else {
            System.out.println("Product not found.");
        }
    }
}