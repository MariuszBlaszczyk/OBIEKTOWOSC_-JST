package polymorphism.zad2.model;

import java.util.Objects;

public class GameCharacter {

    private String name;
    private int strengthAttack;
    private int powerOfDefence;
    private int energy;

    public GameCharacter(String name, int strengthAttack, int powerOfDefence, int energy) {
        this.name = name;
        this.strengthAttack = strengthAttack;
        this.powerOfDefence = powerOfDefence;
        this.energy = energy;
    }

    public int getStrengthAttack() {
        return strengthAttack;
    }

    public int getPowerOfDefence() {
        return powerOfDefence;
    }



    public int getEnergy() {
        return energy;
    }

    public double totalAttack() {
        return strengthAttack;
    }

    public double totalDefense() {
        return powerOfDefence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameCharacter gameCharacter = (GameCharacter) o;
        return strengthAttack == gameCharacter.strengthAttack && powerOfDefence == gameCharacter.powerOfDefence && energy == gameCharacter.energy && Objects.equals(name, gameCharacter.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strengthAttack, powerOfDefence, energy);
    }

    @Override
    public String toString() {
        return "- name:" + name + "\n" +
                "- strength attack: " + strengthAttack + "\n" +
                "- power of defence: " + powerOfDefence + "\n" +
                "- energy: " + energy;
    }
}
