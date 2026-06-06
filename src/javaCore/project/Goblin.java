package javaCore.project;

public class Goblin extends Mob {

    public Goblin(String name, int health, int stamina, int level, int damage) {
        super(name, health, stamina, level, damage);
    }

    public void move() {
        if (!alive) {
            return;
        }
        System.out.println("move");
    }

    public void attack(Character target) {
        if (!alive) {
            return;
        }
        target.takeDamage(damage);
        System.out.println(target + " нанесён урон: " + damage);
    }
}
