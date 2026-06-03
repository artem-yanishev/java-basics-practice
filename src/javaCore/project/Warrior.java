package javaCore.project;

public class Warrior extends Character {

    private int armor;

    public Warrior(String name, int health, int stamina, int level, int armor) {
        super(name, health, stamina, level);
        if (armor <= 0) {
            throw new IllegalArgumentException("Incorrect armor value");
        }
        this.armor = armor;
    }

    public void move() {
        System.out.println("move");
    }

    public void attack() {
        System.out.println("attack");
    }

    public void interact() {
        System.out.println("interact");
    }
}
