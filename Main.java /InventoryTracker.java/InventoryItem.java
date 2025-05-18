public class InventoryTracker {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        boolean running = true;

        while (running) {
            System.out.println("\n=== Inventory Tracker ===");
            System.out.println("1. Add Item");
            System.out.println("2. View All Items");
            System.out.println("3. Update Item");
            System.out.println("4. Delete Item");
            System.out.println("5. Generate Report");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            String choice = Utils.scanner.nextLine();
            switch (choice) {
                case "1":
                    String id = Utils.readNonEmptyString("Enter item ID: ");
                    String name = Utils.readNonEmptyString("Enter item name: ");
                    int qty = Utils.readInt("Enter quantity: ");
                    double price = Utils.readDouble("Enter price: ");
                    manager.addItem(new InventoryItem(id, name, qty, price));
                    System.out.println("Item added!");
                    break;

                case "2":
                    for (InventoryItem item : manager.getAllItems()) {
                        System.out.println(item);
                    }
                    break;

                case "3":
                    id = Utils.readNonEmptyString("Enter item ID to update: ");
                    InventoryItem item = manager.getItem(id);
                    if (item == null) {
                        System.out.println("Item not found.");
                        break;
                    }
                    name = Utils.readNonEmptyString("Enter new name: ");
                    qty = Utils.readInt("Enter new quantity: ");
                    price = Utils.readDouble("Enter new price: ");
                    manager.updateItem(id, name, qty, price);
                    System.out.println("Item updated!");
                    break;

                case "4":
                    id = Utils.readNonEmptyString("Enter item ID to delete: ");
                    manager.deleteItem(id);
                    System.out.println("Item deleted.");
                    break;

                case "5":
                    ReportGenerator.generateSummary(manager);
                    break;

                case "0":
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
