package com.unittest.codecoverage.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FootPassengerTest {

    @Test
    public void test_shouldSetAndGetCrossedTheCrossWalkCorrectly() {
        Footpassenger footpassenger = new Footpassenger();
        footpassenger.setCrossedTheCrosswalk(true);
        Assertions.assertTrue(footpassenger.crossedTheCrosswalk());
    }
}
