package aircondition;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {

    private AirCondition airCondition;

    @BeforeEach
    public void setup() {
        airCondition = new AirCondition();
    }

    @Test
    public void testThatIHaveAc_ITurnItOn_ItIsOnTest() {
        airCondition.turnOn();
        assertTrue(airCondition.isOn());
    }

    @Test
    public void testThatIHaveAc_ITurnItOn_ITurnItOff_ItIsOffTest() {
        airCondition.turnOn();
        assertTrue(airCondition.isOn());
        airCondition.turnOff();
        assertFalse(airCondition.isOn());

    }

    @Test
    public void testThatIHaveAc_ITurnItOn_AndItIncreaseTemperature_ItsIncreasesTemperatureIsSeventeen() {
        airCondition.turnOn();
        airCondition.increaseTemperature();
        assertTrue(airCondition.isOn());
        assertEquals(17, airCondition.getTemperature());
    }

    @Test
    public void testThatIHaveAc_ITurnItOn_AndItIncreaseTemperature_AndItDecreaseTemperature_ItsDecreasesTemperature() {
        airCondition.turnOn();
        airCondition.increaseTemperature();
        assertTrue(airCondition.isOn());
        assertEquals(17, airCondition.getTemperature());
        airCondition.decreaseTemperature();
        assertEquals(16, airCondition.getTemperature());

    }

    @Test
    public void testThatIHaveAc_ITurnItOn_AndItIncreaseTemperatureToThirtyOneTemperatureIsThirty() {
        airCondition.turnOn();
        airCondition.increaseTemperature();
        for (int counter = 0; counter < 30; counter++) {
            airCondition.increaseTemperature();
        }

        assertTrue(airCondition.isOn());
        assertEquals(30, airCondition.getTemperature());


    }

    @Test
    public void testThatIHaveAc_ITurnItOn_AndIDecreaseTemperatureBelow16TemperatureIs16() {
        airCondition.turnOn();
        airCondition.decreaseTemperature();

        assertTrue(airCondition.isOn());
        assertEquals(16, airCondition.getTemperature());
    }

    @Test
    public void testThatIHaveAc_ITurnItOn_iTurnItOff_AndIDecreaseTemperatureBelow16NoAction() {
        airCondition.turnOn();
        assertTrue(airCondition.isOn());
        airCondition.turnOff();
        assertFalse(airCondition.isOn());
        for(int counter = 0; counter < 30; counter++) {
            airCondition.decreaseTemperature();
        }
        assertEquals(16, airCondition.getTemperature());
    }

    @Test
    public void testThatIHaveAc_ITurnItOneAndTurnItOff_AndIIncreaseTemperatureNoAction() {
        airCondition.turnOn();
        assertTrue(airCondition.isOn());
        airCondition.turnOff();
        assertFalse(airCondition.isOn());
        for(int counter = 0; counter < 30; counter++) {
            airCondition.increaseTemperature();
        }
        assertEquals(16, airCondition.getTemperature());
    }

}