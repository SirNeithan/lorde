import java.util.Scanner;

abstract class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void displayDetails();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() > 0) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be a positive integer.");
        }
    }
}

class CompanyEmployee extends Employee {
    private int employeeId;

    public CompanyEmployee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    @Override
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }
}

class Company {
    private String companyName;
    private int yearFounded;

    public Company(String companyName, int yearFounded) {
        this.companyName = companyName;
        this.yearFounded = yearFounded;
    }

    public void displayCompanyDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Year Founded: " + yearFounded);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter company name:");
            String companyName = scanner.nextLine();

            System.out.println("Enter year founded:");
            int yearFounded = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            Company myCompany = new Company(companyName, yearFounded);

            System.out.println("Enter employee name:");
            String employeeName = scanner.nextLine();

            System.out.println("Enter employee age:");
            int employeeAge = scanner.nextInt();

            System.out.println("Enter employee ID:");
            int employeeId = scanner.nextInt();

            CompanyEmployee employee = new CompanyEmployee(employeeName, employeeAge, employeeId);

            // Display company and employee details
            System.out.println("\nCompany Details:");
            myCompany.displayCompanyDetails();

            System.out.println("\nEmployee Details:");
            employee.displayDetails();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
