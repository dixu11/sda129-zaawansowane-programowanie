package composition.forest;

public class Animal {

    private AnimalType type;
    private Species species;
    private double impactOnTree;

    public Animal(AnimalType type, Species species) {
        this.type = type;
        this.species = species;
        impactOnTree = type.getImpactModifier() + species.getImpactModifier();
    }

    public double getImpactOnTree() {
        return impactOnTree;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type=" + type +
                ", species=" + species +
                ", impactOnTree=" + impactOnTree +
                '}';
    }
}
