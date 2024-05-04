
class Employee {
    private int id;
    private String name;
    private String deptName;
    private double salary;
    private static int objectCount = 0; // Static member to keep track of object count

    // Default constructor
    public Employee() {
        this.id = 0;
        this.name = "Unknown";
        this.deptName = "Unknown";
        this.salary = 0.0;
        objectCount++;
    }

    // Parameterized constructor
    public Employee(int id, String name, String deptName, double salary) {
        this(); // Invoke the default constructor to avoid code duplication
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
        displayInfo();
        System.out.println("Object count: " + objectCount);
    }

    // Display employee information
    public void displayInfo() {
        System.out.println("\nEmployee Information:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + deptName);
        System.out.println("Salary: $" + salary);
    }

    // Static method to get the object count
    public static int getObjectCount() {
        return objectCount;
    }
}


public class EmployeeTest {

        public static void main(String[]args) {
        // Create objects using the parameterized constructor
        Employee employee1 = new Employee(101, "John Doe", "IT", 50000.0);
        Employee employee2 = new Employee(102, "Jane Smith", "HR", 60000.0);

        // Display the total object count
        System.out.println("\nTotal Objects Created: " + Employee.getObjectCount());
    }
    }

