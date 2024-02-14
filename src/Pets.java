import java.util.List;

public class Pets extends Animal{
    static int counterPets;

    public Pets(String name, String dateOfBirth, List<String> commands) {
        super(name, dateOfBirth, commands);
    }



    public static int getCounterPets() {
        return counterPets;
    }


}
