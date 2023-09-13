package homeworks.homework1.processors;

import homeworks.homework1.Person;
import homeworks.homework1.PersonProcessor;

public class RemoveFriendProcessor implements PersonProcessor {
    @Override
    public void process(Person person) {
        person.setFriend(null);
    }
}
