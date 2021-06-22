package com.example.practice;

import org.junit.jupiter.api.Test;

//@SpringBootTest
class PracticeApplicationTests {

    @Test
    void contextLoads() {
        Class jsonClass=User.class;
    }
    class User{
        private Integer age;
        private String name;
    }
    class Student{
        private Integer score;
    }

}
