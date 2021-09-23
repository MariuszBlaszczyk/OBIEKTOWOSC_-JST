package polymorphism.zad2.service;

import polymorphism.zad2.model.Team;

public class BattleSimulator {

    public static void fight(Team team1, Team team2) {
        double team2Energy = attack(team1, team2);
        double team1Energy = attack(team2, team1);
        double energyDiff = team1Energy - team2Energy;
        if (energyDiff > 0) {
            System.out.println("The team wins " + team1.getName() + " mostly " + energyDiff + " energy");
        } else if (energyDiff < 0) {
            System.out.println("The team wins " + team2.getName() + " mostly " + (-energyDiff) + " energy");
        } else {
            System.out.println("A draw, both teams retained " + team1Energy + " energy");
        }
    }

    private static double attack(Team attacker, Team defender) {
        double attack = attacker.attack();
        double defense = defender.defense();
        double attackPower = attack - defense;
        double energy = defender.energy();
        if (attackPower > 0) {
            return energy - attackPower;
        } else {
            return energy;
        }
    }



}


