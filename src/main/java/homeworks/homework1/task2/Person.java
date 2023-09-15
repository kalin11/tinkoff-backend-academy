package homeworks.homework1.task2;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
@RequiredArgsConstructor
public class Person {
    private Person mother;
    private Person father;
    private Person friend;
    @NonNull
    private String name;

    @Override
    public String toString() {
        return Optional.of(this.name).orElse("");
    }
}
