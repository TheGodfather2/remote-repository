import java.util.Objects;

public class Employee extends Person {
    public int salary;

    public Employee(String name, int age, int salary){
        super(name, age);
        this.salary=salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void working() {
        System.out.println(getName() + ", ja wypełniam raport");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary);
    }

    @Override
    public String toString() {
        return super.toString() + ", wynagrodzenie: " +salary;
    }
}
