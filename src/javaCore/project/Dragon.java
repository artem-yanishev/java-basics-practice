package javaCore.project;

public class Dragon extends Mob {

    public Dragon(String name, int health, int stamina, int level) {
        super(name, health, stamina, level);
    }

    public void move() {
        System.out.println("move");
    }

    public void attack() {
        System.out.println("attack");
    }
}
