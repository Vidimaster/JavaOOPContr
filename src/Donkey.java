import java.util.Collections;
import java.util.List;

public class Donkey extends PackAnimals{
   static int counter = 0;

    public Donkey(String name, String dateOfBirth, List<String> commands) {
        super(name, dateOfBirth, commands);
        counterPackAnimals = Counter.AddCounter(counterPackAnimals);
        counter = Counter.AddCounter(counter);
    }

    public static int getCounter() {
        return counter;
    }


}
