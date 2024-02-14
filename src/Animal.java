import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

abstract class Animal {
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


        // Sorting
        public int compare(Animal a,Animal b)
        {
            return a.DateOfBirth.compareTo(b.DateOfBirth);
        }
    }

}


