import java.util.Scanner;

public class Student extends Company {
    private String studentName;
    private int studentAge;


    public Student() {
    }

    public Student(String studentName, int studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public Student(String nameOfCompany, String fieldOfActivity, String address,
                   String foundationDate, int numberOfEmployees, String studentName, int studentAge) {
        super(nameOfCompany, fieldOfActivity, address, foundationDate, numberOfEmployees);
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public void methodStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        setStudentName(sc.nextLine());
        System.out.println("Address");
        setAddress(sc.nextLine());
        System.out.println("Age");
        setStudentAge(sc.nextInt());
        System.out.println("Student: " + "\n"+
                "Student Name : " + getStudentName() + "\n"  + "Recent Address: " + getAddress()
        + "\n" + "Age: " + getStudentAge());
    }
}
