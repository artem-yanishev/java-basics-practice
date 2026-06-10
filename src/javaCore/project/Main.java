package javaCore.project;

public class Main {

    public static void main(String[] args) {

        Character mage = new Mage("Mage", 100, 75, 1, 25, 50);
        Character warrior = new Warrior("Warrior", 100, 100, 1, 35, 50);
        Character archer = new Archer("Archer", 100, 75, 1, 20, 100);
        Mob wolf = new Wolf("Wolf", 100, 110, 1, 20);
        Mob skeleton = new Skeleton("Skeleton", 110, 100, 1, 25);
        Mob goblin = new Goblin("Goblin", 120, 120, 1, 30);
        Mob dragonBoss = new DragonBoss("DragonBoss", 200, 150, 1, 35);

        System.out.println(mage.toString());
        System.out.println(warrior.toString());
        System.out.println(archer.toString());
        System.out.println(wolf.toString());
        System.out.println(skeleton.toString());
        System.out.println(goblin.toString());
        System.out.println(dragonBoss.toString());

        Character[] characters = {mage, warrior, archer};
        Mob[] mobs = {wolf, skeleton, goblin, dragonBoss};


        boolean characterAlive = true;
        boolean mobAlive = true;

        while (characterAlive == true && mobAlive == true) {
            characterAlive = false;
            for (int i = 0; i < characters.length; i++) {
                if (characters[i].alive == true) {
                    characterAlive = true;
                    System.out.println("There are living characters");
                    break;
                }
            }
            mobAlive = false;
            for (int i = 0; i < mobs.length; i++) {
                if (mobs[i].alive == true) {
                    mobAlive = true;
                    System.out.println("There are living mobs");
                    break;
                }
            }

            for (int i = 0; i < mobs.length; i++) {
                for (int j = 0; j < characters.length; j++) {
                    if (mobs[i].alive) {
                        characters[j].attack(mobs[i]);
                    }
                }
            }
        }
    }
}
