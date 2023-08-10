package bcrypt.study.wanni30.BCrypt;

import org.mindrot.jbcrypt.BCrypt;

public class BCryptPractice01 {

    public static void main(String[] args) {

        String encPassword = BCrypt.hashpw("1234", BCrypt.gensalt());
        System.out.println("encPassword : " + encPassword);

        boolean isValid = BCrypt.checkpw("1234", encPassword);
        System.out.println(isValid);
    }

}
