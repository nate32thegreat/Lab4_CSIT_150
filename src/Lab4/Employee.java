package Lab4;

public class Employee implements Rules {
    public String name = "";
    public double salary = 0;

    public Employee()
    {
        name = "";
        salary = 0;
    }

    public Employee (String newName, double newSalary)
    {
        name = newName;
        salary = newSalary;

    }

    public String getName() {
        return name;
    }

    public String getSalary() {
        String display = String.format("$%.2f",salary);
        return display;
    }

    public String toString()
    {
        String display = String.format(name + " has a salary of " + getSalary());

        return display;
    }
}


