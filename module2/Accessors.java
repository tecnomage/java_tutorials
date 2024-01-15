package module2;

// Define a class with private data and public methods (encapsulation)
 class Employee {
    // Private data
    private String name;
    private int id;

    // Public methods to access and modify the private data
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

// Main class
public class Accessors {
    public static void main(String[] args) {
        // Create an object of the Employee class
        Employee myEmployee = new Employee();

        // Use the public methods to access and modify the private data
        myEmployee.setName("John Doe");
        myEmployee.setId(123);

        System.out.println("Employee Name: " + myEmployee.getName());
        System.out.println("Employee ID: " + myEmployee.getId());
    }
}