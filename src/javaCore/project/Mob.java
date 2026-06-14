package javaCore.project;

abstract class Mob {

    private String name;
    protected int health;
    private int stamina;
    private int level;
    protected int damage;
    protected boolean alive = true;

    public Mob(String name, int health, int stamina, int level, int damage) {
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
        if (damage <= 0) {
            throw new IllegalArgumentException("Incorrect damage value");
        }
        this.name = name;
        this.health = health;
        this.stamina = stamina;
        this.level = level;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return name + "(HP: " + health + ")";
    }

    abstract void move();

    abstract void attack(Character target);

    public void takeDamage(int damage) {
        if (!alive) {
            return;
        }
        this.health -= damage;
        System.out.println(name + " получил урон: " + damage + ". -> (HP: " + health + ")");
        if (health <= 0) {
            health = 0;
            alive = false;
            System.out.println(name + " dead");
        }
    }
}
