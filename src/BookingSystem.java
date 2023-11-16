import java.util.ArrayList;
import java.util.Scanner;

/**
 * BookingSystem
 */
public class BookingSystem {
    private ArrayList<User> users;
    private ArrayList<Room> rooms;
    private ArrayList<Course> courses;
    private ArrayList<Group> groups;

    public BookingSystem() {
        users = new ArrayList<User>();
        users.add(new User("admin", "admin", users.size() + 1));
        users.add(new User("carl", "student", users.size() + 1));
        users.add(new User("mantas", "student", users.size() + 1));
        users.add(new User("diego", "student", users.size() + 1));
        users.add(new User("zalty", "student", users.size() + 1));
        users.add(new User("robert", "teacher", users.size() + 1));
        users.add(new User("doug", "student", users.size() + 1));


        for (int i = 0; i < 100; i++) {
            users.add(new User("doug", "student", users.size() + 1));
        }

        // create 100 rooms and rive them a random size between 1 and 5
        rooms = new ArrayList<Room>();
        for (int i = 0; i < 20; i++) {
            rooms.add(new Room(i, (int) (Math.random() * 5) + 1));
        }

        // create 5 courses
        courses = new ArrayList<Course>();
        courses.add(new Course("CS 101"));
        courses.add(new Course("CS 102"));
        courses.add(new Course("CS 103"));
        courses.add(new Course("CS 104"));
        courses.add(new Course("CS 105"));


    }

    // display all available rooms
    public void displayRooms() {
        for (Room room : rooms) {
            System.out.println(room.getId() + " size: " + room.getSize());
        }
    }

    // display all available groups
    public void displayGroups() {
        for (Group group : groups) {
            System.out.println(group.getId() + " " + group.getName());
        }
    }

    // display all available courses
    public void displayCourses() {
        for (Course course : courses) {
            System.out.println(course.getName());
        }
    }

    // display all available users
    public void displayUsers() {
        for (User user : users) {
            System.out.println(user.getId() + " " + user.getName() + " " + user.getRole());
        }
    }

    public static void main(String[] args) {
        // print out user list
        BookingSystem bs = new BookingSystem();

        // main loop
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            // get console input
            input = scanner.nextLine();
            // if input is exit then exit
            if (input.equals("exit")) {
                break;

            } else if (input.equals("help")) {
                System.out.println("help: display this help message");
                System.out.println("exit: exit the program");
                System.out.println("rooms: rooms menu");
                System.out.println("groups: display all available groups");
                System.out.println("courses: display all available courses");
                System.out.println("users: display all available users");

            } else if (input.equals("rooms")) {
                System.out.println("displayA: display all available rooms");
                System.out.println("displayO: display all occupied rooms");
                System.out.println("book: Books a room");

                input = scanner.nextLine();
                if (input.equals("displayA")) {
                    bs.displayRooms(); // todo

                } else if (input.equals("displayO")) {
                    bs.displayRooms(); // todo

                } else if (input.equals("book")) {
                    System.out.println("TODO: implement book");

                }
            } else if (input.equals("groups")) {
                bs.displayGroups();

            } else if (input.equals("courses")) {
                bs.displayCourses();

            } else if (input.equals("users")) {
                bs.displayUsers();

            } else {
                System.out.println("invalid command");
            }
        }
    }
}