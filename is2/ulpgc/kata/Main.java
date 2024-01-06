package is2.ulpgc.kata;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Luis", LocalDate.of(1999,10,28));
        System.out.println(person);
    }
}
