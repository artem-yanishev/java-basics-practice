package javaCore.OOP_inheritanceAndAbstractClasses;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        if (breed != null && !breed.isEmpty()) {
            this.breed = breed;
        }
    }

    @Override
    void makeSound() {
        System.out.println("Bark");
    }

    public void print() {
        super.print();
        System.out.println(breed);
    }
}
