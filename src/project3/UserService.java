package project3;

public class UserService {

    public static User createUser(String login, int age) {
        try {
            User user = new User(login, age);
            return user;
        } catch (Exception e) {
            return null;
        }
    }
}
