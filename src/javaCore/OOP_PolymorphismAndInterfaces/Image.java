package javaCore.OOP_PolymorphismAndInterfaces;

public class Image implements Processable {

    @Override
    public void process() {
        System.out.println("Image processing");
    }
}
