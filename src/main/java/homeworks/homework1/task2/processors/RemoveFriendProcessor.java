package homeworks.homework1.task2.processors;

import homeworks.homework1.task2.Person;
import homeworks.homework1.task2.PersonProcessor;

public class RemoveFriendProcessor implements PersonProcessor {
    @Override
    public void process(Person person) {
        person.setFriend(null);
    }
}
