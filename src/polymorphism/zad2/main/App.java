package polymorphism.zad2.main;

import polymorphism.zad2.model.AttackCharacter;
import polymorphism.zad2.model.DefenseCharacter;
import polymorphism.zad2.model.Team;
import polymorphism.zad2.service.BattleSimulator;

public class App {

    public static void main(String[] args) {

        AttackCharacter character1 = new AttackCharacter("Jan", 100, 100, 100, 0.9);
        AttackCharacter character2 = new AttackCharacter("Marta", 100, 100, 100, 0.5);
        DefenseCharacter character3 = new DefenseCharacter("Krzysztof", 100, 100, 100, 0.4);
        AttackCharacter character4 = new AttackCharacter("Mateusz", 100, 100, 100, 0.7);
        AttackCharacter character5 = new AttackCharacter("Anna", 100, 100, 100, 0.3);
        DefenseCharacter character6 = new DefenseCharacter("Jacek", 100, 100, 100, 0.9);

        Team team1 = new Team("TeamX", character2, character3, character1);
        Team team2 = new Team("TeamY", character5, character6, character4);
        BattleSimulator.fight(team1, team2);
    }
    }

