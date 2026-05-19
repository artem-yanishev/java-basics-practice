package project7;

abstract class Worker {

    public void startWork() {
        System.out.println("Начать работу");
    }

    abstract void doWork();

    public void finishWork() {
        System.out.println("Закончить работу");
    }
}
