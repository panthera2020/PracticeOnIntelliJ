package aircondition;

public class AirCondition {
    private boolean isOn;
    private int temperature = 16;

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {isOn = true;}

    public void turnOff() {isOn = false;}

    public void increaseTemperature() {if  (temperature < 30 && isOn()) temperature++;}

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        if (temperature > 16) temperature--;
    }
}
