package advanced.inheritance.citizen;

public class Soldier extends Citizen{
    public Soldier(String name) {
        super(name);
    }

    @Override
    boolean canVote() {
        return true;
    }
}
