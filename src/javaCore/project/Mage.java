package javaCore.project;

public class Mage extends Character {

    private int mana;

    public Mage(String name, int health, int stamina, int level, int mana) {
        super(name, health, stamina, level);
        if (mana <= 0) {
            throw new IllegalArgumentException("Incorrect mana value");
        }
        this.mana = mana;
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
