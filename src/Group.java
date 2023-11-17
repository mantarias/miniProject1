import java.util.ArrayList;

public class Group {
    private ArrayList<User> members;
    private int id;
    private String name;

    // constructor that takes in a list of users
    public Group(ArrayList<User> members, int id, String name) {
        this.members = members;
        this.id = id;
        this.name = name;
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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}