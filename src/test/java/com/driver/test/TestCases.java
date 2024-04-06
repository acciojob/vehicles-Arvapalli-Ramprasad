package com.driver.test;

import com.driver.F1;
import com.driver.Car;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestCases {

    @Test
    public void testCar1() {
        Car car = new Car("Toyota", 4, 4, 5, true, "Sedan", 5);

        assertEquals(4, car.getWheels());
        assertEquals(4, car.getDoors());
        assertEquals(5, car.getGears());
        assertTrue(car.isManual());
        assertEquals("Sedan", car.getType());
        assertEquals(5, car.getSeats());
        assertEquals(0, car.getCurrentGear());
    }

    @Test
    public void testF11() {
        F1 f1 = new F1("Ferrari", false);
        f1.move(50, 0);
        assertEquals(50, f1.getCurrentSpeed());

        f1.accelerate(30);
        assertEquals(80, f1.getCurrentSpeed());

        f1.accelerate(-40);
        assertEquals(40, f1.getCurrentSpeed());

        f1.accelerate(-60); // Should stop the car
        assertEquals(0, f1.getCurrentSpeed());
    }
}
