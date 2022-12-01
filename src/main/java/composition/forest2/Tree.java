package composition.forest2;

import composition.forest2.inhabitant.Inhabitant;
import composition.forest2.inhabitant.InhabitantType;
import composition.forest2.parasite.Parasite;
import composition.forest2.parasite.ParasiteType;
import composition.forest2.weather.Weather;
import composition.forest2.weather.WeatherInfluence;
import composition.forest2.weather.WeatherType;

public class Tree implements WeatherInfluence {

    private int lengthInCentimeters;

    private int ageInMonths;

    private double condition;

    private double irrigation;

    private InhabitantType inhabitant;

    private ParasiteType parasite;

    private WeatherType weather;

    private River river;



    public Tree(){
        treeStatistics();
    }


    private void treeStatistics(){
        lengthInCentimeters = 0;
        ageInMonths = 0;
        condition = 1.0;
        irrigation = 1.0;
    }

    public void afterOneMonth(){
       timeImpact();
       influenceOfInhabitant();
       influenceOfParasite();
       influenceOfWeather();
       influenceOfFlood();
       influenceOfOverHeat();
       influenceOfRiver();
    }
    public void afterOneYear(){
        for (int i = 0; i < 12; i++) {
            afterOneMonth();
        }
        }
    private void timeImpact(){
        lengthInCentimeters++;
        ageInMonths++;
        condition += 0.01;
        irrigation -= 0.02;
    }

    private void influenceOfRiver(){
        if(river == null){
            return;
        }
        irrigation += river.getIrrigationOfTheEnvironment();
    }

    private void influenceOfFlood(){
        if(condition > 1.0) {
            System.out.println("Flood!");
            condition -= 0.3;
        }
    }
    private void influenceOfOverHeat() {
        if (irrigation > 1.0) {
            System.out.println("High temperatures!");
            irrigation -= 0.5;
        }
    }
    private void influenceOfInhabitant() {
        if (inhabitant == null) {
            return;
        }
        condition += inhabitant.getImpactModifierOnCondition();
    }
    private void influenceOfParasite(){
        if(parasite == null){
            return;
        }
        condition += parasite.getImpactModifierOnCondition();
    }

        public void addInhabitant(Inhabitant newInhabitant) {
            if (inhabitant == null) {
                inhabitant = newInhabitant.getRandomInhabitant();
            }
        }
        public void addParasite(Parasite newParasite){
        if(parasite == null){
            parasite = newParasite.getRandomParasite();
            }
    }
    public void addWeather(Weather newWeather){
        if(weather == null){
            weather = newWeather.getRandomWeather();
        }
    }
    @Override
    public void influenceOfWeather() {
        if(weather == null) {
            return;
        }
        condition += weather.getImpactModifierOnCondition();
        irrigation += weather.getImpactModifierOnIrrigation();
    }

    @Override
    public String toString() {
        return "Tree:: " +
                "lengthInCentimeters: " + lengthInCentimeters +
                " ageInMonths: "  + ageInMonths +
                " condition: " + condition +
                " irrigation: " + irrigation +
                " inhabitant: " + inhabitant +
                " parasite: " + parasite +
                " weather: " + weather;
    }
}


