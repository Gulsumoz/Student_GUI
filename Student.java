import java.util.ArrayList;

public class Student {

    private ArrayList<Student> newStudents = new ArrayList<Student>(10);
    private String FirstName;
    private String LastName;
    private String Major;
    private String GPA;
    private String UIN;
    private String NetID;
    private  String Age;
    private  String Gender;

    public Student (){

    }

    public  Student(String FirstName, String LastName, String Major, String GPA, String UIN, String NetID, String Age, String Gender) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Major = Major;
        this.GPA =GPA;
        this.UIN = UIN;
        this.NetID = NetID;
        this.Age = Age;
        this.Gender =Gender;
    }

    public ArrayList<Student> getNewStudents() {
        return newStudents;
    }

    public void setNewStudents(ArrayList<Student> newStudents) {
        this.newStudents = newStudents;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    public String getGPA() {
        return GPA;
    }

    public void setGPA(String GPA) {
        this.GPA = GPA;
    }

    public String getUIN() {
        return UIN;
    }

    public void setUIN(String UIN) {
        this.UIN = UIN;
    }

    public String getNetID() {
        return NetID;
    }

    public void setNetID(String netID) {
        NetID = netID;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}

