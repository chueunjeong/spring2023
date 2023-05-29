package org.example;

public class User {
    private String password;

    public String getPassword() {
        return password;
    }

    public void initPassword(PasswordGenerator passwordGenerator) {
        //as-is RandomPasswordGenerator의 결과 값으로 결과가 결정됨.
        //RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();

        //to-be
        //테스트 하기 쉬운 코드를 작성하기 위해 RandomPasswordGenerator의 강결합의 제거할 수 있음.
        String password = passwordGenerator.generatePassword();

        /*비밀번호는 최소 8자 이상 12자 이하여야 한다.*/

        if(password.length()>= 8 && password.length()<=12){
            this.password=password;
        }


    }
}
