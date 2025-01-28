package datastructure.linkedlist.practiceproblem.inventorymanagementsystem;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        SinglyLinkedList ims = new SinglyLinkedList();
        // Adding items to the inventory
        ims.addAtBeginning("Iphone 16 Pro Max", 10, 2, 120000);
        ims.addAtBeginning("Samsung S25 Ultra", 11, 1, 140000);
        ims.addAtEnd("Motorola Q28", 12, 1, 70000);
        ims.addAt(2, "Samsung Galaxy", 24, 1, 90000);

        // Displaying all records
        System.out.println("------ All Items in Inventory --------");
        ims.displayAll();

        // Removing an item
        ims.removeItem(11);

        // Updating quantity of an item
        ims.updateQuantity(10, 3);

        // Calculating total inventory value
        System.out.println("Total Inventory Value: " + ims.totalInventoryValue());

        // Displaying updated records
        System.out.println("------ Updated Inventory --------");
        ims.displayAll();
    }
}
