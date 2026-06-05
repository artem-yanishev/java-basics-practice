package javaCore.project;

abstract class Character {

    private String name;
    protected int health;
    private int stamina;
    private int level;
    protected int damage;

    public Character(String name, int health, int stamina, int level, int damage) {
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
        this.damage = damage;
    }

    @Override
    public String toString() {
        return name + "(HP: " + health + ")";
    }

    abstract void move();

    abstract void attack(Mob target);

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name + "получил урон: " + damage);
        if (health <= 0) {
            health = 0;
            System.out.println("Dead");
        }
    }

    abstract void interact();
}
