import java.util.ArrayList;

public class Course {
    // list of groups
    private String name;
    private ArrayList<Group> groups;

    // list of students
    private ArrayList<User> students;

    // constructor
    public Course(String name) {
        this.name = name;
        this.groups = new ArrayList<Group>();
        this.students = new ArrayList<User>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Group> getGroups() {
        return this.groups;
    }
    
    /**
     * 
     * @param group group you are trying to add
     * @return true if success else false
     * 
     */
    public boolean addGroup(Group group) {
        // if this group is not already in the list of groups
        if (!this.groups.contains(group)) {
            // loop through the list of groups
            for (Group tempGroup : groups) {
                // loop through the list of members in the group
                for (User student : tempGroup.getMembers()) {
                    // if the student is already in another group group
                    if (group.getMembers().contains(student)) {
                        return false;
                    }
                }
            }
            // add the group to the list of groups
            this.groups.add(group);
            return true;
        }
        return false;
    }

}
