package bcrypt.study.wanni30.BCrypt;

import org.mindrot.jbcrypt.BCrypt;

public class BCrpytPractice02 {

    public static void main(String[] args) {

        // 사용자가 입력한 비밀번호
        String userPassword = "mysecretpassword";

        // 비밀번호를 해시화하여 저장
        String hashedPassword = hashPassword(userPassword);
        System.out.println("Stored Hashed Password : " + hashedPassword);

        // 사용자가 입력한 비밀번호를 검증
        String inputPassword = "mysecretpassword";
        if (checkPassword(inputPassword, hashedPassword)) {
            System.out.println("Password is correct"); // 암호가 일치합니다.
        } else {
            System.out.println("Password is incorrect"); // 암호가 일치하지 않습니다.
        }

    }

    // 비밀번호를 해시화하여 반환하는 함수
    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    // 저장된 해시와 입력된 비밀번호를 비교하여 검증하는 함수
    public static boolean checkPassword(String inputPassword, String hashedPassword) {
        return BCrypt.checkpw(inputPassword, hashedPassword);
    }

}
