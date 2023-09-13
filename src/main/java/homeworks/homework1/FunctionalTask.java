package homeworks.homework1;

import homeworks.homework1.processors.LogProcessor;
import homeworks.homework1.processors.RemoveFriendProcessor;
import homeworks.homework1.processors.SwapParentsProcessor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalTask {
    public static void main(String[] args) {
        Person mom1 = new Person("mom1");
//        Person mom1 = null;
        Person mom2 = new Person("mom2");
        Person mom3 = new Person("mom3");
        Person dad1 = new Person("dad1");
        Person dad2 = new Person("dad2");
        Person dad3 = new Person("dad3");
//        Person dad3 = null;
        Person p1 = new Person("p1");
        Person p2 = new Person("p2");
        Person p3 = new Person("p3");
        p1.setFather(dad1);
        p1.setMother(mom1);
        p2.setFather(dad2);
        p2.setMother(mom2);
        p3.setFather(dad3);
        p3.setMother(mom3);
        List<Person> list = List.of(p1, p2, p3);
        process(list);
        System.out.println(list);
//        process(p1);
//        System.out.println(p1);
    }

    private static void process(List<Person> people) {
        List<PersonProcessor> list = List.of(
                new SwapParentsProcessor(),
                new RemoveFriendProcessor(),
                new LogProcessor()
        );

        people.forEach(person -> {
            list.forEach(personProcessor -> personProcessor.process(person));
        });
    }

    private static void process(Person person) {
        List<PersonProcessor> list = List.of(
                new SwapParentsProcessor(),
                new RemoveFriendProcessor(),
                new LogProcessor()
        );

        list.forEach(personProcessor -> personProcessor.process(person));
    }
}
