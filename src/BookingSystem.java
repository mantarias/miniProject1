import java.util.ArrayList;
import java.util.Scanner;

/**
 * BookingSystem
 */
public class BookingSystem {
    private ArrayList<User> users;

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

    }

    public static void main(String[] args) {
        // print out user list
        BookingSystem bs = new BookingSystem();
        for (User user : bs.users) {
            System.out.println(user.getId() + " " + user.getName() + " " + user.getRole());
        }

        // get console input
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        System.out.println(test);

    }
}