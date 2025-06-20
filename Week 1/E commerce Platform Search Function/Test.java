public class Test {
    public static void main(String[] args) {
        // Create sample products
        Product[] products = {
            new Product("P100", "Laptop", "Electronics"),
            new Product("P200", "Smartphone", "Electronics"),
            new Product("P300", "Desk Chair", "Furniture"),
            new Product("P400", "Coffee Maker", "Appliances"),
            new Product("P500", "Headphones", "Electronics")
        };
        
        // Linear search test
        System.out.println("=== Linear Search ===");
        
        long startTime = System.nanoTime();
        Product found = LinearSearch.searchById(products, "P300");
        long endTime = System.nanoTime();
        
        System.out.println("Found: " + found);
        System.out.println("Time taken: " + (endTime - startTime) + " ns");
        
        // Binary search test
        System.out.println("\n=== Binary Search ===");
        
        startTime = System.nanoTime();
        found = BinarySearch.searchById(products, "P300");
        endTime = System.nanoTime();
        
        System.out.println("Found: " + found);
        System.out.println("Time taken: " + (endTime - startTime) + " ns");
    }
}