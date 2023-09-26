package homeworks.homework1.task2.processors;

import homeworks.homework1.task2.Person;
import homeworks.homework1.task2.PersonProcessor;

public class SwapParentsProcessor implements PersonProcessor {
    @Override
    public void process(Person person) {
        Person motherBefore = person.getMother();
        person.setMother(person.getFather());
        person.setFather(motherBefore);
    }
}
