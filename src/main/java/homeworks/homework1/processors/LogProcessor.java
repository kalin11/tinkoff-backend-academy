package homeworks.homework1.processors;

import homeworks.homework1.Person;
import homeworks.homework1.PersonProcessor;

public class LogProcessor implements PersonProcessor {
    @Override
    public void process(Person person) {
        System.out.println("changed");
        // testing

//        System.out.println("changed " + person.getMother() + "; " + person.getFather() + " ");
//        System.out.print("mom " + person.getMother() + " ");
//        System.out.print("dad " + person.getFather() + "\n");

    }
}
