package javaCore.project;

public class Skeleton extends Mob {

    public Skeleton(String name, int health, int stamina, int level) {
        super(name, health, stamina, level);
    }

    public void move() {
        System.out.println("move");
    }

    public void attack() {
        System.out.println("attack");
    }
}
