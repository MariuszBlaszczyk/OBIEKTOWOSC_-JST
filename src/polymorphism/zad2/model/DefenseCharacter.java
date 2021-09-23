package polymorphism.zad2.model;

import java.util.Objects;

public class DefenseCharacter extends GameCharacter {

    private double defensiveBonus;

    public DefenseCharacter(String name, int strengthAttack, int powerOfDefence, int energy, double defensiveBonus) {
        super(name, strengthAttack, powerOfDefence, energy);
        this.defensiveBonus = defensiveBonus;
    }

    @Override
    public double totalDefense() {
        return getPowerOfDefence() + defensiveBonus * getPowerOfDefence();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DefenseCharacter defenseCharacter = (DefenseCharacter) o;
        return Double.compare(defenseCharacter.defensiveBonus, defensiveBonus) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), defensiveBonus);
    }

    @Override
    public String toString() {
        return "Defensive" +
                super.toString() + "\n" +
                "defensiveBonus=" + defensiveBonus;
    }
}
