import java.util.ArrayList;

public class Group {
    private ArrayList<User> members;

    // constructor that takes in a list of users
    public Group(ArrayList<User> members) {
        this.members = members;
    }

    // add user to group
    public boolean addUser(User user) {
        if (members.contains(user)) {
            return false;
        }
        members.add(user);
        return true;
    }
    public ArrayList<User> getMembers() {
        return members;
    }

}