//Student Record Management
//Problem Statement: Create a program to manage student records using a singly linked list.
// Each node will store information about a student, including their Roll Number,
// Name, Age, and Grade. Implement the following operations:
//Add a new student record at the beginning, end, or at a specific position.
//Delete a student record by Roll Number.
//        Search for a student record by Roll Number.
//Display all student records.
//Update a student's grade based on their Roll Number.
//Hint:
//Use a singly linked list where each node contains student information and a pointer to the next node.
//The head of the list will represent the first student, and the last node’s next pointer will be null.
//Update the next pointers when inserting or deleting nodes.

package datastructure.linkedlist.practiceproblem.studentrecordmanagement;

import datastructure.linkedlist.practiceproblem.studentrecordmanagement.LinkedList;

public class StudentRecordManagement {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        // Adding students
        System.out.println("Adding students...");
        ll.addFirst(101, "Vivek", 21, 'A');
        ll.addLast(102, "Suraj", 22, 'B');
        ll.addLast(103, "Pratham", 20, 'A');
        ll.addSpecific(1, 104, "Vinay", 23, 'B');
        ll.print();
        System.out.println("Total students: " + ll.getSize());

        // Searching for a student
        System.out.println("\nSearching for a student with roll number 102...");
        ll.searchStudentByRollNo(102);

        // Deleting a student by roll number
        System.out.println("\nDeleting student with roll number 104...");
        ll.deleteByRollNo(104);
        ll.print();
        System.out.println("Total students: " + ll.getSize());

        // Removing the first student
        System.out.println("\nRemoving the first student...");
        ll.removeFirst();
        ll.print();
        System.out.println("Total students: " + ll.getSize());

        // Deleting a student not in the list
        System.out.println("\nAttempting to delete a non-existent student (Roll No: 105)...");
        ll.deleteByRollNo(105);

        // Final list
        System.out.println("\nFinal list of students:");
        ll.print();

        // Updating a student's grade
        System.out.println("\nUpdating grade for Roll No 102...");
        ll.updateGrade(102, 'A');

        System.out.println("\nTrying to update grade for a non-existent Roll No 105...");
        ll.updateGrade(105, 'B');

        // Printing the updated list
        System.out.println("\nUpdated list of students:");
        ll.print();

    }
}
