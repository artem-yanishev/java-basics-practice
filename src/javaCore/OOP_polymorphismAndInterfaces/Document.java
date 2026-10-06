package javaCore.OOP_polymorphismAndInterfaces;

public class Document implements Processable {

    @Override
    public void process() {
        System.out.println("Document processing");
    }
}
