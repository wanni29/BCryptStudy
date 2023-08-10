# BCrypt 개념



- ### BCrypt는 비밀번호를 안전하게 저장하고 검증하기 위한 해시 함수 및 솔트(salt)를 사용하는 암호화 알고리즘입니다.

- ###  비밀번호를 해싱하여 저장할 때 더 높은 보안 수준을 제공


```java

        // 기본 개념 코드
        String encPassword = BCrypt.hashpw("1234", BCrypt.gensalt());
        System.out.println("encPassword : " + encPassword);

        boolean isValid = BCrypt.checkpw("1234", encPassword);
        System.out.println(isValid);

```