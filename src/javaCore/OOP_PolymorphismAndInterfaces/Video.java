package javaCore.OOP_PolymorphismAndInterfaces;

public class Video implements Processable {

    @Override
    public void process() {
        System.out.println("Video processing");
    }
}
