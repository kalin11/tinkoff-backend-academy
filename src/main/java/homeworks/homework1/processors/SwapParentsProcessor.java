package homeworks.homework1.processors;

import homeworks.homework1.Person;
import homeworks.homework1.PersonProcessor;

public class SwapParentsProcessor implements PersonProcessor {
    @Override
    public void process(Person person) {
        Person temp = person.getMother();
        person.setMother(person.getFather());
        person.setFather(temp);
    }
}
