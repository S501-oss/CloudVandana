import java.util.ArrayList;
import java.util.List;

class Employee {
  private int id;
  private String name;
  private double salary;

  public Employee(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public void displayDetails() {
    System.out.println("Employee ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Salary: $" + salary);
    System.out.println("-------------------");
  }

  public static void main(String[] args) {

    List<Employee> employees = new ArrayList<>();

    Employee emp1 = new Employee(1, "shaik sharief", 50000.0);
    Employee emp2 = new Employee(2, "shaik moulali", 60000.0);
    Employee emp3 = new Employee(3, "korne naga gopi", 55000.0);

    employees.add(emp1);
    employees.add(emp2);
    employees.add(emp3);

    System.out.println("Employee Details:");
    for (Employee emp : employees) {
      emp.displayDetails();
    }
  }
}