import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private int salary;
    public Employee(int id, String name, int salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    public String toString()
    {
        return id + ": " + name + " - " +salary;
    }
}

class main
{
    public static void main(String[] a)
    {
        List<Employee> e = new ArrayList<Employee>();
        e.add(new Employee(1,"vageesha", 25000));
        e.add(new Employee(2, "rachita", 19000));
        e.add(new Employee(3, "divya", 11000));
        e.add(new Employee(4, "jyoti", 72000));
        e.add(new Employee(5, "jasleen", 32000));
        Collections.sort(e, new Comparator<Employee>()
        {
            @Override
            public int compare(Employee o1, Employee o2)
            {
                if(o1.getSalary() > o2.getSalary())
                {
                    return -1;
                }
                else if(o1.getSalary() < o2.getSalary())
                {
                    return 1;
                }
                return 0;
            }
        });
        for (Employee employee: e)
        {
            System.out.println(employee);
        }

    }
}

