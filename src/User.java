import java.util.ArrayList;

public class User {
    private String name;
    private String role;
    private int id;

    // list of enroles courses
    private ArrayList<Course> courses;

    public User(String name, String role, int id) {
        this.name = name;
        this.role = role;
        this.courses = new ArrayList<Course>();
        this.id = id;
    }

    // getters
    public String getName() {
        return this.name;
    }

    public String getRole() {
        return this.role;
    }

    public int getId() {
        return this.id;
    }

    public ArrayList<Course> getCourses() {
        return this.courses;
    }

    // setters

    public void setName(String name) {
        this.name = name;
    }

    public boolean addCourse(Course course) {
        if (this.courses.contains(course)) {
            return false;
        }

        this.courses.add(course);
        return true;
    }

}
