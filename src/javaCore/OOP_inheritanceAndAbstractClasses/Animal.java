package javaCore.OOP_inheritanceAndAbstractClasses;

abstract class Animal {
    private String name;

    public Animal(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    abstract void makeSound();

    public void print() {
        System.out.println(name);
    }
}
