//package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Get the average salary of each department using Stream()
class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";

    
    }
    
}


public class QStream1 {

    public static void main(String[] args) {
        
        List<Employee> employees = Arrays.asList(new Employee("Ryan", "IT", 117000),
                                                new Employee("John", "HR", 100000),
                                                new Employee("Mike", "Bank", 120000),
                                                new Employee("Sara", "HR", 90000),
                                                new Employee("David", "IT", 130000),
                                                new Employee("Jane", "Bank", 95000),
                                                new Employee("Tom", "IT", 110000),
                                                new Employee("Linda", "HR", 105000));


        Map<String, Double> avgSalary = employees.stream().collect(Collectors.groupingBy(n -> ((Employee) n)
                                                            .getDepartment(), Collectors.averagingInt(n -> ((Employee) n).getSalary())));

        // get salaries for employees in HR department
        Map<String, Integer> forChennai = employees.stream().filter(n -> n.getDepartment().equals("HR"))
                                                            .collect(Collectors.toMap(Employee::getDepartment, Employee::getSalary));

        Map<String, Long> totalCount = employees.stream().collect(Collectors.groupingBy(Employee:: getDepartment, Collectors.counting()));

        totalCount.forEach((dept, sal) -> System.out.println(dept + " : " + sal));

        avgSalary.forEach((dept, avgSal) -> System.out.println(dept + ": "+avgSal));
    
        //forChennai.forEach((dept, sal) -> System.out.println(dept + ": "+ sal));
    }
    
}
