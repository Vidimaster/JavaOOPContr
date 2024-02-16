import java.util.List;

public class Hamster extends Pets{
    static int counter = 0;

    public Hamster(String name, String dateOfBirth, List<String> commands) {
        super(name, dateOfBirth, commands);
        counter = Counter.AddCounter(counter);
        counterPets = Counter.AddCounter(counterPets);
    }

    public static int getCounter() {
        return counter;
    }
}
