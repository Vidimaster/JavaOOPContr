import java.util.List;

public class Dog extends Pets{
    static int counter = 0;

    public Dog(String name, String dateOfBirth, List<String> commands) {
        super(name, dateOfBirth, commands);
        counter = counter + 1;
        counterPets = counterPets + 1;
    }

    public static int getCounter() {
        return counter;
    }
}
