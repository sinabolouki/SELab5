package com.unittest.codecoverage.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TrafficTest {
    @Test
    public void testIntenseCarTraffic_shouldSetAndGetCorrectly() {
        Traffic traffic = new Traffic();
        TrafficLigth trafficLigth = TrafficLigth.RED;
        traffic.setCurrentTrafficLight(trafficLigth);
        Assertions.assertEquals(traffic.getCurrentTrafficLight(), TrafficLigth.RED);
    }

    @Test
    public void testIntenseCarTraffic_shouldSetAndGetMaxSpeedAllowedCorrectly() {
        Traffic traffic = new Traffic();
        traffic.setMaxSpeedAllowed((short) 60);
        Assertions.assertEquals(traffic.getMaxSpeedAllowed(), (short) 60);
    }

    @Test
    public void testIntenseCarTraffic_shouldSetAndGetStreetDirectionFlow() {
        Traffic traffic = new Traffic();
        traffic.setStreetDirectionFlow(StreetDirectionFlow.TWO_WAY);
        Assertions.assertEquals(traffic.getStreetDirectionFlow(), StreetDirectionFlow.TWO_WAY);
    }
}
