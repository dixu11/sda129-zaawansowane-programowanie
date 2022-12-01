package composition.forest2.weather;

public class Weather {

    private WeatherType weatherType;

    private double impactOnTreeCondition;
    private double impactOnTreeIrrigation;

    public Weather(WeatherType weatherType){
        this.weatherType = weatherType;
        impactOnTreeCondition = weatherType.getImpactModifierOnCondition() + getImpactOnTreeCondition();
        impactOnTreeIrrigation = weatherType.getImpactModifierOnIrrigation() + getImpactOnTreeIrrigation();
    }

    public WeatherType getRandomWeather(){
        return WeatherType.getRandomWeather();
    }

    public double getImpactOnTreeCondition() {
        return impactOnTreeCondition;
    }

    public double getImpactOnTreeIrrigation() {
        return impactOnTreeIrrigation;
    }
}
