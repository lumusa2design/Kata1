package is2.ulpgc.kata;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private final LocalDate birth;

    public Person(String name, LocalDate birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public int age(){
        return Period.between(birth, LocalDate.now()).getYears();
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}
