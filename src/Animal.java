import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

abstract class Animal  implements AutoCloseable{
    private static final SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
    protected String name;
    protected String DateOfBirth;

    protected  List<String> Commands;

    public Animal(String name, String dateOfBirth, List<String> commands) {
        this.name = name;
        this.DateOfBirth = dateOfBirth;
        this.Commands = new ArrayList<>(commands);

    }

    public void addNewCommands(String newc) {
        this.Commands.add(newc);
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public List<String> getCommands() {
        return Commands;
    }

    @Override
    public String toString() {
        String ClassType = String.valueOf(getClass());
        return "Name: " + name  +
                " | DateOfBirth: " + DateOfBirth + " | " + ClassType ;
    }

    static class Sortbyname implements Comparator<Animal> {


        public int compare(Animal a,Animal b)
        {

            try {
                return formatter.parse(a.DateOfBirth).compareTo(formatter.parse(b.DateOfBirth));
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }

        }
    }


}


