import java.io.*;
import java.util.*;

public class InventoryManager {
    private final Map<String, InventoryItem> items = new HashMap<>();
    private final String filePath = "data.txt";

    public InventoryManager() {
        loadItems();
    }

    public void addItem(InventoryItem item) {
        items.put(item.getId(), item);
        saveItems();
    }

    public void updateItem(String id, String name, int qty, double price) {
        InventoryItem item = items.get(id);
        if (item != null) {
            item.setName(name);
            item.setQuantity(qty);
            item.setPrice(price);
            saveItems();
        }
    }

    public void deleteItem(String id) {
        items.remove(id);
        saveItems();
    }

    public InventoryItem getItem(String id) {
        return items.get(id);
    }

    public List<InventoryItem> getAllItems() {
        return new ArrayList<>(items.values());
    }

    private void loadItems() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
            Object obj = in.readObject();
            if (obj instanceof Map) {
                items.putAll((Map<String, InventoryItem>) obj);
            }
        } catch (Exception e) {
            System.out.println("No previous data found.");
        }
    }

    private void saveItems() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            out.writeObject(items);
        } catch (IOException e) {
            System.err.println("Error saving data.");
        }
    }

    public int getTotalItems() {
        return items.size();
    }
}
