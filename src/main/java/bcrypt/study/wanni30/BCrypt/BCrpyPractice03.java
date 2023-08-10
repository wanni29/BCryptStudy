package bcrypt.study.wanni30.BCrypt;

import java.util.HashMap;
import java.util.Map;

import org.mindrot.jbcrypt.BCrypt;

public class BCrpyPractice03 {

    private static Map<String, String> userDatabase = new HashMap<>();

    public static void main(String[] args) {

        // 사용자 등록
        registerUser("user1", "password123");
        registerUser("user2", "mysecretpass");

        // 사용자 로그인 시도
        login("user1", "wrongpassword"); // 틀린 비밀번호
        login("user1", "password123"); // 올바른 비밀번호
        login("user2", "mysecretpass"); // 올바른 비밀번호

    }

    // 사용자 등록 함수
    public static void registerUser(String username, String password) {
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        userDatabase.put(username, hashedPassword);
        System.out.println("user '" + username + "' registered.");
    }

    // 사용자 로그인 함수
    public static void login(String username, String password) {
        if (userDatabase.containsKey(username)) {
            String hashedPassword = userDatabase.get(username);
            if (BCrypt.checkpw(password, hashedPassword)) {
                System.out.println("User '" + username + "'logged in successfully.");
            } else {
                System.out.println("User '" + username + "' login failed: Incorrect password.");
            }
        } else {
            System.out.println("User '" + username + "' not found.");
        }
    }

}
