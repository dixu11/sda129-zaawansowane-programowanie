package composition.forest;

public enum Species {
    SQUIRREL(0.15), WOODPECKER(0.1), MONKEY(-0.1);

   private double impactModifier;

    Species(double impactModifier) {
        this.impactModifier = impactModifier;
    }

    public double getImpactModifier() {
        return impactModifier;
    }
}
