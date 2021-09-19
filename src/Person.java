import java.util.Objects;

public class Person implements Work, Comparable<Person>{
    private static int ID=1;
    private String name;
    private int age;
    private final int numberID;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.numberID= ID;
        ID++;
    }

    public static int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "ID: "+ numberID +", imie i nazwisko: " + name +", wiek: " +age;
    }

    @Override
    public void working() {
        //TODO
    }

    public int getNumberID() {
        return numberID;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.numberID, o.numberID);
    }
}
