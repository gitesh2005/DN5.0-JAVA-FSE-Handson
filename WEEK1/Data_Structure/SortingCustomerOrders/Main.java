package WEEK1.Data_Structure.SortingCustomerOrders;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order(1, "John", 2500),
                new Order(2, "Alice", 1500),
                new Order(3, "Bob", 4500),
                new Order(4, "David", 3000),
                new Order(5, "Mary", 1000)
        };

        System.out.println("Original Orders:");
        SortingAlgorithms.displayOrders(orders);

        SortingAlgorithms.bubbleSort(orders);

        System.out.println("Orders After Bubble Sort:");
        SortingAlgorithms.displayOrders(orders);

        Order[] orders2 = {
                new Order(1, "John", 2500),
                new Order(2, "Alice", 1500),
                new Order(3, "Bob", 4500),
                new Order(4, "David", 3000),
                new Order(5, "Mary", 1000)
        };

        SortingAlgorithms.quickSort(orders2, 0, orders2.length - 1);

        System.out.println("Orders After Quick Sort:");
        SortingAlgorithms.displayOrders(orders2);
    }
}