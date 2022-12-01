package composition.forest2.parasite;

import java.util.Random;

public enum ParasiteType {

    HUB(-0.2),
    MISTLETOE(-0.1),
    GREENFLY(-0.2),
    NULL(0);
    private double impactModifierOnCondition;

    private static final ParasiteType[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static ParasiteType getRandomParasiteType() {
        return VALUES[RANDOM.nextInt(SIZE)];
    }

    ParasiteType(double impactModifier){
        this.impactModifierOnCondition = impactModifier;
    }

    public double getImpactModifierOnCondition() {
        return impactModifierOnCondition;
    }
}
