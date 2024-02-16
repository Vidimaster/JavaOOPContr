
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.Map;

public class Main {
    enum AnimalEnum {
        КОШКА,
        СОБАКА,
        ХОМЯК,
        ЛОШАДЬ,
        ОСЁЛ,
        ВЕРБЛЮД;

        public static boolean contains(String s) {
            for (AnimalEnum choice : values())
                if (choice.name().equals(s))
                    return true;
            return false;
        }


    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        ArrayList<PackAnimals> multiTypeList1 = new ArrayList<>();
        ArrayList<Pets> multiTypeList2 = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        map.put("Camel", Arrays.asList("Walk", "Carry Load"));
        map.put("Horse", Arrays.asList("Strut", "Run"));
        map.put("Donkey", Arrays.asList("Carry Load"));
        map.put("Dog", Arrays.asList("Bark", "Paw"));
        map.put("Cat", Arrays.asList("Yell", "Jump"));
        map.put("Hamster", Arrays.asList("Sit", "Sleep"));

        multiTypeList1.add(new Camel("John the Camel", "13.02.2024", map.get("Camel")));
        multiTypeList1.add(new Camel("Burro", "13.02.2021", map.get("Camel")));
        multiTypeList1.add(new Horse("Storm", "05.02.2020", map.get("Horse")));
        multiTypeList1.add(new Donkey("Don", "08.01.2020", map.get("Donkey")));
        multiTypeList1.add(new Camel("Dune", "13.02.2022", map.get("Camel")));
        multiTypeList2.add(new Dog("Paul", "11.02.2019", map.get("Dog")));
        multiTypeList2.add(new Cat("Skimmy", "05.02.2021", map.get("Cat")));
        multiTypeList2.add(new Dog("Bob", "12.02.2023", map.get("Dog")));
        multiTypeList2.add(new Hamster("Hammy", "13.02.2021", map.get("Hamster")));



