# Final Project - Inventory Item Tracker

## 👤 Student: Adakhan Begimkulov

## 📌 Description
The **Inventory Item Tracker** is a Java-based command-line application that allows users to efficiently manage a collection of inventory items. This application provides full CRUD (Create, Read, Update, Delete) functionality and stores all data in a readable CSV file for persistence between sessions.

## 🎯 Objectives
- Implement a user-friendly inventory management system via the command-line interface.
- Enable users to add, view, update, and delete inventory items.
- Ensure data is persistently stored in a human-readable format (`data.csv`) using CSV serialization.
- Validate user input to prevent incorrect or empty values.
- Provide summary reports, such as total number of items and total inventory value.
- Design the program in a modular, maintainable, and readable way using object-oriented principles.
- Handle errors gracefully to avoid crashes during unexpected input or file issues.

## ✅ Requirements

1. **CRUD Functionality**  
   Implement Create, Read, Update, and Delete operations for inventory items.

2. **Command-Line Interface (CLI)**  
   Provide a simple and clear menu-driven interface for user interaction through the terminal.

3. **Input Validation**  
   Prevent empty inputs and ensure numeric fields (e.g., quantity, price) are valid.

4. **Data Persistence**  
   Save and load inventory data to and from a `data.txt` file to preserve changes between sessions.

5. **Readable Data Format**  
   Store data in txt format to allow external viewing and editing.

6. **Item Identification**  
   Each inventory item must have a unique ID to differentiate it from others.

7. **Summary Report Generation**  
   Generate a report displaying total number of items and total inventory value.

8. **Error Handling**  
   Gracefully handle file I/O errors, invalid inputs, and operations on non-existent items.

9. **Modular Design**  
   Divide the code into logical, reusable classes (e.g., `InventoryItem`, `InventoryManager`, `ReportGenerator`, `Utils`).

10. **Documentation**  
    Include clear in-code comments and a `README.md` file explaining the project structure, functionality, and usage instructions.


## 📚 Documentation

### 🔧 Data Structures
- **HashMap<String, InventoryItem>**  
  Used to store and quickly access inventory items by their unique ID.

- **ArrayList<InventoryItem>**  
  Used when displaying all items or generating reports.

- **Plain Text File (`data.txt`)**  
  All data is saved in a text file, one item per line, with fields separated by the `|` character.

### 🧠 Algorithms & Logic
- **CRUD Operations**  
  The program uses a menu-based interface allowing the user to create, read, update, and delete items.

- **TXT Serialization and Deserialization**  
  - When saving, each object is converted into a string in the format: `ID|Name|Quantity|Price`
  - When loading, each line is split using `split("\\|")` and converted back into an `InventoryItem` object.

- **Input Validation**  
  Custom methods ensure that no field is empty and that numeric fields like quantity and price are valid numbers.

- **Report Generation**  
  Iterates through all inventory items to calculate the total number of items and the total inventory value.

### 🧩 Classes / Modules
- **InventoryItem.java**  
  Represents a single inventory item, with methods to convert to and from text format.

- **InventoryManager.java**  
  Handles all inventory-related logic: add, update, delete, load, and save.

- **ReportGenerator.java**  
  Generates and displays summary statistics based on current inventory data.

- **Utils.java**  
  Contains utility functions for input reading and validation.

- **InventoryTracker.java**  
  The main class that presents the menu and controls the application flow.

### ⚠️ Challenges Faced
- **Data Storage Format**  
  Plain text (TXT) was chosen for easy readability and manual editing outside the program.

- **Error Handling**  
  Exception handling was implemented to keep the program stable during invalid input or file errors.

- **Project Structure**  
  To ensure code clarity and reusability, the logic was separated into modular classes.

- **Ensuring Unique IDs**  
  The application requires manual entry of unique IDs for each item — which could be improved in the future.


