package basicsPractice.basicsProject;

public class PersonService {

    void setAdult(Person p) {
        if (p.getAge() < 18) {
            p.setAge(18);
        }
    }

    void increaseAge(Person p) {
        if (p.getAge() < 150) {
            p.setAge(p.getAge() + 1);
        }
    }
}
