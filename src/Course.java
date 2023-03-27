import java.util.Scanner;

public class Course extends Company {
    private String nameOfCourse;
    public Course(){

    }
    public Course(String nameOfCourse) {
        this.nameOfCourse= nameOfCourse;

    }

    public Course(String nameOfCompany, String fieldOfActivity,String address, String foundationDate,
                  int numberOfEmployees, String nameOfCourse) {
        super(nameOfCompany, fieldOfActivity, address, foundationDate, numberOfEmployees);
        this.nameOfCourse = nameOfCourse;
    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public void Method1(){
        Scanner sc = new Scanner(System.in);
        setNameOfCourse(sc.nextLine());
        setAddress(sc.nextLine());
        setFoundationDate(sc.nextLine());
        System.out.println("Course: " +
                "name Of Course: " + getNameOfCourse() + "\n" +
                "Course Address: " + getAddress() + "\n" + "Foundation date: "
                + getFoundationDate());
    }

}



