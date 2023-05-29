package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class UserTest {
    @DisplayName("패스워드를 초기화한다.")
    @Test
    void passwordTest() {
        //given : 유저가 주어짐
        User user= new User();

        //when : 해당 메소드를 호출했을 때
        user.initPassword(()->"abcdefgh");

        //then
        assertThat(user.getPassword()).isNotNull();

    }

    @DisplayName("패스워드를 요구사항에 부합하지 않아 초기화가 되지 않는다.")
    @Test
    void passwordTest2() {
        //given : 유저가 주어짐
        User user= new User();

        //when : 해당 메소드를 호출했을 때
        user.initPassword(()->"ab");

        //then
        assertThat(user.getPassword()).isNull();

    }
}