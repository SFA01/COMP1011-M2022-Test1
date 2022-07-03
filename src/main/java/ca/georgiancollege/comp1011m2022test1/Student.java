package ca.georgiancollege.comp1011m2022test1;

public class Student {

    // Private Instance Members
    //Here I am putting the student class attributes for part 1
    private int StudentNumber;
    private String FirstName;
    private String LastName;
    private String Telephone;
    private String Address;
    private String Province;
    private String AverageGrade;
    private String Major;

// Constructors
    public Student(int studentNumber, String firstName, String lastName, String telephone, String address, String province, String averageGrade, String major) {
        StudentNumber = studentNumber;
        FirstName = firstName;
        LastName = lastName;
        Telephone = telephone;
        Address = address;
        Province = province;
        AverageGrade = averageGrade;
        Major = major;
    }

    //Getters and Setters

    public int getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        StudentNumber = studentNumber;
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

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public String getAverageGrade() {
        return AverageGrade;
    }

    public void setAverageGrade(String averageGrade) {
        AverageGrade = averageGrade;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }
}






