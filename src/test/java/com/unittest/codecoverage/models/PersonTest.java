package com.unittest.codecoverage.models;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PersonTest {
    @Test
    public void test_shouldSetAndGetAgeCorrectly() {
        Person person = new Person();
        person.setAge(50);
        Assertions.assertEquals(person.getAge(), 50);
    }


}
