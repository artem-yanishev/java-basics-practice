package javaCore.project;

public class Dragon extends Mob {

    public Dragon(String name, int health, int stamina, int level, int damage) {
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
