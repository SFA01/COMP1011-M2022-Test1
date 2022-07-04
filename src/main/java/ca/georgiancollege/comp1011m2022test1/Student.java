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

    //Here I added the class that have a constructor that validates all of the arguments, get and set methods for part 1
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

    //Getters and Setters for part 1

    public int getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(int studentNumber) {

        //Here I am doing the first validation of part 1
        if(studentNumber >= 200034000){
            this.StudentNumber = studentNumber;
        }
        else {
            throw new IllegalArgumentException("Please, enter a valid student number");

        }
    }

    //Here I am doing the second validation for part 1
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {

        if(firstName.length() > 1) {
            this.FirstName = firstName;

        }
            else{
                throw new IllegalArgumentException("Please, make sure it is more than one character");
            }
        }



//Here I am doing the 3 validation for the part 1
    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {


        if(lastName.length() > 1){
            this.LastName = lastName;
        }

        else{
            throw new IllegalArgumentException("Please, make sure it is more than one character");

        }
    }


    //Here is the 4 validation for part 1
    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        this.Telephone = telephone;
    }

    //Here I am doing the 5 validation for part 1
    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {

        if(address.length() > 6){
            this.Address = address;
        }

        else{
            throw new IllegalArgumentException("Please, make sure it is more than six character");
        }
    }

    //Here I am doing the 6 validation for part 1
    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {


      // if((province = "AB"), (province = "BC"), (province = "MB"), (province = "NB"), (province = "NL"), (province = "NS"), (province = "NT"), (province = "NU"), (province = "ON"), (province = "PE"), (province = "QC"), (province = "SK"), (province = "YT")){
            this.Province = province;
      //  }

        //else{
           // throw new IllegalArgumentException("Please, enter a province that it is on the list");
       // }
    }

    //Here I am doing the 7 validation for part 1
    public int getAverageGrade() {
        return AverageGrade;
    }

    public void setAverageGrade(int averageGrade) {


        if(averageGrade < 100 && averageGrade > 0){
            this.AverageGrade = averageGrade;
        }

        else{
            throw new IllegalArgumentException("Please, enter a average grade");
        }
    }

    //Here I am doing the 8 validation for part 1
    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        this.Major = major;

        if(major.length() > 5){
            this.Major = major;
        }

        else{
            throw new IllegalArgumentException("Please, enter major more than 5");
        }
    }


}






