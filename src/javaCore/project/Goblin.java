package javaCore.project;

public class Goblin extends Mob {

    public Goblin(String name, int health, int stamina, int level) {
        super(name, health, stamina, level);
    }

    public void move() {
        System.out.println("move");
    }

    public void attack() {
        System.out.println("attack");
    }
}
