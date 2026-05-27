package javaCore.OOP_polymorphismAndInterfaces;

public class Image implements Processable {

    @Override
    public void process() {
        System.out.println("Image processing");
    }
}
