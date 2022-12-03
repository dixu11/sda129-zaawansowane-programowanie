package composition.forest2;

import composition.forest2.weather.WeatherInfluence;
import composition.forest2.weather.WeatherType;

public class River implements WeatherInfluence {

    private int highOfARiverInCentimeters = 150;
    private double irrigationOfTheEnvironment = 0.03;
    private WeatherType weather;

    public River(double irrigationOfTheEnvironment) {
        this.irrigationOfTheEnvironment = irrigationOfTheEnvironment;
    }

    public double getIrrigationOfTheEnvironment() {
        return irrigationOfTheEnvironment;
    }

    @Override
    public void influenceOfWeather() {
        if(weather == null) {
            return;
        }
        irrigationOfTheEnvironment += weather.getImpactModifierOnIrrigation();

    }
}