        boolean menu = true;
        List<Animal> list;
        int j = 0;
        int choice = 0;
        String line = "";
        while (menu) {

            System.out.println("Enter command: \n 1 - Show all animals \n 2 - Add new animal \n 3 - Show animal commands \n 4 - Add a new command to an animal \n 5 - Show all animals sorted by date of birth \n 6 - Show animal counters \n 7 - Exit");

            String text = scanner.nextLine();

            switch (text) {

                case "1":
                    System.out.println("Pack animals: ");
                    multiTypeList1.forEach(System.out::println);
                    System.out.print('\n');
                    System.out.println("Pets: ");
                    multiTypeList2.forEach(System.out::println);
                    break;
                case "2":
                    System.out.println("Choose animal class to add: ");
                    int i = 1;
                    for (AnimalEnum allPetsClass : AnimalEnum.values()) {
                        System.out.println(i + " - " + allPetsClass);
                        i++;
                    }

                    line = scanner.nextLine().toUpperCase();

                    //Pets.counterPets += 1; --This throws exception for counter outside try-catch

                    String line_name = "";
                    String line_dob = "";
                    switch (line) {
                        case "1":
                            System.out.println("Enter pet's name");
                            line_name = scanner.nextLine();
                            System.out.println("Enter pet's date of birth dd.mm.yyyy");
                            line_dob = scanner.nextLine();
                            try (Cat objnew = new Cat(line_name, line_dob, map.get("Cat"))) {
                                multiTypeList2.add(objnew);
                                System.out.println(line_name + " was added to animal list.");
                            }
                            break;
                        case "2":
                            System.out.println("Enter pet's name");
                            line_name = scanner.nextLine();
                            System.out.println("Enter pet's date of birth dd.mm.yyyy");
                            line_dob = scanner.nextLine();
                            try (Dog objnew = new Dog(line_name, line_dob, map.get("Dog"))) {
                                multiTypeList2.add(objnew);
                                System.out.println(line_name + " was added to animal list.");
                            }
                            break;
                        case "3":
                            System.out.println("Enter pet's name");
                            line_name = scanner.nextLine();
                            System.out.println("Enter pet's date of birth dd.mm.yyyy");
                            line_dob = scanner.nextLine();
                            try (Hamster objnew = new Hamster(line_name, line_dob, map.get("Hamster"))) {
                                multiTypeList2.add(objnew);
                                System.out.println(line_name + " was added to animal list.");
                            }
                            break;
                        case "4":
                            System.out.println("Enter pet's name");
                            line_name = scanner.nextLine();
                            System.out.println("Enter pet's date of birth dd.mm.yyyy");
                            line_dob = scanner.nextLine();
                            try (Horse objnew = new Horse(line_name, line_dob, map.get("Horse"))) {
                                multiTypeList1.add(objnew);
                                System.out.println(line_name + " was added to animal list.");
                            }
                            break;
                        case "5":
                            System.out.println("Enter pet's name");
                            line_name = scanner.nextLine();
                            System.out.println("Enter pet's date of birth dd.mm.yyyy");
                            line_dob = scanner.nextLine();
                            try (Donkey objnew = new Donkey(line_name, line_dob, map.get("Donkey"))) {
                                multiTypeList1.add(objnew);
                                System.out.println(line_name + " was added to animal list.");
                            }
                            break;
                        case "6":
                            System.out.println("Enter pet's name");
                            line_name = scanner.nextLine();
                            System.out.println("Enter pet's date of birth dd.mm.yyyy");
                            line_dob = scanner.nextLine();
                            try (Camel objnew = new Camel(line_name, line_dob, map.get("Camel"))) {
                                multiTypeList1.add(objnew);
                                System.out.println(line_name + " was added to animal list.");
                            }
                            break;
                        default:
                            System.out.println("No such class");
                    }

                    break;
                case "3":

                    list = CombineLists(multiTypeList1, multiTypeList2);

                    j = 0;
                    for (Animal leave : list) {

                        j++;
                        System.out.print(j);
                        System.out.print(" - " + leave.name + " | " + leave.getClass() + '\n');
                    }
                    System.out.println("Choose animal to see its commands");
                    choice = Integer.parseInt(scanner.nextLine()) - 1;
                    System.out.println(list.get(choice).getName() + " can do the following commands: ");
                    System.out.println(list.get(choice).getCommands());
                    break;
                case "4":

                    list = CombineLists(multiTypeList1, multiTypeList2);
                    j = 0;
                    for (Animal leave : list) {
                        j++;
                        System.out.print(j);
                        System.out.print(" - " + leave.name + " | " + leave.getClass() + '\n');
                    }
                    System.out.println("Choose animal to add to its commands");
                    choice = Integer.parseInt(scanner.nextLine()) - 1;
                    System.out.println("Enter command to add");
                    line = scanner.nextLine();
                    list.get(choice).addNewCommands(line);
                    System.out.println(list.get(choice).getName() + " can now do the following commands: ");
                    System.out.println(list.get(choice).getCommands());
                    break;
                case "5":
                    list = CombineLists(multiTypeList1, multiTypeList2);
                    Collections.sort(list, new Animal.Sortbyname());
                    list.forEach(System.out::println);
                    break;
                case "6":
                    System.out.println("Total number of Animals: " + (PackAnimals.getCounterPackAnimals() + Pets.getCounterPets()));
                    System.out.print('\n');
                    System.out.println("Total number of Pack Animals: " + PackAnimals.getCounterPackAnimals());
                    System.out.println("Total number of Pets: " + Pets.getCounterPets());
                    System.out.print('\n');
                    System.out.println("Total number of Camels: " + Camel.getCounter());
                    System.out.println("Total number of Donkeys: " + Donkey.getCounter());
                    System.out.println("Total number of Horses: " + Horse.getCounter());
                    System.out.println("Total number of Dogs: " + Dog.getCounter());
                    System.out.println("Total number of Hamsters: " + Hamster.getCounter());
                    System.out.println("Total number of Cats: " + Cat.getCounter());
                    break;
                case "7":
                    System.out.println("Exit");
                    menu = false;
                    break;
            }
        }

    }

    public static List<Animal> CombineLists(ArrayList<PackAnimals> multiTypeList1, ArrayList<Pets> multiTypeList2) {
        List<Animal> list = new ArrayList<>(multiTypeList1);
        List<Animal> list2 = new ArrayList<>(multiTypeList2);
        list.addAll(list2);
        return list;
    }


}

