package javaCore.exceptionsPractice;

public class AccessService {

    public static void checkAccess(String role) {
        if (role == null) {
            throw new RuntimeException("Role is null");
        }
        if (role.equals("ADMIN")) {
            System.out.println("Access granted");
        } else {
            throw new RuntimeException("Access denied");
        }

    }
}
