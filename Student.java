import java.util.Scanner;
public class Student {
    String name;
    String details;
    int age;
    String residance;
    String status;
    String gender;

   
    public Student(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getResidance() {
        return residance;
    }
    public void setResidance(String residance) {
        this.residance = residance;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Student(String name, String details, int age, String residance, String status) {
        this.name = name;
        this.details = details;
        this.age = age;
        this.residance = residance;
        this.status = status;
    }
    public static void main(String[] args) {

        try{
            int num1=3;
            int num2=0;
            int answer=num1/num2;
            System.out.println(answer);
        }catch(Exception e){
            System.out.println(e.getMessage().toString());
        }
        Scanner scanStudent = new Scanner(System.in);
        System.out.println("This is my student information as below;");

        System.out.println("Enter your name below");
        String name = scanStudent.nextLine();
        System.out.println("My name is " + name);

        System.out.println("Enter either 'M' or 'F' here for gender:");
        String gender = scanStudent.nextLine();
        System.out.println("I am "+ gender);

        System.out.println("Your age please!!");
        int age = scanStudent.nextInt();
        System.out.println("I am " + age + " " + "years old");

        System.out.println("What is your marital status? Enter either 'single' or 'married' below;");
        String status = scanStudent.nextLine();
        System.out.println("I am " + status);

        System.out.println("Your area of residence please;");
        String residance = scanStudent.nextLine();
        System.out.println("I stay around the areas of " + residance);

        System.out.println("I:");
        String dorm = scanStudent.nextLine();
        System.out.println("belong to " + dorm);

        System.out.println("I have");
        String period = scanStudent.nextLine();
        System.out.println("a " + period);
    }
public class Faculty extends Student{
String subject;
String period;
String lecturer;
String dorm;
public String getSubject() {
    return subject;
}
public void setSubject(String subject) {
    this.subject = subject;
}
public String getPeriod() {
    return period;
}
public void setPeriod(String period) {
    this.period = period;
}
public String getLecturer() {
    return lecturer;
}
public void setLecturer(String lecturer) {
    this.lecturer = lecturer;
}
public String getDorm() {
    return dorm;
}
public void setDorm(String dorm) {
    this.dorm = dorm;
}
public Faculty(String gender, String subject, String period, String lecturer, String dorm) {
    super(gender);
    this.subject = subject;
    this.period = period;
    this.lecturer = lecturer;
    this.dorm = dorm;
}
public Faculty(String name, String details, int age, String residance, String status, String subject, String period,
        String lecturer, String dorm) {
    super(name, details, age, residance, status);
    this.subject = subject;
    this.period = period;
    this.lecturer = lecturer;
    this.dorm = dorm;
}

}


}

