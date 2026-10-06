package javaCore.OOP_polymorphismAndInterfaces;

public class Video implements Processable {

    @Override
    public void process() {
        System.out.println("Video processing");
    }
}
