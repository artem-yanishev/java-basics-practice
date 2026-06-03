package javaCore.project;

abstract class Character {

    private String name;
    private int health;
    private int stamina;
    private int level;

    public Character(String name, int health, int stamina, int level) {
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

    abstract void interact();
}
