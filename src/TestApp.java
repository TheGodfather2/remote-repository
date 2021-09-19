import java.util.*;
import java.util.stream.Collectors;

public class TestApp {
    public static void main(String[] args) {
        Map<Integer, Employee> people = new TreeMap<>();
        people.put(Person.getID(), new Employee("Jakub Słomiński",23,4000));
        people.put(Person.getID(), new Employee("Magda Kulasiewicz",21,2000));
        people.put(Person.getID(), new Employee("Tomasz Słomiński",55,14000));
        people.values().forEach(System.out::println);
        people.get(2).working();
        System.out.println("Prace wykona dziś " + typePersonToRaport(people).getName());
        ArrayList<String> list= new ArrayList<>();
        list.add("Kuba");
        list.add("Magda");
        list.add("Tomasz");
        list.remove("Magda");
        System.out.println(list);

        System.out.println(Person.getID());

    }
    public static Employee typePersonToRaport(Map<Integer, Employee> map){
        List<Employee> objects = new ArrayList<>(map.values());
        return objects.get(new Random().nextInt(map.values().size()));

    }
}
