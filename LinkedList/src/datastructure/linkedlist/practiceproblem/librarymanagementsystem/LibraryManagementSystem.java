package datastructure.linkedlist.practiceproblem.librarymanagementsystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        DoublyLinkedListLibraryManagementSystem library = new DoublyLinkedListLibraryManagementSystem();

        // Adding books
        library.addAtBeginning("Book1", "Pratham", "Genre1", 101, true);
        library.addAtEnd("Book2", "Suraj", "Genre2", 102, true);
        library.addAt(2, "Book3", "Vivek", "Genre3", 103, true);

        // Display all books in forward order
        library.displayForward();

        // Display all books in reverse order
        library.displayReverse();

        // Search for a book
        library.searchBook("1984");

        // Update availability
        library.updateAvailability(102, false);

        // Remove a book
        library.removeBook(101);

        // Display all books after removal
        library.displayForward();

        // Count total books
        System.out.println("Total Books: " + library.countBooks());
    }
}
