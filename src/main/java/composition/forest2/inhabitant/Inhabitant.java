package composition.forest2.inhabitant;

public class Inhabitant {

private InhabitantType inhabitantType;

private double impactOnTreeCondition;

    public Inhabitant(InhabitantType inhabitantType) {
        this.inhabitantType = inhabitantType;
        impactOnTreeCondition = inhabitantType.getImpactModifierOnCondition() + getImpactOnTreeCondition();
    }

    public InhabitantType getRandomInhabitant(){
        return InhabitantType.getRandomInhabitantType();
    }

    public double getImpactOnTreeCondition() {
        return impactOnTreeCondition;
    }
}
