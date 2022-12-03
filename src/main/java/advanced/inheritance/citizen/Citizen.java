package advanced.inheritance.citizen;

public abstract class Citizen {
    private String name;

    public Citizen(String name) {
        this.name = name;
    }

    abstract boolean canVote();

    public String getName() {
        return name;
    }
}
