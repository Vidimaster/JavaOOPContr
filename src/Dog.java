import java.util.List;

public class Dog extends Pets{
    static int counter = 0;

    public Dog(String name, String dateOfBirth, List<String> commands) {
        super(name, dateOfBirth, commands);
        counter = Counter.AddCounter(counter);
        counterPets = Counter.AddCounter(counterPets);
    }

    public static int getCounter() {
        return counter;
    }
}
