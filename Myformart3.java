import java.util.Scanner;
public class Myformart3{

    String firstname;
    int age;
    String gender;
    String clan;

    public String getfirstname(){
        return firstname;
    }
    public int getage() {
        return age;
    }
    public String getgender(){
        return gender;
    }
    public String getclan(){
        return clan;
    }
    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setage(int age) {
        this.age = age;
    }
    public void setgender(String gender) {
        this.gender = gender;
    }
    public void setclan(String clan) {
        this.clan = clan;
    }

    public static void main(String[] arg){
    Myformart3 biodata;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your firstname: ");
    String firstname = scanner.nextLine();
    System.out.println("My name is " + firstname);

    System.out.println("Enter your gender: ");
    String gender = scanner.nextLine();
    System.out.println("I am a " + gender );

    System.out.println("Enter your clan: ");
    String clan = scanner.nextLine();
    System.out.println("My clan is a " + clan);

    System.out.println("Enter your age: ");
    int age = scanner.nextInt();
    System.out.println("I am " + age + " years");

    
    



    

    } 
    

}