package datastructure.linkedlist.practiceproblem.socialmediafriendsconnections;

public class SocialMediaFriendsConnections {
    public static void main(String[] args) {
        SinglyLinkedListSocialMediaFriendConnections smfc = new SinglyLinkedListSocialMediaFriendConnections();

        // Adding users
        smfc.addUser(1, "Pratham", 25);
        smfc.addUser(2, "Vivek", 30);
        smfc.addUser(3, "Suraj", 28);

        // Adding friend connections
        smfc.addFriendConnection(1, 2);
        smfc.addFriendConnection(1, 3);

        // Display friends of a user
        smfc.displayFriends(1);

        // Finding mutual friends
        smfc.findMutualFriends(2, 3);

        // Count friends for each user
        smfc.countFriends();

        // Search user by name
        smfc.searchUserByName("Pratham");

        // Removing a friend connection
        smfc.removeFriendConnection(1, 2);

        // Display friends after removal
        smfc.displayFriends(1);
    }
}
