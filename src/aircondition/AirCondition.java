package aircondition;

public class AirCondition {
    private boolean isOn;
    private int temperature;

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
        temperature = 16;
    }

    public void turnOff() {
        isOn = false;
    }

    public void increaseTemperature() {
        if  (temperature < 30 && isOn()) {
            temperature++;
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        if (temperature > 16) temperature--;
    }
}
