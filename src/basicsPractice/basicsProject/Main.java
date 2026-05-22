package basicsPractice.basicsProject;

public class Main {
    public static void main(String[] args) {

        Company company = new Company("Строители");
        Person p1 = new Person("Артём", 22);
        Person p2 = new Person("Иван", 20);
        Person p3 = new Person(null, -1);
        company.addEmployees(p1);
        company.addEmployees(p2);
        company.addEmployees(p3);
        company.printEmployees();
    }
}
