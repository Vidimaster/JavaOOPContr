import java.util.List;

public class PackAnimals extends Animal{
    static int counterPackAnimals;
    public PackAnimals(String name, String dateOfBirth, List<String> commands) {
        super(name, dateOfBirth, commands);

    }


    public static int getCounterPackAnimals() {
        return counterPackAnimals;
    }


}
