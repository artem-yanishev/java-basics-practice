package javaCore.project;

abstract class Mob {

    private String name;
    protected int health;
    private int stamina;
    private int level;

    public Mob(String name, int health, int stamina, int level) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Incorrect name value");
        }
        if (health <= 0) {
            throw new IllegalArgumentException("Incorrect health value");
        }
        if (stamina <= 0) {
            throw new IllegalArgumentException("Incorrect stamina value");
        }
        if (level <= 0) {
            throw new IllegalArgumentException("Incorrect level value");
        }
        this.name = name;
        this.health = health;
        this.stamina = stamina;
        this.level = level;
    }

    abstract void move();

    abstract void attack();

    public void takeDamage(int damage) {
        this.health -= damage;
    }
}
