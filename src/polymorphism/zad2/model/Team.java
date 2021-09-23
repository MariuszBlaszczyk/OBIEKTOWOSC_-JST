package polymorphism.zad2.model;

import java.util.Arrays;
import java.util.Objects;

public class Team {

    private String name;
    private GameCharacter[] characters = new GameCharacter[3];

    public Team(String name, GameCharacter character1, GameCharacter character2, GameCharacter character3) {
        this.name = name;
        characters[0] = character1;
        characters[1] = character2;
        characters[2] = character3;
    }

    public String getName() {
        return name;
    }

    public double attack() {
        double attack = 0;
        for (GameCharacter character : characters) {
            attack += character.totalAttack();
        }
        return attack;
    }

    public double defense() {
        double defence = 0;
        for (GameCharacter character : characters) {
            defence += character.totalDefense();
        }
        return defence;
    }

    public double energy() {
        double energy = 0;
        for (GameCharacter character : characters) {
            energy += character.getEnergy();
        }
        return energy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(name, team.name) && Arrays.equals(characters, team.characters);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(characters);
        return result;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", characters=" + Arrays.toString(characters) +
                '}';
    }
}
