package javaCore.OOP_PolymorphismAndInterfaces;

public class Document implements Processable {

    @Override
    public void process() {
        System.out.println("Document processing");
    }
}
