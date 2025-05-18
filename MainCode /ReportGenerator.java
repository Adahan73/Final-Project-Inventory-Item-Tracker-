import java.util.List;

public class ReportGenerator {
    public static void generateSummary(InventoryManager manager) {
        List<InventoryItem> items = manager.getAllItems();
        System.out.println("\n===== Inventory Summary =====");
        System.out.println("Total Items: " + manager.getTotalItems());

        double totalValue = 0;
        for (InventoryItem item : items) {
            totalValue += item.getPrice() * item.getQuantity();
        }

        System.out.printf("Total Inventory Value: $%.2f\n", totalValue);
        System.out.println("==============================\n");
    }
}
