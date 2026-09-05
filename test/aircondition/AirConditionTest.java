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
    public void iHaveAAc_ITurnItOn_ItIsOnTest() {
//        AirCondition airCondition = new AirCondition();
        airCondition.turnOn();
        assertTrue(airCondition.isOn());
    }

    @Test
    public void iHaveAAc_ITurnItOn_ITurnItOff_ItIsOffTest() {
//        AirCondition airCondition = new AirCondition();
        airCondition.turnOn();
        assertTrue(airCondition.isOn());
        airCondition.turnOff();
        assertFalse(airCondition.isOn());

    }

    @Test
    public void iHaveAAc_ITurnItOn_AndItIncreaseTemperature_ItsIncreasesTemperatureisSeventeen() {
//        AirCondition airCondition = new AirCondition();
        airCondition.turnOn();
        airCondition.increaseTemperature();
        assertTrue(airCondition.isOn());
        assertEquals(17, airCondition.getTemperature());
    }

    @Test
    public void iHaveAAc_ITurnItOn_AndItIncreaseTemperature_AndItDecreaseTemperature_ItsDecreasesTemperature() {
//        AirCondition airCondition = new AirCondition();
        airCondition.turnOn();
        airCondition.increaseTemperature();
        assertTrue(airCondition.isOn());
        assertEquals(17, airCondition.getTemperature());
        airCondition.decreaseTemperature();
        assertEquals(16, airCondition.getTemperature());

    }

    @Test
    public void iHaveAAc_ITurnItOn_AndItIncreaseTemperatureToThirtyOneTemperatureIsThirty() {
//        AirCondition airCondition = new AirCondition();
        airCondition.turnOn();
        airCondition.increaseTemperature();
        for (int counter = 0; counter < 30; counter++) {
            airCondition.increaseTemperature();
        }

        assertTrue(airCondition.isOn());
        assertEquals(30, airCondition.getTemperature());


    }

    @Test
    public void iHaveAAc_ITurnItOn_AndIDecreaseTemperaturebelow16TemperatureIs16() {
//        AirCondition airCondition = new AirCondition();
        airCondition.turnOn();
        airCondition.decreaseTemperature();

        assertTrue(airCondition.isOn());
        assertEquals(16, airCondition.getTemperature());
    }

    @Test
    public void iHaveAAc_ITurnItOn_iTurnItOff_AndIDecreaseTemperaturebelow16NoAction() {

    }

    @Test
    public void iHaveAAc_ITurnItOn_iTurnItOff_AndIDincreaseTemperatureAbove30NoAction() {

    }


}