package com.driver.test;

import com.driver.Boat;
import com.driver.F1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCases {
    @Test
    public void testF1Acceleration() {
        F1 f1 = new F1("Ferrari", false);
        assertEquals(0, f1.getCurrentSpeed());

        f1.move(50, 0);
        assertEquals(50, f1.getCurrentSpeed());

        f1.accelerate(30);
        assertEquals(80, f1.getCurrentSpeed());

        f1.accelerate(-40);
        assertEquals(40, f1.getCurrentSpeed());

        f1.accelerate(-60); // Should stop the car
        assertEquals(0, f1.getCurrentSpeed());
    }

    @Test
    public void testBoat() {
        Boat boat = new Boat("Titanic", 3000);
        assertEquals("Titanic", boat.getVehicleName());
        assertEquals(3000, boat.getVehicleCapacity());
    }
}
