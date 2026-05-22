package javaCore.OOP_InheritanceAndAbstractClasses2;

abstract class Process {

    public void preparation() {
        System.out.println("Подготовка");
    }

    abstract void execution();

    public void completion() {
        System.out.println("Завершение");
    }
}
