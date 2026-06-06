package javaCore.project;

public class Archer extends Character {

    private int arrows;

    public Archer(String name, int health, int stamina, int level, int damage, int arrows) {
        super(name, health, stamina, level, damage);
        if (arrows <= 0) {
            throw new IllegalArgumentException("Incorrect arrows value");
        }
        this.arrows = arrows;
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
