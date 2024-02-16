import java.util.List;

public class Cat extends Pets{
    static int counter = 0;

    public Cat(String name, String dateOfBirth, List<String> commands) {
        super(name, dateOfBirth, commands);
        counterPets = Counter.AddCounter(counterPets);
        counter = Counter.AddCounter(counter);
    }

    public static int getCounter() {
        return counter;
    }

}
