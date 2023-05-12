package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @DisplayName("패스워드를 초기화한다.")
    @Test
    void passwordTest() {
        //given : 유저가 주어짐
        User user= new User();

        //when : 해당 메소드를 호출했을 때
        user.initPassword();
    }
}