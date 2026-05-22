package basicsPractice.basicsProject;

public class Company {

    private String name;
    private Person[] employees;
    private int numberOfEmployees;

    String getName() {
        return name;
    }

    Person[] getEmployees() {
        return employees;
    }

    int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    Company(String name) {
        if (name != null) {
            this.name = name;
            this.employees = new Person[5];
        }
    }

    void addEmployees(Person person) {
        if (person != null) {
            employees[numberOfEmployees] = person;
            numberOfEmployees++;
        }
    }

    void removeEmployees(String name) {
        if (name != null) {
            int index = -1;
            for (int i = 0; i < numberOfEmployees; i++) {
                if (employees[i] != null) {
                    if (name.equals(employees[i].getName())) {
                        index = i;
                        break;
                    }
                }
            }
            if (index != -1) {
                for (int i = index; i < numberOfEmployees; i++) {
                    if (i == numberOfEmployees - 1) {
                        employees[i] = null;
                        break;
                    } else {
                        employees[i] = employees[i + 1];
                    }
                }
                numberOfEmployees--;
            } else {
                System.out.println("Работника, с таким именем нет в базе.");
            }
        } else {
            System.out.println("Неверное имя!");
        }
    }

    void printEmployees() {
        if (numberOfEmployees != 0) {
            System.out.println("Работники компании (" + name + "):");
            for (int i = 0; i < numberOfEmployees; i++) {
                if (employees[i] != null) {
                    System.out.println(employees[i]);
                }
            }
        } else {
            System.out.println("Работников нет!");
        }
    }
}
