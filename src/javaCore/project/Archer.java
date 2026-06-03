package javaCore.project;

public class Archer extends Character {

    private int arrows;

    public Archer(String name, int health, int stamina, int level, int arrows) {
        super(name, health, stamina, level);
        if (arrows <= 0) {
            throw new IllegalArgumentException("Incorrect arrows value");
        }
        this.arrows = arrows;
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
