package composition.forest2.parasite;

public class Parasite {

    private ParasiteType parasiteType;

    private double impactOnTree;

    public Parasite(ParasiteType parasiteType) {
        this.parasiteType = parasiteType;
        impactOnTree = parasiteType.getImpactModifierOnCondition() + getImpactOnTree();
    }

    public ParasiteType getRandomParasite(){
        return ParasiteType.getRandomParasiteType();
    }

    public double getImpactOnTree() {
        return impactOnTree;
    }
}
