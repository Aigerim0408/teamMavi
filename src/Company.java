import java.util.Scanner;

public class Company {
    private String nameOfCompany;
    private String fieldOfActivity;
   private String address;
    private String foundationDate;
    private int numberOfEmployees;

    public Company() {

    }

    public Company(String nameOfCompany, String fieldOfActivity,String address, String foundationDate,
                   int numberOfEmployees) {
        this.nameOfCompany = nameOfCompany;
        this.fieldOfActivity = fieldOfActivity;
        this.address = address;
        this.foundationDate = foundationDate;
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public String getFieldOfActivity() {
        return fieldOfActivity;
    }

    public void setFieldOfActivity(String fieldOfActivity) {
        this.fieldOfActivity = fieldOfActivity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(String foundationDate) {
        this.foundationDate = foundationDate;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    public void method (){
        Scanner scanner = new Scanner(System.in);
         setNameOfCompany(scanner.nextLine());
        setFieldOfActivity(scanner.nextLine());
        setAddress(scanner.nextLine());
        setFoundationDate(scanner.nextLine());
        setNumberOfEmployees(scanner.nextInt());
        System.out.println("Company: " +"\n"+
                "name of Company:" + getNameOfCompany()+ "\n" +
                "fieldOfActivity: " + getFieldOfActivity() + "\n" +
                "Address" + getAddress() + "foundation Date: " + getFoundationDate() + "\n" +
                "numberOfEmployees: " + getNumberOfEmployees());
    }

}
