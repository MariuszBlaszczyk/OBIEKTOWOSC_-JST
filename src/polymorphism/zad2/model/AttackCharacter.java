package polymorphism.zad2.model;

import java.util.Objects;

public class AttackCharacter extends GameCharacter {

    private double attackBonus;

    public AttackCharacter(String name, int strengthAttack, int powerOfDefence, int energy, double attackBonus) {
        super(name, strengthAttack, powerOfDefence, energy);
        this.attackBonus = attackBonus;
    }

    @Override
    public double totalAttack() {
        return getStrengthAttack() + attackBonus * getStrengthAttack();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AttackCharacter attackCharacter = (AttackCharacter) o;
        return Double.compare(attackCharacter.attackBonus, attackBonus) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), attackBonus);
    }

    @Override
    public String toString() {
        return "Attacker\n" +
                super.toString() + "\n" +
                "attackBonus=" + attackBonus;
    }
}
