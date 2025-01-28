package datastructure.linkedlist.practiceproblem.studentrecordmanagement;

class LinkedList {

    static class Node {
        int rollNo;
        String name;
        int age;
        char grade;
        Node next;

        public Node(int rollNo, String name, int age, char grade) {
            this.rollNo = rollNo;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Add a node to the beginning of the list
    public void addFirst(int rollNo, String name, int age, char grade) {
        Node newNode = new Node(rollNo, name, age, grade);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Add a node to the end of the list
    public void addLast(int rollNo, String name, int age, char grade) {
        Node newNode = new Node(rollNo, name, age, grade);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Add a node at a specific index
    public void addSpecific(int index, int rollNo, String name, int age, char grade) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index. Please provide a valid index.");
            return;
        }
        if (index == 0) {
            addFirst(rollNo, name, age, grade);
            return;
        }
        Node newNode = new Node(rollNo, name, age, grade);
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
        size++;
    }

    // Remove the first node
    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty List. No nodes to remove.");
            return;
        }
        System.out.println("Deleted node: Roll No = " + head.rollNo +
                ", Name = " + head.name +
                ", Age = " + head.age +
                ", Grade = " + head.grade);
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    // Delete a node by roll number
    public void deleteByRollNo(int rollNo) {
        if (head == null) {
            System.out.println("Empty list. No nodes to delete.");
            return;
        }
        if (head.rollNo == rollNo) {
            removeFirst();
            return;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Deleted node: Roll No = " + temp.rollNo +
                        ", Name = " + temp.name +
                        ", Age = " + temp.age +
                        ", Grade = " + temp.grade);
                prev.next = temp.next;
                if (temp == tail) {
                    tail = prev;
                }
                size--;
                return;
            }
            prev = temp;
            temp = temp.next;
        }
        System.out.println("Roll No " + rollNo + " not found in the list.");
    }

    // Search for a student by roll number
    public void searchStudentByRollNo(int rollNo) {
        if (head == null) {
            System.out.println("Empty list. No students to search.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Student found: Roll No = " + temp.rollNo +
                        ", Name = " + temp.name +
                        ", Age = " + temp.age +
                        ", Grade = " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Roll No " + rollNo + " not found in the list.");
    }

    // Update the grade of a student by roll number
    public void updateGrade(int rollNo, char grade) {
        if (head == null) {
            System.out.println("Empty list. No students to update.");
            return;
        }

        Node temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = grade;
                System.out.println("Grade updated successfully for Roll No = " + temp.rollNo +
                        ". New Grade = " + temp.grade);
                found = true;
                break;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Roll No " + rollNo + " not found in the list.");
        }
    }



    // Print all nodes in the list
    public void print() {
        if (head == null) {
            System.out.println("Empty List.");
            return;
        }
        System.out.println("Student List:");
        Node temp = head;
        while (temp != null) {
            System.out.println("Roll No: " + temp.rollNo +
                    ", Name: " + temp.name +
                    ", Age: " + temp.age +
                    ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    // Get the size of the list
    public int getSize() {
        return size;
    }
}