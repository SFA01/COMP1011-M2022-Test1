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
    private int AverageGrade;
    private String Major;

// Constructors
    public Student(int studentNumber, String firstName, String lastName, String telephone, String address, String province, int averageGrade, String major) {
       setStudentNumber(studentNumber);
        setFirstName(firstName);
        setLastName(lastName);
        setTelephone(telephone);
        setAddress(address);
        setProvince(province);
        setAverageGrade(averageGrade);
        setMajor(major);
    }

    //Getters and Setters

    public int getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.StudentNumber = studentNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        this.Telephone = telephone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        this.Province = province;
    }

    public int getAverageGrade() {
        return AverageGrade;
    }

    public void setAverageGrade(int averageGrade) {
        this.AverageGrade = averageGrade;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        this.Major = major;
    }


}






