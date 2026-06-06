package javaCore.project;

public class Warrior extends Character {

    private int armor;

    public Warrior(String name, int health, int stamina, int level, int damage, int armor) {
        super(name, health, stamina, level, damage);
        if (armor <= 0) {
            throw new IllegalArgumentException("Incorrect armor value");
        }
        this.armor = armor;
    }

    public void move() {
        if (!alive) {
            return;
        }
        System.out.println("move");
    }

    public void attack(Mob target) {
        if (!alive) {
            return;
        }
        target.takeDamage(damage);
        System.out.println(target + " нанесён урон: " + damage);
    }

    public void interact() {
        if (!alive) {
            return;
        }
        System.out.println("interact");
    }
}
