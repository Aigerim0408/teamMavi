import java.util.Scanner;

public class Group extends Company {
    private String groupName;
    private int numberOfStudents;

    public Group() {
    }

    public Group(String groupName, int numberOfStudents) {
        this.groupName = groupName;
        this.numberOfStudents = numberOfStudents;
    }

    public Group(String nameOfCompany, String fieldOfActivity, String address, String foundationDate, int numberOfEmployees, String groupName, int numberOfStudents) {
        super(nameOfCompany, fieldOfActivity, address, foundationDate, numberOfEmployees);
        this.groupName = groupName;
        this.numberOfStudents = numberOfStudents;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void MethodGroup() {
        Scanner sc = new Scanner(System.in);
        setGroupName(sc.nextLine());
        setNumberOfStudents(sc.nextInt());
        System.out.println("Group: " +
                "Group Name: " + getGroupName() + "\n" +
                "number of Students: " + getNumberOfStudents());

    }
}
