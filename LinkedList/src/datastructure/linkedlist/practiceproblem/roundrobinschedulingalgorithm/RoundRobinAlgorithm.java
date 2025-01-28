package datastructure.linkedlist.practiceproblem.roundrobinschedulingalgorithm;

public class RoundRobinAlgorithm {
    public static void main(String[] args) {
        CircularLinkedListRoundRobinSchedulingAlgorithm scheduler = new CircularLinkedListRoundRobinSchedulingAlgorithm();

        // Adding processes to the queue
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);

        // Display processes
        scheduler.displayProcesses();

        // Simulate round-robin scheduling with time quantum of 4
        System.out.println("\nSimulating Round Robin Scheduling:");
        scheduler.simulateRoundRobin(4);

        // Display remaining processes (if any)
        System.out.println("\nRemaining Processes in the Queue:");
        scheduler.displayProcesses();
    }
}
