package composition.forest2.weather;

import java.util.Random;

public enum WeatherType {
    SUNNY(+0.03, -0.01 ),
    WINDY(-0.01, 0),
    RAINY(+0.01, +0.03),
    COLD(0, -0.01);

    private double impactModifierOnCondition;

    private double impactModifierOnIrrigation;

    WeatherType(double condition, double irrigation){
        impactModifierOnCondition = condition;
        impactModifierOnIrrigation = irrigation;
    }

    private static final WeatherType[] VALUES = values();

    private static final int SIZE = VALUES.length;

    private static final Random RANDOM = new Random();

    public static WeatherType getRandomWeather(){
        return VALUES[RANDOM.nextInt(SIZE)];
    }

    public double getImpactModifierOnCondition() {
        return impactModifierOnCondition;
    }

    public double getImpactModifierOnIrrigation() {
        return impactModifierOnIrrigation;
    }
}
