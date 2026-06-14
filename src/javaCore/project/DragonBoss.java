package javaCore.project;

public class DragonBoss extends Mob {

    public DragonBoss(String name, int health, int stamina, int level, int damage) {
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
    }
}
