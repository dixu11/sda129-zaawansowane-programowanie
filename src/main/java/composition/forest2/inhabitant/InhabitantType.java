package composition.forest2.inhabitant;

import java.util.Random;

public enum InhabitantType {

    SQUIRREL(0.1),
    WOODPECKER(0.1),
    OWL(0),
    TIT(0),
    BEE(0.2),
    NULL(0);

    private double impactModifierOnCondition;

    private static final InhabitantType[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static InhabitantType getRandomInhabitantType(){
        return VALUES[RANDOM.nextInt(SIZE)];
    }

    InhabitantType(double impactModifier){
        this.impactModifierOnCondition = impactModifier;
    }

    public double getImpactModifierOnCondition() {
        return impactModifierOnCondition;
    }
}
