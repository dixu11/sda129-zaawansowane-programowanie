package composition.forest;

public enum AnimalType {
    CARNIVOROUS(0), HERBIVORES(-0.1), OMNIVOROUS(-0.05);

    private double impactModifier;

    AnimalType(double impactModifier) {
        this.impactModifier = impactModifier;
    }

    public double getImpactModifier() {
        return impactModifier;
    }
}
